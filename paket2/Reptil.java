package paket2;

public class Reptil extends Jenis{
    protected String sisik;
    protected String darahdingin;

    @Override
    public
    void jenis() {
        System.out.println("Nama Hewan: " +this.namah);
        System.out.println("Spesies Hewan: " +this.spesies);
        System.out.println("Cara Bergerak: " +this.caragerak);
        System.out.println("Ciri-Ciri: "+this.ciriciri);
        System.out.println("Makanan: " +this.makanan);
    }
    public void setSisik(String sisik) {
        this.sisik = sisik;
    }
    public void setDarahdingin(String darahdingin) {
        this.darahdingin = darahdingin;
    }
}
