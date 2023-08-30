package equipamentos.musica;

public class IPOD implements InterfaceMusic {
    public void tocar() {
        System.out.println("Tocando musica pelo IPOD");
    }

    public void pausar() {
        System.out.println("Pausando musica pelo IPOD");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando musica pelo IPOD");
    }
   
    
}
