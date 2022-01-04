package paket2;

public class Mamalia extends Jenis {
    protected String rambut;
    protected String cakar;
    protected String kelenjarsusu;

    @Override
    public 
    void jenis(){
        System.out.println("Nama Hewan: " +this.namah);
        System.out.println("Spesies Hewan: " +this.spesies);
        System.out.println("Cara Bergerak: " +this.caragerak);
        System.out.println("Ciri-Ciri: "+this.ciriciri);
        System.out.println("Makanan: " +this.makanan);
    }

    public void setRambut(String rambut) {
        this.rambut = rambut;
    }
    public void setCakar(String cakar) {
        this.cakar = cakar;
    }
    public void setKelenjarsusu(String kelenjarsusu) {
        this.kelenjarsusu = kelenjarsusu;
    }
}


