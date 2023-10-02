package com.example.trabalhomobile;

public class PedidoVenda {
        private String nomedoItem;

        public String getNomedoItem() {
                return nomedoItem;
        }

        public void setNomedoItem(String nomedoItem) {
                this.nomedoItem = nomedoItem;
        }

        public double getValor() {
                return valor;
        }

        public void setValor(double valor) {
                this.valor = valor;
        }

        public int getQuantidade() {
                return quantidade;
        }

        public void setQuantidade(int quantidade) {
                this.quantidade = quantidade;
        }

        private double valor;
        private int quantidade;

        public PedidoVenda(){}


        }
