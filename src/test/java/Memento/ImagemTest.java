package Memento;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ImagemTest {

    private EditorImagem editor;
    private GerenciadorEstados gerenciador;

    @BeforeEach
    public void setUp() {
        editor = new EditorImagem();
        gerenciador = new GerenciadorEstados();
    }

    @Test
    public void deveArmazenarEstados() {
        editor.setImagem("ImagemOriginal.png");
        editor.aplicarFiltro(new ImagemEValida());
        editor.adicionarCamada(new AdicaoCamadas("Sem camada adicionada"));
        editor.setTransformacao(new Transformacao("Sem transformação"));
        gerenciador.salvarEstado(editor);

        editor.setImagem("ImagemEditada1.png");
        editor.aplicarFiltro(new Filtro("Filtro azulado"));
        editor.adicionarCamada(new AdicaoCamadas("Camada 1"));
        editor.setTransformacao(new Transformacao("Rotacionado 90 graus"));
        gerenciador.salvarEstado(editor);

        assertEquals(2, gerenciador.getHistorico().size());
    }

    @Test
    public void deveRetornarEstadoInicial() {
        editor.setImagem("ImagemOriginal.png");
        editor.aplicarFiltro(new ImagemEValida());
        editor.adicionarCamada(new AdicaoCamadas("Sem camada adicionada"));
        editor.setTransformacao(new Transformacao("Sem transformação"));
        gerenciador.salvarEstado(editor);

        assertEquals("ImagemOriginal.png", editor.getImagem());
        assertEquals("Sem filtro", editor.getFiltro().getDescricao());
        assertEquals("Sem camada adicionada", editor.getAdicaoCamadas().get(0).getDescricao());
        assertEquals("Sem transformação", editor.getTransformacao().getDescricao());
    }

    @Test
    public void deveRetornarEstadoAnterior() {
        editor.setImagem("ImagemOriginal.png");
        editor.aplicarFiltro(new ImagemEValida());
        editor.adicionarCamada(new AdicaoCamadas("Sem camada adicionada"));
        editor.setTransformacao(new Transformacao("Sem transformação"));
        gerenciador.salvarEstado(editor);

        editor.setImagem("ImagemEditada1.png");
        editor.aplicarFiltro(new Filtro("Filtro azulado"));
        editor.adicionarCamada(new AdicaoCamadas("Camada 1"));
        editor.setTransformacao(new Transformacao("Rotacionado 90 graus"));
        gerenciador.salvarEstado(editor);

        gerenciador.desfazer(editor);

        assertEquals("ImagemOriginal.png", editor.getImagem());
        assertEquals("Sem filtro", editor.getFiltro().getDescricao());
        assertEquals("Sem camada adicionada", editor.getAdicaoCamadas().get(0).getDescricao());
        assertEquals("Sem transformação", editor.getTransformacao().getDescricao());
    }

    @Test
    public void deveRetornarExcecaoIndiceInvalido() {
        editor.setImagem("ImagemOriginal.png");
        editor.aplicarFiltro(new ImagemEValida());
        editor.adicionarCamada(new AdicaoCamadas("Sem camada adicionada"));
        editor.setTransformacao(new Transformacao("Sem transformação"));
        gerenciador.salvarEstado(editor);

        Exception exception = assertThrows(RuntimeException.class, () -> {
            gerenciador.desfazer(editor);
            gerenciador.desfazer(editor);
        });

        String expectedMessage = "Não há estados anteriores para desfazer.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void deveRefazerEstado() {
        editor.setImagem("ImagemOriginal.png");
        editor.aplicarFiltro(new ImagemEValida());
        editor.adicionarCamada(new AdicaoCamadas("Sem camada adicionada"));
        editor.setTransformacao(new Transformacao("Sem transformação"));
        gerenciador.salvarEstado(editor);

        editor.setImagem("ImagemEditada1.png");
        editor.aplicarFiltro(new Filtro("Filtro azulado"));
        editor.adicionarCamada(new AdicaoCamadas("Camada 1"));
        editor.setTransformacao(new Transformacao("Rotacionado 90 graus"));
        gerenciador.salvarEstado(editor);

        gerenciador.desfazer(editor);
        gerenciador.refazer(editor);

        assertEquals("ImagemEditada1.png", editor.getImagem());
        assertEquals("Filtro azulado", editor.getFiltro().getDescricao());
        assertEquals("Sem camada adicionada", editor.getAdicaoCamadas().get(0).getDescricao());
        assertEquals("Rotacionado 90 graus", editor.getTransformacao().getDescricao());
    }
}
