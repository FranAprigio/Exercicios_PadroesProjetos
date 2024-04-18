package FactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RespostaXmlTest {
    @Test
    void deveExecutarEnvioRespostaXml() {
        IRespostaHttp resposta = RespostaHttpFactory.criarResposta("Xml");
        assertEquals("Enviando resposta XML", resposta.enviar());
    }

    @Test
    void deveCancelarEnvioRespostaXml() {
        IRespostaHttp resposta = RespostaHttpFactory.criarResposta("Xml");
        assertEquals("Cancelando resposta XML", resposta.cancelar());
    }
}
