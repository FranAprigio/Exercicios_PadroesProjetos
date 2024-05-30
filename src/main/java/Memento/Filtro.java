package Memento;

public class Filtro implements ImagemEstado {
    private String descricao;

    public Filtro(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
