package Multa;

public class MultaProgressiva implements ICalculadoraDeMulta {

    @Override
    public double tipoMulta(Integer diasAtraso) {
        Double porcentagemMulta = 0.10; //porcentagem multa 10%
        Double multaDiaria = 0.50; // valor inicial por dias em atraso
        Double total = 0.0; //valor total
        Integer intervalo = 3; //intervalo de dias para aumento

        for (int i = 0; i <= diasAtraso; i++) {// 10% a cada 3 dias
            if (diasAtraso % intervalo == 0) {
                //calculando quanto de acréscimo deve de ser feito
                Double acrescimo = multaDiaria * porcentagemMulta;
                multaDiaria += acrescimo; //adicionando acréscimo na multa diária
                total += multaDiaria; //somando multadiaria + total;

                System.out.println("HORA DO AUMENTO!!!!\n " +
                        "Valor da multa diária atual: "
                        + multaDiaria + "\n" + "Valor atual da multa: "
                        + total + "\n");
            } else {
                total += multaDiaria;
                System.out.println("Valor da multa diária atual: "
                        + multaDiaria + "\n" + "Valor atual da multa: "
                        + total + "\n");
            }
        }
        System.out.println("Valor total: R$");
        return total;
    }
}
