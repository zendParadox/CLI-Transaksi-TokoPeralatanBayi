/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaksi;

/**
 *
 * @author user
 */
public class SUB {

public static void main (String[] arguments)
   {
    
   peralatan_bayi objek = new peralatan_bayi ();
   objek.transaksi();
   
     if(objek.totalbelanja>150000){
         System.out.println("");
         System.out.println("====== Tansaksi Anda Melebihi Rp. 150.000 ======");
         System.out.println("========== Anda Mendapat Cashback 15% ==========");
         System.out.println("");
         System.out.println("Uang Anda            :Rp. "+objek.bayar);
         System.out.println("Cashback Anda        :Rp. "+objek.diskon);
         System.out.println("Kembalian Anda       :Rp. "+objek.kembalian); 
         System.out.println("=== Terima Kasih Telah Singgah Di Toko Kami ====");
     }
     
     else  {
    System.out.println("Kembalian Anda       :Rp. "+objek.kembalian); 

 }   
 }                    
}
