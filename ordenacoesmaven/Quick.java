/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.ordenacoesmaven;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Quick {
    private static long comparacoes = 0;
     private static final Random random = new Random();
    
    public static int reparte(int[] lista, int baixo, int alto) {
        // Escolhe aleatoriamente um índice entre baixo e alto como pivô
        int indicePivo = random.nextInt(alto - baixo + 1) + baixo;
        int pivo = lista[indicePivo];
        
        // Troca o pivô com o elemento do alto
        int aux = lista[alto];
        lista[alto] = lista[indicePivo];
        lista[indicePivo] = aux;

        int i = baixo - 1;
        for (int j = baixo; j < alto; j++) {
            if (lista[j] <= pivo) {
                i++;
                aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
                comparacoes++;
            }
        }
        
        aux = lista[i + 1];
        lista[i + 1] = lista[alto];
        lista[alto] = aux;
        comparacoes++;
        return i + 1;
    }
    
    public static void quickSort(int[] lista) {
        comparacoes = 0;
        if (lista == null || lista.length == 0) {
            return;
        }
        int k = lista.length;
        quickSort(lista, 0, k - 1);
    }

    public static void quickSort(int[] lista, int baixo, int alto) {
        if (baixo < alto) {
            int endPivo = reparte(lista, baixo, alto);
            quickSort(lista, baixo, endPivo - 1);
            quickSort(lista, endPivo + 1, alto);
        }
    }
    
    public static void imprimeQuickSort(int[] lista) {
        quickSort(lista);
        System.out.println("Qntd. de comparações: " + comparacoes);
        comparacoes = 0;
    }
    
}
