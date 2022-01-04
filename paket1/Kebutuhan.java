package paket1;

public class Kebutuhan{
    private String kebutuhanumum;
    private String kebutuhankhusus;
    // private String perbedaan;
    public MakhlukHidup merupakan;


    public void setData(String kebutuhanumum, MakhlukHidup merupakan){
        this.setKebutuhanumum(kebutuhanumum);
        this.merupakan = merupakan;
    }
    public void setData(String kebutuhanumum, String kebutuhankhusus,Manusia merupakan){
        this.setKebutuhanumum(kebutuhanumum);
        this.setKebutuhankhusus(kebutuhankhusus);
        this.merupakan = merupakan;
    }
    
    public void setKebutuhanumum(String kebutuhanumum) {
        this.kebutuhanumum = kebutuhanumum;
    }
    public String getKebutuhanumun() {
        return this.kebutuhanumum;
    }
    public void setKebutuhankhusus(String kebutuhankhusus) {
        this.kebutuhankhusus = kebutuhankhusus;
    }
    public String getKebutuhankhusus() {
        return this.kebutuhankhusus;
    }
    
}
    
