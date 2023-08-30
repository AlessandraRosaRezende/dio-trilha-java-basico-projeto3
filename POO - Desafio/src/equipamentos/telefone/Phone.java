package equipamentos.telefone;

public class Phone implements InterfaceTelephone{
    public void ligar() {
        System.out.println("Ligando pelo telefone");
    }

    public void atender() {
        System.out.println("Atendendo pelo telefone");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz pelo telefone");
    }
   
}
