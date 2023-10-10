/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.ordenacoesmaven;

/**
 *
 * @author aluno
 */
public class Merge {
    private static long comparacoes = 0;
    
    public static void merge(int[] lista, int[] esquerda, int[] direita) {
        int i = 0, j = 0, k = 0;

        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] <= direita[j]) {
                lista[k++] = esquerda[i++];
            } else {
                lista[k++] = direita[j++];
            }
            comparacoes++;
        }

        while (i < esquerda.length) {
            lista[k++] = esquerda[i++];
            comparacoes++;
        }

        while (j < direita.length) {
            lista[k++] = direita[j++];
            comparacoes++;
        }
    }
    
   
    public static void mergeSort(int[] lista) {
        comparacoes = 0;
        
        if (lista.length <= 1) {
            return;
        }

        int meio = lista.length / 2;
        int[] esquerda = new int[meio];
        int[] direita = new int[lista.length - meio];

        // Preenche os arrays esquerda e direita
        for (int i = 0; i < meio; i++) {
            esquerda[i] = lista[i];
        }
        for (int i = meio; i < lista.length; i++) {
            direita[i - meio] = lista[i];
        }

        mergeSort(esquerda);
        mergeSort(direita);

        merge(lista, esquerda, direita);
    }
    
    public static void imprimeMergeSort(int[] lista) {
        comparacoes = 0;
        mergeSort(lista);
        System.out.println("Qntd. de comparações: " + comparacoes);    
    }
}
