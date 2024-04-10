package Proxy;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

public class SistemaArquivos implements ISistemaArquivos{

    private Integer numArquivo;
    private Integer quantArquivos;
    private String tituloArquivo;
    private Timestamp dataCriacao;
    private Timestamp dataAlteracao;

    public SistemaArquivos(int NumArquivo) {
        this.numArquivo = NumArquivo;
        SistemaArquivos objeto = BD.getSistemaArquivos(NumArquivo);
        this.quantArquivos = objeto.quantArquivos;
        this.tituloArquivo =objeto.tituloArquivo;
        this.dataCriacao = objeto.dataCriacao;
        this.dataAlteracao = objeto.dataAlteracao;
    }

    public SistemaArquivos(Integer numArquivo, Integer quantArquivos, String tituloArquivo, Timestamp dataCriacao, Timestamp dataAlteracao) {
        this.numArquivo = numArquivo;
        this.quantArquivos = quantArquivos;
        this.tituloArquivo = tituloArquivo;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
    }

    public Integer getnumArquivo() {
        return numArquivo;
    }

    @Override
    public List<String> obterDadosCliente() {
        return Arrays.asList(String.valueOf(this.numArquivo), String.valueOf(this.quantArquivos));
    }

    @Override
    public List<Float> obterDadosArquivo(Cliente cliente) {
        return Arrays.asList((float) this.dataCriacao.getTime(), (float) this.dataAlteracao.getTime());
    }

}
