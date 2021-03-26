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
public class tugas2no2matriks {
    public static void main (String[] args){
        int[][] A = {
            {9,17},
            {14,12},
            {10,15}
        };
        
        int[][] B = {
            {10,9},
            {7,15},
            {10,8}
        };
        
        if((A.length == B.length) && (A[0].length == B[0].length)){
            int[][] C = new int[A.length][A[0].length];
            for(int i=0; i<A.length; i++){
                for(int j=0; j<A[0].length; j++){
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
            for(int[] c: C){
                for(int q: c){
                    System.out.print(q+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println(C[1][1]);
            
        }
        else {
            System.out.println("Ukuran Matrix tidak sama");
        }
        System.out.println();
        System.out.println("Muhamad Sahrul Syabani");
        
    }
    
}
