public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void ligar(){  //metodo ligar
        ligada=true;
    }
    public void desligar(){  // metodo desligar, só inverteu o ligada para false
        ligada=false;
    }
}
