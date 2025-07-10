package Mensagem;

import Usuario.UsuarioBiblioteca;

public interface IMensagem {
    String mensagem(UsuarioBiblioteca destinatario, String mensagem);
}
