
package cuci.mobilmotor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Habib
 */
public class habibabayhaqqi_07167_cuciView {

     static ArrayList <habibalbayhaqqi_07167_Roda2> roda2 = new ArrayList();
     static ArrayList <habibalbayhaqqi_07167_Roda4> roda4 = new ArrayList();
     static Scanner input = new Scanner(System.in);
     static boolean penunjuk = false;
    public static void main(String[] args) {
        
        int pilih;
        
         do{
             System.out.println("1. Daftar ");
             System.out.println("2. Ambil ");
             System.out.println("3. Lihat Antrian");
             System.out.println("4. Update Data ");
             System.out.println("5. Keluar ");
             System.out.print("pilih : ");
             pilih = input.nextInt();
             switch(pilih)
             {
                 case 1 : Daftar();
                          penunjuk = true;
                 break;
                 case 2 : Ambil_kendaraan();
                 break;
                 case 3 : lihat_antrian();
                 break;
                 case 4 : updateData();
                 break;
             }
          
        }while(pilih<5);
      }

    static void Daftar(){
        System.out.println("1. roda 2");
        System.out.println("2. roda 4");
        System.out.print("pilih : ");
        int jenis = input.nextInt();
        
         switch (jenis) {
             case 1:
                 {
                     System.out.print("masukkan nomor plat : ");
                     String plat = input.next();
                     System.out.print("masukkan merk kendaraan : ");
                     String merk = input.next();
                     System.out.print("masukkan warna : ");
                     String warna = input.next();
                     roda2.add(new habibalbayhaqqi_07167_Roda2(plat,warna,merk));
                     break;
                 }
             case 2:
                 {
                     System.out.print("masukkan nomor plat : ");
                     String plat = input.next();
                     System.out.print("masukkan merk kendaraan : ");
                     String merk = input.next();
                     System.out.print("masukkan warna : ");
                     String warna = input.next();
                     roda4.add(new habibalbayhaqqi_07167_Roda4(plat,warna,merk));
                     break;
                 }
             default:
                 System.out.println("pilihan tidak ada");
                 break;
         }
      
        }
  
    static  void Ambil_kendaraan()
      {
          if(roda2.isEmpty() && roda4.isEmpty()){
            System.out.println("Anda Belum Terdaftar, Silahkan daftar Dahulu \n");
                 
           } else{
           
          System.out.print("masukkan nomor plat : ");
          String platnomor = input.next();
          System.out.print("masukkan merk : ");
          String merk =input.next();
                   for(int i=0;i<roda2.size();i++)
                   {
                       if(merk.equals(roda2.get(i).getMerk()) && platnomor.equals(roda2.get(i).getPlatnomor()))
                        {
                            System.out.println(" DATA BERHASIL DIAMBIL");
                            roda2.remove(i);
                        }
                   } 
                   for(int i=0;i<roda4.size();i++)
                   {
                       if(merk.equals(roda4.get(i).getMerk()) && platnomor.equals(roda4.get(i).getPlatnomor()))
                       {   
                          System.out.println(" DATA BERHASIL DIAMBIL");
                           roda4.remove(i);
                       }
                   }
       }
}
    
    static void lihat_antrian(){
        if(roda2.isEmpty() && roda4.isEmpty()){
            System.out.println(" TIDAK ADA ANTRIAN ");
        }else{
        System.out.println("====== ANTRIAN =======");
        for(int i=0;i<roda2.size();i++){
                 System.out.println(" nomor plat : " + roda2.get(i).getPlatnomor());
                System.out.println(" merk       : " + roda2.get(i).getMerk());
                System.out.println(" warna      : " + roda2.get(i).getWarna());
                System.out.println("_____________________________");
            }
      
            for(int i=0;i<roda4.size();i++){
                System.out.println(" nomor plat : " + roda4.get(i).getPlatnomor());
                System.out.println(" merk       : " + roda4.get(i).getMerk());
                System.out.println(" warna      : " + roda4.get(i).getWarna());
                System.out.println("__________________________");
            }
        }
    }
      
 
    static void updateData(){
        if(roda2.isEmpty() && roda4.isEmpty()){
            System.out.println("\tData Kosong");
            System.out.println("Masukkan data terlebih dahulu");
        }else{
            System.out.println("======DATA=======");
            for(int i=0;i<roda2.size();i++){
                 System.out.println(" nomor plat : " + roda2.get(i).getPlatnomor());
                System.out.println(" merk       : " + roda2.get(i).getMerk());
                System.out.println(" warna      : " + roda2.get(i).getWarna());
                System.out.println("_____________________________");
            }
      
            for(int i=0;i<roda4.size();i++){
                System.out.println(" nomor plat : " + roda4.get(i).getPlatnomor());
                System.out.println(" merk       : " + roda4.get(i).getMerk());
                System.out.println(" warna      : " + roda4.get(i).getWarna());
                System.out.println("__________________________");
            }

             System.out.print("masukkan data yang lama : ");
             String update = input.next();
             for(int i=0;i<roda2.size();i++){
                if(update.equals(roda2.get(i).getMerk())){
                    System.out.print("masukkan data baru : ");
                    String baru = input.next();
                    roda2.get(i).merk = baru;
                    penunjuk=true;
                }else if(update.equals(roda2.get(i).getPlatnomor())){ 
                    System.out.print("masukkan data baru : ");
                    String baru = input.next();
                    roda2.get(i).platnomor = baru;
                    penunjuk=true;
                }else  if(update.equals(roda2.get(i).getWarna())){
                    System.out.print("masukkan data baru : ");
                    String baru = input.next();
                    roda2.get(i).warna = baru;
                    penunjuk=true;
                       }else{
                   penunjuk=false;
                }
             }
             
             for(int i=0;i<roda4.size();i++){
                if(update.equals(roda4.get(i).getMerk())){
                    System.out.print("masukkan data baru : ");
                    String baru = input.next();
                    roda4.get(i).merk = baru;
                    penunjuk=true;
                }else if(update.equals(roda4.get(i).getPlatnomor())){ 
                        System.out.print("masukkan data baru : ");
                        String baru = input.next();
                        roda4.get(i).platnomor = baru;
                    penunjuk=true;
                }else  if(update.equals(roda4.get(i).getWarna())){
                        System.out.print("masukkan data baru : ");
                        String baru = input.next();
                        roda4.get(i).warna = baru;
                        penunjuk=true;
                       }else{
                    penunjuk=false;
                }
             }
             if(penunjuk==false){
                 System.out.println("DATA SALAH");
             }
               
        }
   }
}

    
