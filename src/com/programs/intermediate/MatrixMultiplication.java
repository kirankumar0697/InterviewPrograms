package com.programs.intermediate;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number of rows for Matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int colsA = scanner.nextInt();
        
        System.out.print("Enter number of rows for Matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int colsB = scanner.nextInt();
        
        // Checking if multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. Number of columns in Matrix A must be equal to number of rows in Matrix B.");
            return;
        }
        
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        
        System.out.println("Enter numbers for matrix A");
        
        for(int i=0; i<rowsA; i++) {
        	for(int j=0; j<colsA; j++) {
        		matrixA[i][j] = scanner.nextInt();
        	}
        }
        
        System.out.println("Enter numbers for matrix B");
        
        for(int i=0; i<rowsB; i++) {
        	for(int j=0; j<colsB; j++) {
        		matrixB[i][j] = scanner.nextInt();
        	}
        }
        
        //Matrix Multiplication
        int[][] resultMatrix = new int[rowsA][colsB];
        
        for(int i=0; i<rowsA; i++) {
        	for(int j=0; j<colsB; j++) {
        		for(int k=0; k<colsA; k++) {
        			resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
        		}
        	}
        }
        
        //Display matrix
        for(int i=0; i<rowsA; i++) {
        	for(int j=0; j<colsB; j++) {
        		System.out.print(resultMatrix[i][j] + " ");
        	}
        	System.out.println();
        }

	}

}
