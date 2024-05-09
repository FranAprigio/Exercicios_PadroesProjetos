package Interpreter;

import java.util.Map;

public class Cliente {
    public Cliente(String[] args){

        InterpretadorExpressao regra1 = new RegraDeNegocio("regra1");
        InterpretadorExpressao regra2 = new RegraDeNegocio("regra2");

        Contexto contexto = new Contexto(Map.of("regra1", 1));
    }
}
