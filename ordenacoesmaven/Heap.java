/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.ordenacoesmaven;

/**
 *
 * @author aluno
 */
public class Heap {
    private static long comparacoes = 0;
    
    public static void heapify(int[] lista, int k, int i) {
        int maior = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;
        
        if (esquerda < k && lista[esquerda] > lista[maior]) {
            maior = esquerda;
            comparacoes++;
        }
        
        if (direita < k && lista[direita] > lista[maior]) {
            maior = direita;
            comparacoes++;
        }
        
        if (maior != i) {
            int aux = lista[i];
            lista[i] = lista[maior];
            lista[maior] = aux;
            heapify(lista, k, maior);
        }
    }

    public static void heapSort(int[] lista) {
        comparacoes = 0;
        int k = lista.length;
        
        for (int i = k / 2 - 1; i >= 0; i--) {
            heapify(lista, k, i);
        }
        
        for (int i = k - 1; i >= 0; i--) {
            int aux = lista[0];
            lista[0] = lista[i];
            lista[i] = aux;
            heapify(lista, i, 0);
        }
    }
    
    public static void imprimeHeapSort(int[] lista) {
        comparacoes = 0;
        heapSort(lista);
        System.out.println("Qntd. de comparações: " + comparacoes);
    }
}
