package br.guiireal.metodosdeordenacao.aplicacao;

import java.util.Random;

/**
 * CLASSE QUE TESTA A VELOCIDADE DOS MÉTODOS DE ORDENAÇÃO
 * 
 * @author Guilherme
 */
public class TesteVelocidade {

    private final MetodosOrdenacao mo = new MetodosOrdenacao();
    private final Random random = new Random();
    private long inicio, fim, tempoB, tempoS, tempoI;
    private final int MAX = 50_000;
    private final int[] vetor1 = new int[MAX];
    private final int[] vetor2 = new int[MAX];
    private final int[] vetor3 = new int[MAX];
    
    public TesteVelocidade() {
        this.gerarNumeros();
    }
    
    public void executarBolha() {
        this.inicio = System.currentTimeMillis() / 1000L;
        mo.metodoBolha(this.vetor1, this.MAX, "crescente");
        this.fim = System.currentTimeMillis() / 1000L;
        this.tempoB = this.fim - this.inicio;
    }
    
    public void executarSelecao() {
        this.inicio = System.currentTimeMillis() / 1000L;
        mo.metodoSelecao(this.vetor2, this.MAX, "crescente");
        this.fim = System.currentTimeMillis() / 1000L;
        this.tempoS = this.fim - this.inicio;
    }
    
    public void executarInsercao() {
        this.inicio = System.currentTimeMillis() / 1000L;
        mo.metodoInsercao(this.vetor3, this.MAX, "crescente");
        this.fim = System.currentTimeMillis() / 1000L;
        this.tempoI = this.fim - this.inicio;
    }
    
    private void gerarNumeros() {
        for (int i = 0; i < this.MAX; i++) {
            this.vetor1[i] = this.random.nextInt();
            this.vetor2[i] = this.random.nextInt();
            this.vetor3[i] = this.random.nextInt();
        }   
    }
    
    public long getTempoB() {
        return this.tempoB;
    }
    
    public long getTempoS() {
        return this.tempoS;
    }
    
    public long getTempoI() {
        return this.tempoI;
    }
    
}
