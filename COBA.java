/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analog;

/**
 *
 * @author ADMIN
 */
public class COBA {
 static int search (String arr[], int n, String x)  {
     for (int i = 0; i < n; i++) {
         if (arr[i].equals(x)) {
             return i;  
         }
     }
     return -1;
 } 
    public static void main(String[] args) {
        String nama [] = {"iwan berumur 15 tahun berjenis kelamin laki-laki", "jumeno berumur 15 tahun berjenis kelamin laki-laki ", "cecep", "dedi", "eko", "lina", "murni", "hasan berumur 15 tahun berjenis kelamin laki-laki", "kartini", "feri", "bambang"};
        int n = nama.length;
        String x = "hasan";
        
        int index = search(nama, n, x);
        if (index == -1) {
            System.out.println("nama tersebut tidak terdapat dalam array");
        }else {
            System.out.println("nama tersebut terletak pada posisi "+index);
        }
    }
}
