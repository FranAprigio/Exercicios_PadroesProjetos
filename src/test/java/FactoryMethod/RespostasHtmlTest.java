package FactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RespostasHtmlTest {
    @Test
    void deveExecutarEnvioRespostaHtml() {
        IRespostaHttp resposta = RespostaHttpFactory.criarResposta("Html");
        assertEquals("Enviando resposta HTML", resposta.enviar());
    }

    @Test
    void deveCancelarEnvioRespostaHtml() {
        IRespostaHttp resposta = RespostaHttpFactory.criarResposta("Html");
        assertEquals("Cancelando resposta HTML", resposta.cancelar());
    }
}
