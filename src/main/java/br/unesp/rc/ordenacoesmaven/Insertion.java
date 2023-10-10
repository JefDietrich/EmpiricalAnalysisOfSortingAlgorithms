/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.ordenacoesmaven;

/**
 *
 * @author aluno
 */
public class Insertion {
    private static long comparacoes = 0;
    
    public static void insertionSort(int[] lista ) {
        for (int i = 0; i < lista.length; i++) {
            int aux = lista[i];
            int j = i - 1;
       
            while (j >= 0 && lista[j] > aux) {
                lista[j + 1] = lista[j];
                j = j - 1;
                comparacoes++;
            }
            lista[j + 1] = aux;       
        }
    }
        
    public static void imprimeInsertionSort(int[] lista) {
        comparacoes = 0;
        insertionSort(lista);
        System.out.println("Qntd. de comparações: " + comparacoes);
    }
}
