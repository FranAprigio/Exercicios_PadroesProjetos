package Memento;

public class Transformacao implements ImagemEstado {
    private String descricao;

    public Transformacao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
