package Mensagem;

public class MensagemWhatsAppSimulado implements IMensagem{
    @Override
    public void enviar(String mensagem) {
        System.out.println("[WHATSAPP] " + mensagem);
    }
}
