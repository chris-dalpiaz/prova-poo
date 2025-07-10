package Usuario;

import Multa.ICalculadoraDeMulta;

public class Visitante extends UsuarioBiblioteca{


    public Visitante(String nome, ICalculadoraDeMulta calculadoraDeMulta) {
        super(nome, calculadoraDeMulta);
    }

    @Override
    public double calcularMulta(Integer diasAtraso) {
        System.out.println("Valor total da multa do(a) "
                + this.getNome());
        return diasAtraso * 1.00;
    }
}
