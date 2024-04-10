package Proxy;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class SistemaArquivos implements ISistemaArquivos{

    private Integer numArquivo;
    private Integer quantArquivos;
    private String tituloArquivo;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAlteracao;

    public SistemaArquivos(int NumArquivo) {
        this.numArquivo = NumArquivo;
        SistemaArquivos objeto = BD.getSistemaArquivos(NumArquivo);
        this.quantArquivos = objeto.quantArquivos;
        this.tituloArquivo =objeto.tituloArquivo;
        this.dataCriacao = objeto.dataCriacao;
        this.dataAlteracao = objeto.dataAlteracao;
    }

    public SistemaArquivos(Integer numArquivo, Integer quantArquivos, String tituloArquivo, LocalDateTime dataCriacao, LocalDateTime dataAlteracao) {
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
    public List<LocalDateTime> obterDadosArquivo(Cliente cliente) {
        return Arrays.asList(this.dataCriacao, this.dataAlteracao);
    }

}
