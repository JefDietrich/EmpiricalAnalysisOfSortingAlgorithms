/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.unesp.rc.ordenacoesmaven;
import static br.unesp.rc.ordenacoesmaven.Insertion.imprimeInsertionSort;
import static br.unesp.rc.ordenacoesmaven.Selection.imprimeSelectionSort;
import static br.unesp.rc.ordenacoesmaven.Merge.imprimeMergeSort;
import static br.unesp.rc.ordenacoesmaven.Heap.imprimeHeapSort;
import static br.unesp.rc.ordenacoesmaven.Quick.imprimeQuickSort;
import java.util.Random;

public class OrdenacoesMaven {

    public static void main(String args[]) {
        
        int repeticoes = 5;
        //int p = 10; // Vai de 10 até 30
        //int tamanhoDoVetor = (int) Math.pow(2, p); // Tamanho do vetor
        //System.out.println("Tamanho da amostra: " + tamanhoDoVetor);
        //System.out.println();

        /* Escolha o tipo de ordenação:
            1 - Insertion Sort  [ FINALIZADO ]
            2 - Selection Sort  [ FINALIZADO ]
            3 - Merge Sort      [ FINALIZADO ]
            4 - Heap Sort       [ FINALIZADO ]
            5 - Quick Sort      [ FINALIZADO ]
        */

        int escolha = 5;
        
        for (int p = 10; p < 30; p++) {
            System.out.println("POTENCIA: " + p);
            int tamanhoDoVetor = (int) Math.pow(2, p); // Tamanho do vetor
            System.out.println("Tamanho da amostra: " + tamanhoDoVetor);
            System.out.println();
        
        
            for (int i = 0; i < repeticoes; i++) {
                //int[] lista1 = bestCase(tamanhoDoVetor);
                //int[] lista2 = worstCase(tamanhoDoVetor);
                int[] lista3 = randomCase(tamanhoDoVetor);

                //long tempoInicial = System.nanoTime();        // Utilizar para 2^10 até 2^14
                long tempoInicial = System.currentTimeMillis(); // Utilizar para 2^15 até 2^30

                switch(escolha) {
                    case 1 -> imprimeInsertionSort(lista3);

                    case 2 -> imprimeSelectionSort(lista3);            

                    case 3 -> imprimeMergeSort(lista3);

                    case 4 -> imprimeHeapSort(lista3);

                    case 5 -> imprimeQuickSort(lista3);

                    default -> System.out.println("Você não digitou um número válido");
                }

                //long tempoFinal = System.nanoTime();
                long tempoFinal = System.currentTimeMillis(); 

                long tempoTotal = tempoFinal - tempoInicial;

                System.out.println("Execução " + (i + 1));
                System.out.println("Tempo de execução (ms): " + tempoTotal);
                System.out.println();
            }
            System.out.println("------------------------------");
        }
    }

    public static int[] bestCase(int tamanho) {
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = i+1;
        }

        return array;
    }
    
    public static int[] worstCase(int tamanho) {
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = tamanho - i;
        }

        return array;
    }
    
    public static int[] randomCase(int tamanho) {
        int[] array = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100); // Gera números aleatórios de 0 a 99
        }

        return array;
    }
}
