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
public class WordInverst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String KataNormal;
        String KataBalik ="";
        System.out.println("input kata : ");
        KataNormal = input.nextLine();
        for (int i = KataNormal.length()- 1 ;i>=0; i-- ) {
         KataBalik += KataNormal.charAt(i);
        }
        System.out.println("hasil kata yang dibalik : "+KataBalik);
    }
    
}
