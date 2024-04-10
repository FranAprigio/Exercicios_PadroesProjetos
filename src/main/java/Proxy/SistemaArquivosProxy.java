package Proxy;

import java.util.List;

public class SistemaArquivosProxy implements ISistemaArquivos{

    private SistemaArquivos sistemaArquivos;
    private Integer numArquivo;

    public SistemaArquivosProxy(Integer numArquivo){
        this.numArquivo = numArquivo;
    }

    @Override
    public List<String> obterDadosCliente() {
        if (this.sistemaArquivos == null){
            this.sistemaArquivos = new SistemaArquivos(this.numArquivo);
        }
        return this.sistemaArquivos.obterDadosCliente();
    }

    @Override
    public List<Float> obterDadosArquivo(Cliente cliente) {
        if (!cliente.isAtivo()){
            throw new IllegalArgumentException("O Cliente esta inativo");
        }
        if (this.sistemaArquivos == null){
            this.sistemaArquivos = new SistemaArquivos(this.numArquivo);
        }
        return this.sistemaArquivos.obterDadosArquivo(cliente);
    }
}
