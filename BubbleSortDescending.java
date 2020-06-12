/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class BubbleSortDescending {
    public static void TampilData(String nama[], int IndeksTerakhir) {
        for (int i = 0; i <= IndeksTerakhir; i++) {
            System.out.println(nama[i]); 
        }
    }
    public static void UrutkanBubble (String nama[], int IndeksTerakhir) {
        String sementara = "";
        for (int j = 0; j <= IndeksTerakhir-1; j++) {
            for (int i = 0; i <=IndeksTerakhir - 1 - j; i++) {
                if (nama[i].compareTo(nama[i+1])<0) {
                 sementara = nama[i];
                 nama[i] = nama[i+1];
                 nama [i+1]= sementara;
                }
            }
            
        }
    }
    public static void main(String[] args) {
        String nama [] = {"sita", "agus", "wahyu", "indah", "novita", "jamal", "feri", "tasya", "eko", "ikhwan"};
        int IndeksTerakhir = nama.length-1;
        
        System.out.println(" data belum diurtakan : ");
        TampilData(nama, IndeksTerakhir);
        
        UrutkanBubble(nama, IndeksTerakhir);
        System.out.println();
        
        System.out.println("data setelah diurutkan : ");
        TampilData(nama, IndeksTerakhir);
        
        
    }
}
