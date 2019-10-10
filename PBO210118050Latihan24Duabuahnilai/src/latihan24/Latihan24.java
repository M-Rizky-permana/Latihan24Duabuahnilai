/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan24;

import java.util.Scanner;

/**
 *
 * NAMA :Muhamad Rizky Permana
KELAS : IF-2
NIM : 10118050
Deskripsi Program :
 */
public class Latihan24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilaiawal,nilaikedua;
        
        Scanner scan = new Scanner(System.in);
        for (String masukan = "Ya";masukan.equals("Ya");){
            
        
            System.out.print("Masukkan Nilai Pertama : ");
            nilaiawal = scan.nextInt();

            System.out.print("Masukkan Nilai Kedua :");
            nilaikedua = scan.nextInt();

            if(nilaiawal>nilaikedua){
                System.out.println("Hasil: " +nilaiawal+ "Lebih Besar Dari "+nilaikedua);
            }else{
                System.out.println("Hasil: " +nilaiawal+ "Lebih Kecil Dari "+nilaikedua);
            }

             System.out.print("Ulangi Aktivitas?(Ya/Tidak)");
            masukan = scan.nextLine();
        }
       
        
        
    }
    
}
