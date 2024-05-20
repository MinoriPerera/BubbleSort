/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    //OPTIMIZED BUBBLE SORT METHOD
package datastructuresandalgorithms;

public class OptimizedBubbleSort {

    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 89;
        array[1] = 23;
        array[2] = 14;
        array[3] = 45;

        // Optimized Bubble Sort
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                    swapped = true;
                }
            }
            // If no two elements were swapped by the inner loop, then break
            if (!swapped) {
                break;
            }
        }

        // Print the sorted array
        for (int n : array) {
            System.out.println(n);
        }
    }
}

