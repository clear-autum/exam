package com.sir;

public class Mine {
	
 public static void bubbleSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
               
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] arr = {'z', 'a', 'b', 'c', 'f', 'd', 'e'};
        System.out.println("Original array: " + new String(arr));
        
        bubbleSort(arr);

        System.out.println("Sorted array: " + new String(arr));
    }
}
