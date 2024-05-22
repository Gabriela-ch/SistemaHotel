package com.example.SistemaHotel.Model.entity;


public class TipoQuarto {

    private int idQuarto;

    public int getIdQuarto() {
        return idQuarto;
    }
    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }
    
    private void standard(int id){
        //id do quarto standard
        this.idQuarto = id;
    } 
    private void master(int id){
        //id do quarto master 
        this.idQuarto = id;
    } 
    private void deluxe(int id){
        //id do quarto deluxe
        this.idQuarto = id;
    }
    private void presidencial(int id){
        //id do quarto presidencial
        this.idQuarto = id;
    } 


}
