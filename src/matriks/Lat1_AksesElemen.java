/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks;

/**
 *
 * @author Sahrul
 */
public class Lat1_AksesElemen {
    public static void main (String[] args){
        int matrix [][] = new int [2][2];
        matrix [0][0] = 1;
        matrix [0][1] = 2;
        matrix [1][0] = 4;
        matrix [1][1] = 5;
        
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println(matrix[1][0]);
              System.out.println();
        System.out.println("Muhamad Sahrul Syabani");
    }
}
