package Maratonajava.devdojo.introducao.EstruturaDeRepeticao;

public class EstruturasDeRepeticao04Exercicio {

    // dado o valor de um carro descubra em quantas vezes ele pode ser parcelado.
    // condição: ValorParcela >= 1000
    public static void main(String[] args) {

        double valorCarro = 40000;
        double parcela = valorCarro;

        for (int i = 1; parcela > 1000; i++) {
            parcela = valorCarro / i;
            System.out.print("Qtde parcelas: " + i);
            System.out.println(" valor: " + parcela);
        }
    }
}
