package Memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private final String imagem;
    private final Filtro filtro;
    private final List<AdicaoCamadas> adicaoCamadas;
    private final Transformacao transformacao;

    public Memento(String imagem, Filtro filtro, List<AdicaoCamadas> adicaoCamadas, Transformacao transformacao) {
        this.imagem = imagem;
        this.filtro = filtro;
        this.adicaoCamadas = new ArrayList<>(adicaoCamadas);
        this.transformacao = transformacao;
    }

    public String getImagem() {
        return imagem;
    }

    public Filtro getFiltro() {
        return filtro;
    }

    public List<AdicaoCamadas> getAdicaoCamadas() {
        return new ArrayList<>(adicaoCamadas);
    }

    public Transformacao getTransformacao() {
        return transformacao;
    }
}
