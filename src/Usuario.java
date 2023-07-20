public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();  //criou um novo objeto
        // usou o SmartTv dentro de smartTv(com letra minuscula) para chamar as variaveis de outra classe

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: "+smartTv.volume);

        System.out.println("TV Ligada:" + smartTv.ligada);
        System.out.println("Canal atual:" + smartTv.canal);
        System.out.println("TV Ligada:" + smartTv.ligada);

        smartTv.ligar();// O .ligar está chamando este método desta classe de nome smartTv
        System.out.println("Novo status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();;
        System.out.println("Novo status -> Tv desligou K raio " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);

        smartTv.diminuirVolume();;
        System.out.println(smartTv.volume);



    }
}
