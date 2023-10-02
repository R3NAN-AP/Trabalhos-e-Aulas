package com.example.trabalhomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ItemdoPedido extends AppCompatActivity {

    private EditText edNomeProduto;
    private EditText edCodigoProduto;
    private EditText edDescricaodoProduto;
    private EditText edValordoProduto;

    private Button btCadastrarProduto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemdo_pedido);
        edNomeProduto = findViewById(R.id.edNomeProduto);
        edCodigoProduto = findViewById(R.id.edCodigoProduto);
        edDescricaodoProduto= findViewById(R.id.edDescricaodoProduto);
        edValordoProduto = findViewById(R.id.edValordoProduto);

        btCadastrarProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadastroProduto();
                onRestart();
            }
        });
    }
    private void cadastroProduto(){
        if (edNomeProduto.getText().toString().isEmpty()){
            edNomeProduto.setError("Informe um nome para o produto!");
            return;
        }if (edDescricaodoProduto.getText().toString().isEmpty()){
            edDescricaodoProduto.setError("Informe uma descrição para o Produto!");
            return;
        } if(edValordoProduto.getText().toString().isEmpty()){
            edValordoProduto.setError("Informe um valor para o Produto");
            return;
        }if (edCodigoProduto.getText().toString().isEmpty()){
            edCodigoProduto.setError("Informe um código para o Produto");
            return;
        }
        Item item = new Item();
        item.setCodigo(Integer.parseInt(edCodigoProduto.getText().toString()));
        item.setValor(Integer.parseInt(edValordoProduto.getText().toString()));
        item.setDescricao(edDescricaodoProduto.getText().toString());
        item.setNome(edNomeProduto.getText().toString());

        ControllerItem.getInstanciaItem().salvarItens(item);
        finish();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(ItemdoPedido.this, "O item foi cadastrado com sucesso!", Toast.LENGTH_LONG).show();
    }
}