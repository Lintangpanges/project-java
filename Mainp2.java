import paket2.*;

public class Mainp2 {
    public static void main(String[] args) {

        Mamalia h1 = new Mamalia();
        // Method jenis
        h1.setNamah("Harimau, Sapi, Kucing, Anjing, Monyet, Rusa");
        h1.setSpesies("Mamalia");
        h1.setCaragerak("Dapat Berlari, Berenang, dan bisa Memegang sesuatu");
        h1.setCiriciri("Mempunyai kelenjar susu, Mempunyai rambut, Mempunyai kuku atau cakar, Bernapas dengan paru-paru ");
        h1.setMakanan("Buah, Tumbuhan dan Daging");

        Unggas h2 = new Unggas();
        // Method jenis
        h2.setNamah("Ayam, Bebek, Merpati, Angsa, Pinguin, Elang");
        h2.setSpesies("Unggas");
        h2.setCaragerak("Dapat Berjalan, Terbang, Berenang");
        h2.setCiriciri("Memiliki Paruh, Mempunyai bulu dan Meniliki Sayap");
        h2.setMakanan("Biji-bijian,Daging");

        Ikan h3 = new Ikan();
        // Method jenis
        h3.setNamah("Bandeng, Lele, Arwana, Hiu, Megalodon");
        h3.setSpesies("Ikan");
        h3.setCaragerak("Berenang");
        h3.setCiriciri("Memiliki Sirip, Tubuh ditutupi sisik atau lendir, Bernapas dengan Ingsang");
        h3.setMakanan("Ikan yang lebih kecil, daging, Kangkung air, Enceng gondok");

        Reptil h4 = new Reptil();
        // Method jenis
        h4.setNamah("Ular, Kadal, Kura-kura, Penyu, Buaya");
        h4.setSpesies("Reptil");
        h4.setCaragerak("Melata, Berjalan, Berenang");
        h4.setCiriciri("Kulit Bersisik, Berdarah Dingin,");
        h4.setMakanan("Serangga, Hewan kecil, buah-buahan, Daging");


        System.out.println("===============================INFO Makhluk Hidup=========================================");  
        System.out.println("==================================Jenis Hewan=============================================");  
        Hewanbaru macam2 = new Hewanbaru();
        macam2.spesies = "Mamalia, Unggas, Ikan, Reptil, Amfibi";
        macam2.macamhewan("Mamacam - Macam Jenis Hewan: "); 
        System.out.println("====================================Mamalia===============================================");
        h1.jenis();  
        System.out.println("====================================Unggas================================================");
        h2.jenis();
        System.out.println("=====================================Ikan=================================================");
        h3.jenis();
        System.out.println("====================================Reptil================================================");
        h4.jenis();
        System.out.println("==========================================================================================");


    }
}
