package Usuario;

public class Aluno extends UsuarioBiblioteca {

    public Aluno(String nome, Integer diasAtraso) {
        super(nome, diasAtraso);
    }

    @Override
    public double calcularMulta() {
        return 0.50 * diasAtraso;
    }

}
