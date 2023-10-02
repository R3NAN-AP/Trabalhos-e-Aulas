package com.example.trabalhomobile;

import java.util.ArrayList;

public class ControllerCliente {

    private static ControllerCliente instanciaCliente;

    private ArrayList<Cliente> listadeClientes;

    public static ControllerCliente getInstanciaCliente() {
        if (instanciaCliente == null) {
            return instanciaCliente = new ControllerCliente();
        } else {
            return instanciaCliente;
        }

    }
    private ControllerCliente() {listadeClientes = new ArrayList<>();}

    public void salvarCadastro(Cliente cliente) { listadeClientes.add(cliente);}

    public ArrayList<Cliente> retornarClientes() {
        return listadeClientes;
    }
}
