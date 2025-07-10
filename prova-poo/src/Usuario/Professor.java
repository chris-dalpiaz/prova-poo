package Usuario;

import Multa.ICalculadoraDeMulta;

public class Professor extends UsuarioBiblioteca{


    public Professor(String nome, ICalculadoraDeMulta calculadoraDeMulta) {
        super(nome, calculadoraDeMulta);
    }

    @Override
    public double calcularMulta(Integer diasAtraso) {
        System.out.println("Valor total da multa do(a) "
                + this.getNome());
        return diasAtraso * 0.25;
    }
}
