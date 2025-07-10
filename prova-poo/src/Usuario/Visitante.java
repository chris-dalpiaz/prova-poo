package Usuario;

import Multa.ICalculadoraDeMulta;

public class Visitante extends UsuarioBiblioteca{

    public Visitante(String nome, Integer diasAtraso) {
        super(nome, diasAtraso);
    }

    @Override
    public double calcularMulta() {
        return diasAtraso;
    }
}
