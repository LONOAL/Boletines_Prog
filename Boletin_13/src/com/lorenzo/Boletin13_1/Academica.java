package com.lorenzo.Boletin13_1;
import com.lorenzo.Boletin13_2.*;


public class Academica {
    public static int numReferencia=2018;
    private String nome;
    private int nota;
    private Persoal alum;

    public Academica(String nome,int nota, Persoal alum){
        numReferencia++;
        this.nome=nome;
        this.nota=nota;
        this.alum=alum;
    }
    public Academica(){
        numReferencia++;
    }

    public void setNome (String nome){
        this.nome= nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNota (int nota){
        this.nota=nota;
    }

    public int getNota(){
        return nota;
    }

    public void setAlum (Persoal alum){
        this.alum=alum;
    }

    public Persoal getAlum(){
        return alum;
    }

    public String toString() {
        return "Nota= "+nota+" Nome= "+nome+alum;
    }


}
