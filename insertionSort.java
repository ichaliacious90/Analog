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
import java.util.Scanner;
public class insertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n;
        System.out.println("banyak data : ");
        n = in.nextInt();
        int data[]= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("data ke-"+(i+1)+":");
            data[i]=in.nextInt();
        }
        //insertion
        for (int i = 0; i < data.length; i++) {
            int key = data[i];
            int j=i;
            while (j>0 && data[j-1]>key) {
                data[j]=data[j-1];
                j--;
            }
            data[j] = key;
        }
        //hasil
        System.out.println("data yang telah urut : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+ "");
            
        }
        System.out.println();
    }
   
}
