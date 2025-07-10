package Usuario;

import Multa.ICalculadoraDeMulta;

public abstract class UsuarioBiblioteca {
    protected String nome;
    private ICalculadoraDeMulta calculadoraDeMulta;


    public UsuarioBiblioteca(String nome, ICalculadoraDeMulta calculadoraDeMulta) {
        this.nome = nome;
        this.calculadoraDeMulta = calculadoraDeMulta;
    }

    public abstract double calcularMulta
            (Integer diasAtraso);

    public String getResumo() {
        return "";
    }

    public String getNome() {
        return nome;
    }

    public double getCalculadoraDeMulta(Integer diasAtraso) {
        return calculadoraDeMulta.tipoMulta(diasAtraso);
    }
}
