package Flyweight;

public class SIGClienteTest {
    public static void main(String[] args){
        PontoInteresseFly restaurante1 = PontoInteresseFabricaFly.getPontoInteresseFly("Restaurante", "IconeA");
        PontoInteresseFly restaurante2 = PontoInteresseFabricaFly.getPontoInteresseFly("Restaurante", "IconeB");

        PontoInteresseFly escola1 = PontoInteresseFabricaFly.getPontoInteresseFly("Escola", "IconeA");
        PontoInteresseFly escola2 = PontoInteresseFabricaFly.getPontoInteresseFly("Escola", "IconeB");

        // Exibir informacoes dos Pontos de Interesse
        System.out.println("Informacoes do Restaurante 1: ");
        restaurante1.mostrarInformacoes(10, 20);

        System.out.println("\nInformacoes do Restaurante 2: ");
        restaurante2.mostrarInformacoes(15, 25);

        System.out.println("\nInformacoes da Escola 1:");
        escola1.mostrarInformacoes(30, 40);

        System.out.println("\nInformaceos da Escola 2: ");
        escola2.mostrarInformacoes(35, 50);
    }
}
