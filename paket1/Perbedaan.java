package paket1;

public abstract class Perbedaan extends MakhlukHidup {
    protected String nama;
    protected String bicara;
    protected String berpikir;

    abstract void perbedaan();

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setBicara(String bicara) {
        this.bicara = bicara;
    }
    public void setBerpikir(String berpikir) {
        this.berpikir = berpikir;
    }
    
}
