import Biblioteca.Biblioteca;
import Mensagem.IMensagem;
import Mensagem.MensagemWhatsAppSimulado;
import Multa.ICalculadoraDeMulta;
import Multa.MultaFixaPorTipo;
import Multa.MultaProgressiva;
import Usuario.Aluno;
import Usuario.Professor;
import Usuario.UsuarioBiblioteca;
import Usuario.Visitante;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ICalculadoraDeMulta calcularPorTipo = new MultaFixaPorTipo();
        ICalculadoraDeMulta calcularPorProgressiva = new MultaProgressiva();

        List<UsuarioBiblioteca> usuarios = Arrays.asList(
                new Aluno("Pedro", 4),
                new Professor("Ana", 2),
                new Visitante("Lucas", 3)
        );

        // Você pode trocar as estratégias aqui:
        IMensagem msg = new MensagemWhatsAppSimulado();
        ICalculadoraDeMulta calc = new MultaFixaPorTipo();
        // ICalculadoraDeMulta calc = new MultaProgressiva();

        Biblioteca biblioteca = new Biblioteca(msg, calc);
        biblioteca.processarMultas(usuarios);

    }
}