package paket1;

public class Manusia extends Perbedaan{
    protected String pekerjaan;
    protected String ras;
    protected String agama;

    @Override
    public
    void info() {
        System.out.println(this.berjalan);
        System.out.println(this.bernapas);
        System.out.println(this.berkembangbiak);
    }
    @Override
    public
    void perbedaan() {
        System.out.println(this.nama);
        System.out.println(this.bicara);
        System.out.println(this.berpikir);
    }
}