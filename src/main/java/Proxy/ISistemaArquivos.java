package Proxy;

import java.time.LocalDateTime;
import java.util.List;

public interface ISistemaArquivos {
    List<String> obterDadosCliente();
    List<LocalDateTime> obterDadosArquivo(Cliente cliente);
}
