package com.example.trabalhomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RealizarPedidodeVenda extends AppCompatActivity {
    private Spinner spProduto;
    private Spinner spParcelas;

    private AutoCompleteTextView tvClienteauto;

    private EditText edValorUnitario;
    private EditText edQuantidade;
    private TextView tvNomeCliente;

    private TextView tvErroCliente;

    private TextView tvListaItensPedidos;

    private TextView tvValorTotalPedidos;


    private AutoCompleteTextView tvClienteautomatico;

    private Button btAdicionarProduto;

    private Button btConfirmarPagamento;

    private Button btSalvarPedido;

    private int posicaoSelecionado = 0;

    private RadioGroup rgSistema;

    private RadioButton rbParcelado;
    private RadioButton rbVista;

    private ArrayList<Cliente> cliente;

    private ArrayList<Item> itemAdd;
    private ArrayList<Item> listaItens;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<PedidoVenda> listaQuPedidoVendas;
    private ArrayList<PedidoVenda> listaValPedidoVendas;

    private int qtdTotal;
    private int valorTotal;

    PedidoVenda pedido = new PedidoVenda();

    private String[]vetP = new String[]{"1x","2x","3x","4x","5x","6x","7x","8x","9x","10x","11x","12x"};
    private String[]vetVista = new String[]{"A vista"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_realizar_pedidode_venda);
        tvClienteautomatico= findViewById(R.id.tvClienteautomatico);
        spProduto= findViewById(R.id.spProduto);
        edQuantidade= findViewById(R.id.edQuantidade);
        edValorUnitario= findViewById(R.id.edValorUnitario);
        btAdicionarProduto= findViewById(R.id.btAdicionarProduto);
        tvListaItensPedidos= findViewById(R.id.tvListaItensPedidos);
        rgSistema= findViewById(R.id.rgSistema);
        rbParcelado= findViewById(R.id.rbParcelado);
        rbVista= findViewById(R.id.rbVista);
        tvValorTotalPedidos= findViewById(R.id.tvValorTotalPedidos);
        btSalvarPedido= findViewById(R.id.btSalvarPedido);
        tvErroCliente= findViewById(R.id.tvErroCliente);
        spParcelas= findViewById(R.id.spParcelas);
        tvNomeCliente= findViewById(R.id.tvNomeCliente);
        btConfirmarPagamento= findViewById(R.id.btConfirmarPagamento);

        popularListaClientes();
        carregarProduto();

        btAdicionarProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adicionarProduto();
                informarListaProdutoAdicionados();
            }
        });

        rgSistema.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                carregarPagamento();
            }
        });

        btConfirmarPagamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                informarListaPedidos();
            }
        });

        btSalvarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RealizarPedidodeVenda.this,"Pedido Salvo com Sucesso!",Toast.LENGTH_LONG).show();
                finish();
            }
        });

    }
    public void popularListaClientes(){
        cliente = ControllerCliente.getInstanciaCliente().retornarClientes();
        String[]vetorClientes = new String[cliente.size()+1];
        vetorClientes[0] = "";
        for (int i = 0; i < cliente.size(); i++) {
            Cliente clientes1 = cliente.get(i);
            vetorClientes[i+1] = clientes1.getNome();
        }

        ArrayAdapter adapter = new ArrayAdapter(
                RealizarPedidodeVenda.this,
                android.R.layout.simple_dropdown_item_1line, vetorClientes);

        tvClienteautomatico.setAdapter(adapter);
    }

    private void carregarProduto(){
        itemAdd = ControllerItem.getInstanciaItem().retornarItens();
        String[]vetorItens = new String[listaItens.size()];

        for (int i = 0; i < itemAdd.size(); i++) {
            Item itens1 = itemAdd.get(i);
            vetorItens[i] = itens1.getNome();
        }
        ArrayAdapter adapter = new ArrayAdapter(RealizarPedidodeVenda.this, android.R.layout.simple_dropdown_item_1line, vetorItens);

        spProduto.setAdapter(adapter);
    }

    private void adicionarProduto(){
        String itemSelecionado = spProduto.getSelectedItem().toString();
        int clienteSelecionado = spProduto.getSelectedItemPosition();
        if (clienteSelecionado < 0) {
            Toast.makeText(this, "Um produto deve ser selecionado!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (edQuantidade.getText().toString().isEmpty()) {
            edQuantidade.setError("Uma quantidade deve ser informada!");
            return;
        }
        if (edValorUnitario.getText().toString().isEmpty()) {
            edValorUnitario.setError("Um valor deve ser informado!");
            return;
        }

        pedido.setNomedoItem(itemSelecionado);
        pedido.setQuantidade(Integer.parseInt(edQuantidade.getText().toString()));
        pedido.setValor(Double.parseDouble(edValorUnitario.getText().toString()));
        ControllerPedido.getControlerPedidos().salvarPedidosdeVEnda(pedido);

        Toast.makeText(RealizarPedidodeVenda.this,"Produto" +
                " adicionado com sucesso!",Toast.LENGTH_LONG).show();

        salvarClientesSelecionados();
        salvarQuantidadeTotal();
        salvarValorTotal();
        informarCliente();
        salvarProdutosSelecionados();
    }

    private void informarCliente(){
        String texto = "";
        for (Cliente cliente : ControllerCliente.getInstanciaCliente().retornarClientes()) {
            texto += "Cliente: "+cliente.getNome()+"\n"+
                    "-----------------------------------------\n";
        }
        tvNomeCliente.setText(texto);
    }

    private void salvarClientesSelecionados(){
        listaClientes = ControllerCliente.getInstanciaCliente().retornarClientes();
        String[]vetClientes = new String[listaClientes.size()];

        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente clientes1 = listaClientes.get(i);
            vetClientes[i] = clientes1.getNome();
        }
        ArrayAdapter adapter = new ArrayAdapter(RealizarPedidodeVenda.this, android.R.layout.simple_dropdown_item_1line, vetClientes);

        tvClienteauto.setAdapter(adapter);
    }

    private void salvarProdutosSelecionados(){
        listaItens = ControllerItem.getInstanciaItem().retornarItens();
        String[]vetItens = new String[listaItens.size()];

        for (int i = 0; i < listaItens.size(); i++) {
            Item itens = listaItens.get(i);
            vetItens[i] = itens.getNome();
        }
        ArrayAdapter adapter = new ArrayAdapter(RealizarPedidodeVenda.this, android.R.layout.simple_dropdown_item_1line, vetItens);

        spProduto.setAdapter(adapter);
    }

    private void salvarQuantidadeTotal(){
        listaQuPedidoVendas = ControllerPedido.getControlerPedidos().retornarPedidosdeVenda();
        int[]vetQuantidade = new int[listaQuPedidoVendas.size()];

        for (int i = 0; i < listaQuPedidoVendas.size(); i++) {
            PedidoVenda pedidos = listaQuPedidoVendas.get(i);
            vetQuantidade[i] = pedidos.getQuantidade();
            qtdTotal = vetQuantidade[i] + pedidos.getQuantidade();
        }
    }

    private void salvarValorTotal(){
        listaValPedidoVendas = ControllerPedido.getControlerPedidos().retornarPedidosdeVenda();
        Double[]vetValores = new Double[listaValPedidoVendas.size()];

        for (int i = 0; i < listaValPedidoVendas.size(); i++) {
            PedidoVenda pedidos = listaValPedidoVendas.get(i);
            vetValores[i] = pedidos.getValor();
            valorTotal = (int) (vetValores[i] + pedidos.getValor());
        }
    }

    private void informarListaProdutoAdicionados(){
        String texto = "";
        ArrayList<PedidoVenda> lista = ControllerPedido.getControlerPedidos().retornarPedidosdeVenda();
        for (PedidoVenda pedidos: lista) {
            texto += "Item: "+pedidos.getNomedoItem()+" - Quantidade: "+pedidos.getQuantidade()+" - Valor total: "+pedidos.getQuantidade() * pedidos.getValor()+"\n";
        }
        tvListaItensPedidos.setText(texto);
    }

    private void carregarPagamento(){
        ArrayAdapter adapter = null;
        if (rbParcelado.isChecked()){
            adapter = new ArrayAdapter<>(RealizarPedidodeVenda.this, android.R.layout.simple_dropdown_item_1line, vetP);
        }
        if(rbVista.isChecked()){
            adapter = new ArrayAdapter<>(RealizarPedidodeVenda.this, android.R.layout.simple_dropdown_item_1line, vetVista);
        }
        spParcelas.setAdapter(adapter);
    }

    private void informarListaPedidos(){
        int parcelaSelecionada = 1 + spParcelas.getSelectedItemPosition();
        if(rbParcelado.isChecked()){
            tvValorTotalPedidos.setText("Quantidade de parcelas: "+parcelaSelecionada+"\n"+
                    "Valor das parcelas: "+((qtdTotal * valorTotal)*1.05)/parcelaSelecionada+"\n"+
                    "Valor total do pedido: "+(qtdTotal * valorTotal)*1.05+"\n");
        }else {
            tvValorTotalPedidos.setText("Quantidade de parcelas: "+parcelaSelecionada+"\n"+
                    "Valor das parcelas: "+(qtdTotal*valorTotal)*0.95+"\n"+
                    "Valor total do pedido: "+(qtdTotal * valorTotal)*0.95+"\n");

        }
    }
}
