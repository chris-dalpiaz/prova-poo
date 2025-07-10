package Mensagem;

import Usuario.UsuarioBiblioteca;

public class MensagemConsole implements IMensagem{
    @Override
    public String mensagem(UsuarioBiblioteca destinatario, String mensagem) {
        System.out.println("Enviado via CONSOLE a seguinte mensagem " +
                "para " + destinatario + ":\n");
        return mensagem;
    }
}
