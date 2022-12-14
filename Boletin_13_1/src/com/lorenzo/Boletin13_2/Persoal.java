package com.lorenzo.Boletin13_2;

public class Persoal {
    private String correo;
    private int telefono;

    public Persoal(String correo,int telefono){
        this.correo=correo;
        this.telefono=telefono;
    }
    public Persoal(){
    }

    public void setCorreo (String correo){
        this.correo= correo;
    }

    public String getCorreo(){
        return correo;
    }

    public void setNota (int telefono){
        this.telefono=telefono;
    }

    public int getTelefono(){
        return telefono;
    }

    public String toString() {
        return " Correo= "+correo+" Telefono= "+telefono;
    }
}


