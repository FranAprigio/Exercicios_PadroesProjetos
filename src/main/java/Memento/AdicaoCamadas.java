package Memento;

public class AdicaoCamadas implements ImagemEstado {
    private String descricao;

    public AdicaoCamadas(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}
