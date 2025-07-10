package Mensagem;

import Usuario.UsuarioBiblioteca;

public class WhatsAppSimulado implements IMensagem{
    @Override
    public String mensagem(UsuarioBiblioteca destinatario, String mensagem) {
        System.out.println("Enviado via WHATSAPP a seguinte mensagem " +
                "para " + destinatario + ":\n");
        return mensagem;
    }
}
