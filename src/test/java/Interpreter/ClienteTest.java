package Interpreter;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClienteTest {
    @Test
    public void testarInterpretador(){
        // Definindo as regras de negócio
        InterpretadorExpressao regra1 = new RegraDeNegocio("regra1");
        InterpretadorExpressao regra2 = new RegraDeNegocio("regra2");

        // Definindo o contexto com os dados
        Map<String, Integer> data1 = new HashMap<>();
        data1.put("regra1", 1);
        Contexto contexto1 = new Contexto(data1);

        Map<String, Integer> data2 = new HashMap<>();
        data2.put("regra2", 1);
        Contexto contexto2 = new Contexto(data2);

        // Interpretando as regras de negócio
        // Verifica se a regra 1 é válida
        assertTrue(regra1.interpretador(contexto1.getData()));

        // Verifica se a regra 2 é válida
        assertFalse(regra2.interpretador(contexto1.getData()));

        // Verifica se a regra 1 é válida
        assertFalse(regra1.interpretador(contexto2.getData()));

        // Verifica se a rega 2 é válida
        assertTrue(regra2.interpretador(contexto2.getData()));
    }
}
