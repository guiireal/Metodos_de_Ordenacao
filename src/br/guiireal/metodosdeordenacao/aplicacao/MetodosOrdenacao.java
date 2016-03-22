package br.guiireal.metodosdeordenacao.aplicacao;

/**
 * CLASSE QUE AGRUPA TODOS OS MÉTODOS DE ORDENAÇÃO (BOLHA, SELEÇÃO e INSERÇÃO)
 * 
 * @author Guilherme
 */
public class MetodosOrdenacao {
    
    public void metodoBolha(int[] vetor, int tamanho, String ordem) {
        int aux;
        switch (ordem) {
            case "crescente":
                for (int i = 0; i < (tamanho - 1); i++)
                    for (int j = 0; j < (tamanho - 1); j++)
                        if (vetor[j] > vetor[j + 1]) {
                            aux = vetor[j];
                            vetor[j] = vetor[j + 1];
                            vetor[j + 1] = aux;
                        }
                break;
            case "decrescente":
                for (int i = 0; i < (tamanho - 1); i++)
                    for (int j = 0; j < (tamanho - 1); j++)
                        if (vetor[j] < vetor[j + 1]) {
                            aux = vetor[j];
                            vetor[j] = vetor[j + 1];
                            vetor[j + 1] = aux;
                        }
                break;
        } // FIM DO SWITCH
    }
    
    public void metodoSelecao(int[] vetor, int tamanho, String ordem) {
        int aux, indice;
        switch (ordem) {
            case "crescente":
                for (int i = 0; i < (tamanho - 1); i++) {
                    indice = i;
                    for (int j = (i + 1); j < tamanho; j++) {
                        if (vetor[indice] > vetor[j])
                            indice = j;
                    }
                    if (indice != i) {
                        aux = vetor[i];
                        vetor[i] = vetor[indice];
                        vetor[indice] = aux;
                    }
                }    
                break;
            case "decrescente":
                for (int i = 0; i < (tamanho - 1); i++) {
                    indice = i;
                    for (int j = (i + 1); j < tamanho; j++) {
                        if (vetor[indice] < vetor[j])
                            indice = j;
                    }
                    if (indice != i) {
                        aux = vetor[i];
                        vetor[i] = vetor[indice];
                        vetor[indice] = aux;
                    }
                } 
                break;
        } // FIM DO SWITCH
    }
    
    public void metodoInsercao(int[] vetor, int tamanho, String ordem) {
        int j, aux;
        switch (ordem) {
            case "crescente":
                for (int i = 1; i < vetor.length; i++) {
                    aux = vetor[i];
                    j = i;
                    while ((j > 0) && (vetor[j - 1]) > aux) {
                        vetor[j] = vetor[j - 1];
                        j--;
                    }
                    vetor[j] = aux;
                }
                break;
            case "decrescente":
                for (int i = 1; i < vetor.length; i++) {
                    aux = vetor[i];
                    j = i;
                    while ((j > 0) && (vetor[j - 1]) < aux) {
                        vetor[j] = vetor[j - 1];
                        j--;
                    }
                    vetor[j] = aux;
                }
                break;
        } // FIM DO SWITCH
    }
    
}
