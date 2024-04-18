package FactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RespostaJsonTest {
    @Test
    void deveExecutarEnvioRespostaJson() {
        IRespostaHttp resposta = RespostaHttpFactory.criarResposta("Json");
        assertEquals("Enviando resposta JSON", resposta.enviar());
    }

    @Test
    void deveCancelarEnvioRespostaJson() {
        IRespostaHttp resposta = RespostaHttpFactory.criarResposta("Json");
        assertEquals("Cancelando resposta JSON", resposta.cancelar());
    }
}
