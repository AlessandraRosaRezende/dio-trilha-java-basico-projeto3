package equipamentos.iphone;

import equipamentos.musica.InterfaceMusic;
import equipamentos.navegadorInternet.InternetNavigator;
import equipamentos.telefone.InterfaceTelephone;

public class Iphone implements InterfaceMusic, InterfaceTelephone, InternetNavigator {

    public void exibirPagina() {
        System.out.println("Exibindo pagina pelo Iphone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba pelo Iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina pelo Iphone");
    }

    public void ligar() {
        System.out.println("Ligando pelo Iphone");
    }

    public void atender() {
        System.out.println("Atendendo pelo Iphone");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz pelo Iphone");
    }

    public void tocar() {
        System.out.println("Tocando musica pelo Iphone");
    }

    public void pausar() {
        System.out.println("Pausando musica pelo Iphone");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando musica pelo Iphone");
    }

    

}
