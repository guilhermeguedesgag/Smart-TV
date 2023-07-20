public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();
        // usou o SmartTv dentro de smartTv(com letra minuscula) para chamar as variaveis de outra classe

        System.out.println("TV Ligada:" + smartTv.ligada);
        System.out.println("Canal atual:" + smartTv.canal);
        System.out.println("TV Ligada:" + smartTv.ligada);
    }
}
