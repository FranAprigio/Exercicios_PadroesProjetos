package Flyweight;

import java.util.HashMap;
import java.util.Map;

// Fabrica Flyweigth para gerenciar objetos Flyweight

public class PontoInteresseFabricaFly {
    private static Map<String, PontoInteresseFly> flyweights = new HashMap<>();

    public static PontoInteresseFly getPontoInteresseFly(String categoria, String icone){
        String chave = categoria + "-" + icone;

        // Se o objetvo Flyweight existir, retorna-lo
        if(flyweights.containsKey(chave)){
            return flyweights.get(chave);
        } else {
            // Caso contrario, criar um novo e adiciona-lo ao mapa
           PontoInteresseFly flyweight = new Restaurante(categoria, icone);
           flyweights.put(chave, flyweight);
           return flyweight;
        }
    }
}

