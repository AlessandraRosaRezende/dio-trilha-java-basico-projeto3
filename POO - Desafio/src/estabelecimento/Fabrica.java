package estabelecimento;

import equipamentos.iphone.Iphone;
import equipamentos.musica.IPOD;
import equipamentos.musica.InterfaceMusic;
import equipamentos.navegadorInternet.InternetExplorer;
import equipamentos.navegadorInternet.InternetNavigator;
import equipamentos.telefone.InterfaceTelephone;
import equipamentos.telefone.Phone;

public class Fabrica {
    public static void main(String[] args) {
        InternetNavigator navegador = new InternetExplorer();
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        InterfaceMusic music = new IPOD();
        music.tocar();
        music.pausar();
        music.selecionarMusica();

        InterfaceTelephone telefone = new Phone();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorrerioVoz();

        Iphone iphone = new Iphone();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
