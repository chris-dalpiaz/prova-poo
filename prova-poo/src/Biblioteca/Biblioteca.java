package Biblioteca;

import Mensagem.IMensagem;
import Multa.ICalculadoraDeMulta;
import Usuario.UsuarioBiblioteca;

import java.util.List;

public class Biblioteca {
    private IMensagem mensagem;
    private ICalculadoraDeMulta calculadora;

    public Biblioteca(IMensagem mensagem, ICalculadoraDeMulta calculadora) {
        this.mensagem = mensagem;
        this.calculadora = calculadora;
    }

    public void processarMultas(List<UsuarioBiblioteca> usuarios) {
        for (UsuarioBiblioteca usuario : usuarios) {
            double multa = calculadora.calcular(usuario);
            mensagem.enviar("Usuário: " + usuario.getNome() +
                    "\nResumo: " + usuario.getResumo() +
                    "\nMulta: R$ " + multa);
        }
    }
}