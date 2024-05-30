package Memento;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEstados {
    private final List<Memento> historico = new ArrayList<>();
    private int indiceAtual = -1;

    public void salvarEstado(EditorImagem editorImagem) {
        while (historico.size() > indiceAtual + 1) {
            historico.remove(historico.size() - 1);
        }
        historico.add(editorImagem.salvar());
        indiceAtual++;
    }

    public void desfazer(EditorImagem editorImagem) {
        if (indiceAtual <= 0) {
            throw new RuntimeException("Não há estados anteriores para desfazer.");
        }
        indiceAtual--;
        Memento memento = historico.get(indiceAtual);
        editorImagem.restaurar(memento);
    }

    public void refazer(EditorImagem editorImagem) {
        if (indiceAtual >= historico.size() - 1) {
            throw new RuntimeException("Não há estados futuros para refazer.");
        }
        indiceAtual++;
        Memento memento = historico.get(indiceAtual);
        editorImagem.restaurar(memento);
    }

    public List<Memento> getHistorico() {
        return historico;
    }
}
