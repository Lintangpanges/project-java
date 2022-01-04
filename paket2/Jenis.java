package paket2;
import paket1.Hewan;

public abstract class Jenis extends Hewan{
    protected String namah;
    protected String caragerak;
    protected String makanan;
    

    abstract void jenis();
    // abstract void tes();

    public void setNamah(String namah) {
        this.namah = namah;
    }
    public void setCaragerak(String caragerak) {
        this.caragerak = caragerak;
    }
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    public void setSpesies(String spesies) {
        this.spesies = spesies;
    } 
    public void setCiriciri(String ciriciri) {
        this.ciriciri = ciriciri;
    }
    
}