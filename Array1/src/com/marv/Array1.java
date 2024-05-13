package com.marv;
import java.util.Scanner;
public class Array1 {
	public static void main (String[] arg) {
		

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();

		        int[] array = new int[size];
		        System.out.println("Enter " + size + " numbers into the array:");
		        for (int i = 0; i < size; i++) {
		            array[i] = scanner.nextInt();
		        }

		        System.out.print("Enter a number to be searched: ");
		        int searchNumber = scanner.nextInt();

		        int count = 0;
		        for (int num : array) {
		            if (num == searchNumber) {
		                count++;
		            }
		        }

		        if (count > 0) {
		            System.out.println(searchNumber + " is present in the array " + count + " time(s).");
		        } else {
		            System.out.println(searchNumber + " is not present in the array.");
		        }

		        scanner.close();
		    }
		}

	
