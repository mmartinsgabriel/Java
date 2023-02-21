public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
  
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println("Novo volume -> Volume atual : " + smartTv.volume);
        
        smartTv.diminuirVolume();
        System.out.println("Novo volume -> Volume atual : " + smartTv.volume);

        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.mudarCanal(23);

        System.out.println("Novo Canal -> Canal atual : " + smartTv.canal);

    }
}