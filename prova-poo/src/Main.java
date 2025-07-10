import Biblioteca.Biblioteca;
import Mensagem.IMensagem;
import Mensagem.MensagemConsole;
import Multa.ICalculadoraDeMulta;
import Multa.MultaFixaPorTipo;
import Multa.MultaProgressiva;
import Usuario.Aluno;
import Usuario.UsuarioBiblioteca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// ------------ criando mensagem ------------
        IMensagem mensagemConsole = new MensagemConsole();

        /// ------------ criando calculadores multa ------------
        ICalculadoraDeMulta multaProgressiva = new MultaProgressiva();
        ICalculadoraDeMulta multaFixaPorTipo = new MultaFixaPorTipo();

        /// ------------ criando biblioteca ------------
        Biblioteca bibliotecaSenac = new Biblioteca(mensagemConsole);

        /// ------------ alunos ------------
        UsuarioBiblioteca aluno1 = new Aluno("Alfredo", multaFixaPorTipo);
        UsuarioBiblioteca aluno2 = new Aluno("Maria", multaFixaPorTipo);
        UsuarioBiblioteca aluno3 = new Aluno("Takakura", multaFixaPorTipo);

        bibliotecaSenac.addUsuario(aluno1);
        bibliotecaSenac.addUsuario(aluno2);
        bibliotecaSenac.addUsuario(aluno3);

        /// ------------ testes ------------
        //alunos
        System.out.println(aluno1.calcularMulta(10));
        System.out.println(aluno1.calcularMulta(20));
        System.out.println(aluno1.calcularMulta(30));
    }
}