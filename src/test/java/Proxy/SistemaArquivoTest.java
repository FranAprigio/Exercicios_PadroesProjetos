package Proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SistemaArquivoTest {

    @BeforeEach
    void setUp() {
        BD.addSistemaArquivos(new SistemaArquivos(1, 5, "Censurado", LocalDateTime.now(), LocalDateTime.now()));
        BD.addSistemaArquivos(new SistemaArquivos(2, 5, "Dados Sensíveis", LocalDateTime.now(), LocalDateTime.now()));

    }

    @Test
    void deveRetornarDadosCliente() {
        SistemaArquivosProxy sistemaArquivos = new SistemaArquivosProxy(1);

        assertEquals(Arrays.asList("1", "5"), sistemaArquivos.obterDadosCliente());
    }

}
