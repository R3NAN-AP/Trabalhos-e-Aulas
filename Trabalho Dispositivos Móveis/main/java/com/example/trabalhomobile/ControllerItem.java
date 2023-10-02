package com.example.trabalhomobile;

import java.util.ArrayList;

public class ControllerItem {
    private static ControllerItem instanciaItem;
    private ArrayList<Item> listadeItens;


    public static ControllerItem getInstanciaItem(){
        if(instanciaItem == null){
            return instanciaItem = new ControllerItem();
        }else{
            return instanciaItem;
        }
    }
    private ControllerItem(){
        listadeItens = new ArrayList<>();
    }
    public void salvarItens(Item itens){
        listadeItens.add(itens);
    }
    public ArrayList<Item> retornarItens(){
        return listadeItens;
    }
}

