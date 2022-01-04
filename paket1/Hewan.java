package paket1;

public  class Hewan extends  Perbedaan{
    public String spesies;
    protected String ciriciri;
    
    @Override
    public 
    void info(){
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