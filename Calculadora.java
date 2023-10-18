package br.com.diaslitz.screenshot.calculos;

import br.com.diaslitz.screenshot.models.Titulo;

public class Calculadora {

    private int tempoTotal;

    /*public int inclui(Filme) {
}

     public int inclui(Serie) {
     }
     */

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracao();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
