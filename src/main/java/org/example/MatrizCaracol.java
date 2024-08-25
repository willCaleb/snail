package org.example;

import java.util.List;

public class MatrizCaracol {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30},
            {31, 32, 33, 34, 35, 36}
        };

        Caracol caracol = new Caracol();
        List<Integer> resultado = caracol.percorrerCaracol(matriz);

        System.out.println(resultado); // Saída: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
