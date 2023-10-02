package com.example.trabalhomobile;

import java.util.ArrayList;

public class ControllerPedido {
    private static ControllerPedido instanciaPedido;
    private ArrayList<PedidoVenda> listadePedidos;


    public static ControllerPedido getControlerPedidos(){
        if(instanciaPedido == null){
            return instanciaPedido = new ControllerPedido();
        }else{
            return instanciaPedido;
        }
    }
    private ControllerPedido(){
        listadePedidos = new ArrayList<>();
    }
    public void salvarPedidosdeVEnda(PedidoVenda pedido){
        listadePedidos.add(pedido);
    }
    public ArrayList<PedidoVenda> retornarPedidosdeVenda(){
        return listadePedidos;
    }
}
