package paket2;

import paket1.Hewan;

public class Hewanbaru extends  Hewan implements InterfaceHewan{

    public void tes(){
        System.out.println("macamhewan");
    }

    public void macamhewan(String jhewan){
        System.out.println( jhewan + this.spesies);
    } 


}