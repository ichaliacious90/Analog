/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analog;

/**
 *
 * @author ADMIN
 */
public class InsertionSort1 {
    public static void main(String[] args) {
        int angka[]= {32,75,69,58,21,40};
        int sementara;
        for (int i = 0; i < angka.length; i++) {
            for (int j = angka.length-1; j > i; j--) {
                if (angka[j-i]> angka[j]) {
                    sementara= angka[j];
                    angka[j] = angka[j-1];
                    angka[j-1]= sementara;    
                }              
            }            
        }
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka [i]+"");
        }
    }
   
}
