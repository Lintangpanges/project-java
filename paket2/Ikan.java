package paket2;

public class Ikan extends Jenis {
    protected String sirip;
    protected String lendir;
    protected String ingsang;

    @Override
    public
    void jenis() {
        System.out.println("Nama Hewan: " +this.namah);
        System.out.println("Spesies Hewan: " +this.spesies);
        System.out.println("Cara Bergerak: " +this.caragerak);
        System.out.println("Ciri-Ciri: "+this.ciriciri);
        System.out.println("Makanan: " +this.makanan);
    }
    public void setSirip(String sirip) {
        this.sirip = sirip;
    }
    public void setLendir(String lendir) {
        this.lendir = lendir;
    }
    public void setIngsang(String ingsang) {
        this.ingsang = ingsang;
    }
}
