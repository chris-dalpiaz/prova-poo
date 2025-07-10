package Usuario;

import Multa.ICalculadoraDeMulta;

public class Professor extends UsuarioBiblioteca{

    public Professor(String nome, Integer diasAtraso) {
        super(nome, diasAtraso);
    }

    @Override
    public double calcularMulta() {
        return 0.25 * diasAtraso;
    }
}
