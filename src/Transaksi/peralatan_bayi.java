/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaksi;

import java.util.Scanner;

/**
 *
 * @author Defan
 */
public class peralatan_bayi extends SUB {

    int KAOSKAKI,ks;
    int BAJU,km;
    int POPOK,ja;
    int CELANA,cn;
    int SEPATU,sp;
    int BOTOLSUSU,sl;
    int BEDONG,kt;
    int TOPI,ti;
    int pesan, bayar,diskon, kembalian, total, totalbelanja;
    boolean beli1, beli2, beli3,beli4,beli5,beli6,beli7,beli8;
    int kurang;
    int qtys;
    int qtym;
    int qtya;
    int qtyn;
    int qtyp;
    int qtyl;
    int qtyt;
    int qtyi;
    String pesan1, pesan2, pesan3, pesan4, pesan5,pesan6,pesan7,pesan8,jawab,name;
   
    Scanner input;

    public peralatan_bayi() {
        this.input = new Scanner (System.in);
    }

    void transaksi() 
    {
       KAOSKAKI = 45000;
       BAJU = 80000;
       POPOK = 120000;
       CELANA = 100000;
       SEPATU = 200000;
       BOTOLSUSU = 150000;
       BEDONG = 50000;
       TOPI = 80000;
       jawab = "N";
       totalbelanja = 0;
       
    System.out.println("===============================================");
    System.out.println("============== SELAMAT DATANG DI ==============");
    System.out.println("============= BABY SHOP =============");
    System.out.println("===============================================");
    System.out.print("Masukan Nama Anda : ");
    name = input.next();
 do{
         System.out.println("Pilih Produk : ");
        System.out.println("1.KAOS KAKI                 Rp 45.000,-");
        System.out.println("2.BAJU               Rp 80.000,-");
        System.out.println("3.POPOK                Rp 120.000,-");
        System.out.println("4.CELANA                Rp 100.000,-");
        System.out.println("5.SEPATU               Rp 200.000,-");
        System.out.println("6.BOTOL SUSU               Rp 150.000,-");
        System.out.println("7.BEDONG            Rp 50.000,-");
        System.out.println("8.TOPI                 Rp 80.000,-");
        System.out.println("Silahkan Pilih Produk :");
         pesan = input.nextInt();
         
         switch(pesan){
             case 1 :
                System.out.println("Masukan Jumlah : ");
                qtys = input.nextInt();
                ks = KAOSKAKI* qtys;
                pesan1 = "KAOS";
                beli1 = true;
        break;
        case 2 :
                System.out.println("Masukan Jumlah : ");
                qtym = input.nextInt();
                km = BAJU * qtym;
                pesan2 = "KEMEJA";
                beli2 = true;
        break;
        case 3 :
                System.out.println("Masukan Jumlah : ");
                qtya = input.nextInt();
                ja = POPOK* qtya;
                pesan3 = "JEANS";
                beli3 = true;
        break;
        case 4 :
                System.out.println("Masukan Jumlah : ");
                qtyn = input.nextInt();
                cn = CELANA * qtyn;
                pesan4 = "CHINO";
                beli4 = true;
        break;
        case 5 :
                System.out.println("Masukan Jumlah : ");
                qtyp = input.nextInt();
                sp = SEPATU * qtyp;
                pesan5 = "SEPATU";
                beli5 = true;
        break;
        case 6 :
                System.out.println("Masukan Jumlah : ");
                qtyl = input.nextInt();
                sl = BOTOLSUSU * qtyl;
                pesan6 = "SENDAL";
                beli6 = true;
        break;        
        case 7 :
                System.out.println("Masukan Jumlah : ");
                qtyt = input.nextInt();
                kt = BEDONG * qtyt;
                pesan7 = "KACAMATA";
                beli7 = true; 
        break;
        case 8 :
                System.out.println("Masukan Jumlah : ");
                qtyi = input.nextInt();
                ti = TOPI * qtyi;
                pesan8 = "TOPI";
                beli8 = true; 
        break;
        default:
             System.out.println("Maaf salah input");
         }
System.out.println("Ingin Menambah Pembelian Anda? y/n");
jawab = input.next();
System.out.println("");
 }while(jawab.equals("y") );
 
 totalbelanja=ks+km+ja+cn+sp+sl;
System.out.println("Nama : "+name);
System.out.println("list produk : ");
System.out.println(" Nama Barang       | Harga | Jumlah barang   | Total Harga");
if (beli1==true){
        System.out.println(" KAOSKAKI            :  "+KAOSKAKI+"         "+qtys+"              "+ks);
}
if (beli2==true){
        System.out.println(" BAJU           :  "+BAJU+"         "+qtym+"              "+km);
}       
if (beli3==true){
        System.out.println(" POPOK            :  "+POPOK+"        "+qtya+"              "+ja);
} 
if (beli4==true){
        System.out.println(" CHINO            :  "+CELANA+"        "+qtyn+"              "+cn);
}         
if (beli5==true){
        System.out.println(" SEPATU           :  "+SEPATU+"        "+qtyp+"              "+sp);
}
if (beli6==true){
        System.out.println(" SENDAL           :  "+BOTOLSUSU+"        "+qtyl+"              "+sl);
}
if (beli7==true){
        System.out.println(" KACAMATA         :  "+BEDONG+"         "+qtyt+"              "+kt);
}
if (beli8==true){
        System.out.println(" TOPI             :  "+TOPI+"         "+qtyi+"              "+ti);
}
System.out.println("========================================================================");
 System.out.println("Total Belanja Anda : Rp. "+totalbelanja+"");
 diskon = totalbelanja * 15/100;
 System.out.println("Lakukan Pembayaran : Rp. ");
 bayar = input.nextInt();
 
 if(bayar<totalbelanja){
           kurang = totalbelanja - bayar;
           System.out.println("--------------- Warning!! -----------------");
           System.out.println("Mohon Maaaf Uang Anda kurang : Rp. " +kurang);
           System.out.println("-------------------------------------------");
           System.out.println("Masukan Pembayaran Anda               : RP.");
           bayar = input.nextInt();
}
 
          kembalian = bayar - totalbelanja + diskon;    
          
}    
}
