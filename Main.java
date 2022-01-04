import paket1.*;

public class Main {
 
    public static void main(String[] args) {
     
     Manusia orang = new Manusia();
    //  Method info
     orang.setMakhlukhidup("Manusia Merupakan Makhluk Hidup");
     orang.setBerjalan("Berjalan menggunakan dua kaki");
     orang.setBernapas("Bernapas dengan paru-paru");
     orang.setBerkembangbiak("Berkembangbiak dengan melahirkan");
    //  Method perbedaan
    orang.setNama("Memiliki nama sebagai identitas individual");
    orang.setBicara("Dapat berbicara dan memiliki banyak bahasa");
    orang.setBerpikir("Dapat berpikir secara rasional dan memiliki akal");
    
     Hewan Binatang = new Hewan();
    //  Method info
     Binatang.setMakhlukhidup("Hewan Merupakan Makhluk Hidup");
     Binatang.setBerjalan("Berjalan menggunakan 2 dan 4 kaki tergantung jenisnya");
     Binatang.setBernapas("Bernapas dengan paru-paru dan ingsang tergantung jenisnya");
     Binatang.setBerkembangbiak("Berkembangbiak dengan Vivapar, Ovipar, Ovovivipar");
    //  Method perbedaan
    Binatang.setNama("Memiliki nama namun digunakan sebagai identitas spesies");
    Binatang.setBicara("Tidak dapat berbicara namun bisa mengeluarkan suara");
    Binatang.setBerpikir("Dapat berpikir namun tidak secara rasional dan tidak memiliki akal");
    
     Tumbuhan tanaman = new Tumbuhan();
    //  Method info
     tanaman.setMakhlukhidup("Tumbuhan Merupakan Makhluk Hidup");
     tanaman.setBerjalan("Tidak Dapat Berjalan hanya dapat menjalar");
     tanaman.setBernapas("Bernapas dengan stomata");
     tanaman.setBerkembangbiak("Berkembangbiak dengan Generatif, Vegtatif alami dan buatan");
    //  Method perbedaan
    tanaman.setNama("Memiliki nama namun digunakan sebagai identitas spesies");
    tanaman.setBicara("Tidak dapat berbicara");
    tanaman.setBerpikir("Tidak dapat berpikir");
  
     System.out.println("================================INFO Makhluk Hidup========================================");     
     System.out.println("=====================================Manusia==============================================");
     orang.info();
     System.out.println("======================================Hewan===============================================");
     Binatang.info();
     System.out.println("=====================================Tumbuhan=============================================");
     tanaman.info();
     System.out.println("==========================================================================================");
     System.out.println("===============================Perbedaan Makhluk Hidup====================================");  
     System.out.println("=====================================Manusia==============================================");
     orang.perbedaan();
     System.out.println("======================================Hewan===============================================");
     Binatang.perbedaan();
     System.out.println("=====================================Tumbuhan=============================================");
     tanaman.perbedaan();   
     System.out.println("==========================================================================================");

  
     Kebutuhan kmanusia = new Kebutuhan();
     kmanusia.setData("Makanan, Air, Sinar Matahari, Tempat Tinggal" ,"Pakaian, Pendidikan", orang);
     kmanusia.setKebutuhanumum("Makanan, Air, Sinar Matahari, Tempat Tinggal");
     kmanusia.setKebutuhankhusus("Pakaian, Pendidikan, Pekerjaan");
   
     Kebutuhan kbinatang = new Kebutuhan();
     kbinatang.setData("Makanan, Air, Sinar Matahari", Binatang);
     kbinatang.setKebutuhanumum("Makanan, Air, Sinar Matahari");
     kbinatang.setKebutuhankhusus("Tidak ada");

     Kebutuhan ktumbuhan = new Kebutuhan();
     ktumbuhan.setData("Air, Sinar Matahari", tanaman);
     ktumbuhan.setKebutuhanumum("Air, Sinar Matahari");
     ktumbuhan.setKebutuhankhusus("Tidak ada");

     Kebutuhan[] anu = new Kebutuhan[100];
     anu[0] =  kmanusia;
     anu[1] =  kbinatang;
     anu[2] =  ktumbuhan;
  
     System.out.println("=======================KEBUTUHAN YANG DI PERLUKAN MAKHLUK HIDUP===========================");
     int i = 0;
     for(Kebutuhan jalan: anu) {
         if (i < 3) {
         System.out.println(jalan.merupakan.makhlukhidup);
         System.out.println("Kebutuhan Makhluk hidup ke-" + i);
         System.out.println("Kebutuhan Umum = " + jalan.getKebutuhanumun());
         System.out.println("Kebutuhan Khusus = " + jalan.getKebutuhankhusus());  
         System.out.println("==========================================================================================");
         
         }
         i++;
       }
      
     }
     
   }
   
    
   
    
   