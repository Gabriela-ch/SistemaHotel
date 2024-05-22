package com.example.SistemaHotel.Model.entity;

public class Quarto extends TipoQuarto {

        private int numero;
        private boolean disponivel;
        
        public int getNumero() {
                return numero;
        }
        public void setNumero(int numero) {
                this.numero = numero;
        }
        public boolean isDisponivel() {
                return disponivel;
        }
        public void setDisponivel(boolean disponivel) {
                this.disponivel = disponivel;
        }
        
        
}
