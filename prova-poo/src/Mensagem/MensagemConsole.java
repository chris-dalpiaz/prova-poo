package Mensagem;

public class MensagemConsole implements IMensagem{
    @Override
    public void enviar(String mensagem) {
        System.out.println("[CONSOLE] " + mensagem);
    }
}
