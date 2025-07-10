package Usuario;

import Multa.ICalculadoraDeMulta;

public class Aluno extends UsuarioBiblioteca {

    public Aluno(String nome, ICalculadoraDeMulta calculadoraDeMulta) {
        super(nome, calculadoraDeMulta);
    }

    @Override
    public double calcularMulta(Integer diasAtraso) {
        System.out.println("Valor total da multa do(a) "
                + this.getNome());
        return this.getCalculadoraDeMulta(diasAtraso);
    }

}
