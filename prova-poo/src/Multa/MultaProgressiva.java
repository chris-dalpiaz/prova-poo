package Multa;

import Usuario.UsuarioBiblioteca;

public class MultaProgressiva implements ICalculadoraDeMulta{

    @Override
    public double calcular(UsuarioBiblioteca usuario) {
        Integer limitador = 3;
        Double multa = 0.50;

        for(int i = 1; i <= usuario.getDiasAtraso(); i++){
            if (i % limitador == 0){
                multa *= 1.1;
            } else {
                multa += 0.5;
            }
        }
        return multa;
    }
}
