package Interpreter;

import java.util.Map;

public class RegraDeNegocio implements  InterpretadorExpressao{

    private String regra;
    public RegraDeNegocio(String regra){
        this.regra = regra;
    }
    @Override
    public boolean interpretador(Map<String,Integer> context){
        return context.containsKey(regra);
    }
}
