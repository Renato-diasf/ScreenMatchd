package br.com.diaslitz.screenshot.models;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracao;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public void exibeFilme(){
        System.out.println("O nome do filme é " + nome);
        System.out.println("O filme lançou em " + anoDeLancamento);
    }

    public void daLike(double like){
        somaDasAvaliacoes += like;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
