package Flyweight;

public class Restaurante implements PontoInteresseFly{

    private String categoria;
    private String icone;

    public Restaurante(String categoria, String icone){
        this.categoria = categoria;
        this.icone = icone;
    }

    @Override
    public void mostrarInformacoes(int latitude, int longitude){
        System.out.println("Categoria: " + categoria);
        System.out.println("Icone: " + icone);
        System.out.println("Localização: (" + latitude + ", " + longitude + ")");
    }
}
