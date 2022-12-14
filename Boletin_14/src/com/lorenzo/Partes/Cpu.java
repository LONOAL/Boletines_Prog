package com.lorenzo.Partes;

    /**
    * Boletin_14: Da valor a la velocidad del procesador.
    *
    * @author Lorenzo Nogueira
    * @version 25.11.2022
    */

public class Cpu {
    private int velocidade;

    /**
     * Constructor vacio.
     */

    public Cpu() {
    }

    /**
     * Constructor.
     * @param velocidade: velocidade
     */

    public Cpu(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * Getter.
     * @return velocidade.
     */

    public int getVelocidade() {
        return velocidade;
    }

    /**
     * Setter.
     * @param velocidade
    * Dar valor velocidade.
     */

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return " velocidade= " + velocidade;
    }
}
