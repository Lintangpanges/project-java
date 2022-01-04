package paket2;

public class Unggas extends Jenis {
    protected String bulu;
    protected String paruh;
    protected String sayap;


    @Override
    public
    void jenis() {
        System.out.println("Nama Hewan: " +this.namah);
        System.out.println("Spesies Hewan: " +this.spesies);
        System.out.println("Cara Bergerak: " +this.caragerak);
        System.out.println("Ciri-Ciri: "+this.ciriciri);
        System.out.println("Makanan: " +this.makanan);
    }

    public void setBulu(String bulu) {
        this.bulu = bulu;
    }
    public void setParuh(String paruh) {
        this.paruh = paruh;
    }
    public void setSayap(String sayap) {
        this.sayap = sayap;
    }
}
