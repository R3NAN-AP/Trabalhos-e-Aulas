package com.example.trabalhomobile;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.service.controls.Control;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import  android.*;
import android.widget.Toast;


public class CadastroCliente extends AppCompatActivity {

    private EditText edNomedoCliente;
    private EditText edCpfdoCliente;

    private Button btSalvarCadastro;

    private TextView tvListadeCliente;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cliente);
        edNomedoCliente = findViewById(R.id.edNomedoCliente);
        edCpfdoCliente  = findViewById(R.id.edCpfdoCliente);
        tvListadeCliente = findViewById(R.id.tvListadeCliente);
        btSalvarCadastro = findViewById(R.id.btSalvarCadastro);

        atualizarListadeClientes();



        btSalvarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SalvarCadastro();
            }
        });



    }
    public void SalvarCadastro(){
        int cpf;
            if (edCpfdoCliente.getText().toString().isEmpty()){
                edCpfdoCliente.setError("Deverá ser informado um CPF");
                return;
            } else {
                try {
                    cpf = Integer.parseInt(edCpfdoCliente.getText().toString());
                } catch (Exception ex) {
                    edCpfdoCliente.setError("O CPF deverá conter apenas números!");
                    return;
                }
            }
            if (edNomedoCliente.getText().toString().isEmpty()){
                edNomedoCliente.setError("Deverá ser informado o nome do Cliente!");
                return;
            }
            Cliente cliente = new Cliente();
            cliente.setNome(edNomedoCliente.getText().toString());
            cliente.setCpf(edCpfdoCliente.getText().toString());

            ControllerCliente.getInstanciaCliente().salvarCadastro(cliente);

        Toast.makeText(CadastroCliente.this,"O Cliente"+"foi cadastrado com sucesso!",Toast.LENGTH_LONG).show();
        finish();
    }

    private void atualizarListadeClientes(){
        String i = "";
        for (Cliente Cliente : ControllerCliente.getInstanciaCliente().retornarClientes()){
            i+= "Nome: " + Cliente.getNome() + "\n"+ "CPF: " + Cliente.getCpf()+ "\n";
        }
        tvListadeCliente.setText(i);
    }
}