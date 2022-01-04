package paket1;

public abstract class MakhlukHidup extends Kebutuhan {
    public String makhlukhidup;
    protected  String berjalan;
    protected String bernapas;
    protected String berkembangbiak;

    abstract void info();
    
    public void setMakhlukhidup(String makhlukhidup) {
        this.makhlukhidup = makhlukhidup;
    }
    public void setBerjalan(String berjalan) {
        this.berjalan = berjalan;
    }
    public void setBernapas(String bernapas) {
        this.bernapas = bernapas;

        
    }
    public void setBerkembangbiak(String berkembangbiak) {
        this.berkembangbiak = berkembangbiak;
    }
}