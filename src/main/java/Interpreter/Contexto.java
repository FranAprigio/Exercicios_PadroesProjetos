package Interpreter;

import java.util.Map;

import static java.util.Map.of;

public class Contexto  {
    private Map<String, Integer> data;

    public Contexto(Map<String, Integer> data){
        this.data = data;
    }
    public Map<String, Integer> getData(){
        return data;
    }

}
