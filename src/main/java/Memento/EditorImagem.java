package Memento;

import java.util.ArrayList;
import java.util.List;

public class EditorImagem {
    private String imagem;
    private Filtro filtro;
    private List<AdicaoCamadas> adicaoCamadas = new ArrayList<>();
    private Transformacao transformacao;

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getImagem() {
        return imagem;
    }

    public void aplicarFiltro(Filtro filtro) {
        this.filtro = filtro;
    }

    public Filtro getFiltro() {
        return filtro;
    }

    public void adicionarCamada(AdicaoCamadas camada) {
        adicaoCamadas.add(camada);
    }

    public List<AdicaoCamadas> getAdicaoCamadas() {
        return new ArrayList<>(adicaoCamadas);
    }

    public void setTransformacao(Transformacao transformacao) {
        this.transformacao = transformacao;
    }

    public Transformacao getTransformacao() {
        return transformacao;
    }

    public Memento salvar() {
        return new Memento(imagem, filtro, new ArrayList<>(adicaoCamadas), transformacao);
    }

    public void restaurar(Memento memento) {
        this.imagem = memento.getImagem();
        this.filtro = memento.getFiltro();
        this.adicaoCamadas = memento.getAdicaoCamadas();
        this.transformacao = memento.getTransformacao();
    }
}
