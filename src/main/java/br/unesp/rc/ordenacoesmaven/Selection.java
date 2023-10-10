/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.ordenacoesmaven;

/**
 *
 * @author aluno
 */
public class Selection {
    private static long comparacoes = 0;
    
    public static void selectionSort (int[] lista) {
        for (int i = 0; i < (lista.length) - 1; i++) {
            int endMenor = i;

            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < lista[endMenor]) {
                    endMenor = j;
                    comparacoes++;
                }
            }

            int aux = lista[endMenor];
            lista[endMenor] = lista[i];
            lista[i] = aux;
        }
    }
    
    public static void imprimeSelectionSort(int[] lista) {
        comparacoes = 0;
        selectionSort(lista);
        System.out.println("Qntd. de comparações: " + comparacoes);    
    }
}
   
