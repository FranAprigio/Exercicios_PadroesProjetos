package Proxy;

import java.util.List;

public interface ISistemaArquivos {
    List<String> obterDadosCliente();
    List<Float> obterDadosArquivo(Cliente cliente);
}
