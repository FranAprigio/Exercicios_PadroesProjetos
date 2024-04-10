package Proxy;

import java.util.HashMap;
import java.util.Map;

public class BD {

    private static Map<Integer, SistemaArquivos> integerSistemaArquivosMap = new HashMap<>();

    public static SistemaArquivos getSistemaArquivos(Integer numArquivo) {
        return integerSistemaArquivosMap.get(numArquivo);
    }

    public static void addSistemaArquivos(SistemaArquivos sistemaArquivos) {
        integerSistemaArquivosMap.put(sistemaArquivos.getnumArquivo(), sistemaArquivos);
    }
}
