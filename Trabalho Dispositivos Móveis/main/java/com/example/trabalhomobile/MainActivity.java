package com.example.trabalhomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btCadastrarCliente;
    private Button btCadastrarProduto;

    private Button btRealizarPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btCadastrarCliente = findViewById(R.id.btCadastrarCliente);
        btCadastrarProduto = findViewById(R.id.btCadastrarProduto);
        btRealizarPedido = findViewById(R.id.btRealizarPedido);


        btCadastrarCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadastroCliente();
            }
        });
        btRealizarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                realizarPedido();
            }
        });
        btCadastrarProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadastroProdutos();
            }
        });
    }
    public void cadastroCliente(){
        Intent intent = new Intent(MainActivity.this, CadastroCliente.class);
        startActivity(intent);
    }
    public void cadastroProdutos(){
        Intent intent = new Intent(MainActivity.this, ItemdoPedido.class);
        startActivity(intent);
    }
    public void realizarPedido(){
        Intent intent = new Intent(MainActivity.this, RealizarPedidodeVenda.class);
        startActivity(intent);
    }
}