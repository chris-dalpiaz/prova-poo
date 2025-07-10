package Multa;

import Usuario.UsuarioBiblioteca;

public class MultaFixaPorTipo implements ICalculadoraDeMulta {

    @Override
    public double calcular(UsuarioBiblioteca usuario) {
        return usuario.calcularMulta();
    }
}
