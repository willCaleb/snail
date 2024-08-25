package org.example;

import java.util.ArrayList;
import java.util.List;

public class Caracol {

    public List<Integer> percorrerCaracol(int[][] matriz) {
        List<Integer> resultado = new ArrayList<>();

        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            return resultado; // Retorna uma lista vazia se a matriz for nula ou vazia
        }

        int topo = 0, baixo = matriz.length - 1;
        int esquerda = 0, direita = matriz[0].length - 1;

        while (topo <= baixo && esquerda <= direita) {
            topo = getTopo(matriz, esquerda, direita, resultado, topo);

            getDireita(matriz, topo, baixo, resultado, direita);
            direita--;

            baixo = getBaixo(matriz, topo, baixo, direita, esquerda, resultado);

            esquerda = getEsquerda(matriz, esquerda, direita, baixo, topo, resultado);
        }

        return resultado;
    }

    private static int getEsquerda(int[][] matriz, int esquerda, int direita, int baixo, int topo, List<Integer> resultado) {
        if (esquerda <= direita) {
            for (int i = baixo; i >= topo; i--) {
                resultado.add(matriz[i][esquerda]);
            }
            esquerda++;
        }
        return esquerda;
    }

    private static int getBaixo(int[][] matriz, int topo, int baixo, int direita, int esquerda, List<Integer> resultado) {
        if (topo <= baixo) {
            for (int i = direita; i >= esquerda; i--) {
                resultado.add(matriz[baixo][i]);
            }
            baixo--;
        }
        return baixo;
    }

    private static void getDireita(int[][] matriz, int topo, int baixo, List<Integer> resultado, int direita) {
        for (int i = topo; i <= baixo; i++) {
            resultado.add(matriz[i][direita]);
        }
    }

    private static int getTopo(int[][] matriz, int esquerda, int direita, List<Integer> resultado, int topo) {
        for (int i = esquerda; i <= direita; i++) {
            resultado.add(matriz[topo][i]);
        }
        topo++;
        return topo;
    }
}
