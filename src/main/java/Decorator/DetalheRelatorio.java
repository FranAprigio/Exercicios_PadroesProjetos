package Decorator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DetalheRelatorio extends RelatorioDecorator{

    public DetalheRelatorio(Relatorio relatorioDec) {
        super(relatorioDec);
    }

    @Override
    public String gerarRelatorio() {
        String conteudoRelatorio = super.gerarRelatorio();
        String detalhes = obterDetalhes();
        return conteudoRelatorio + "\n" + detalhes;
    }

    private String obterDetalhes() {
        LocalDateTime agora = LocalDateTime.now();
        String dataHora = agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String cidade = "Sua Cidade"; // Você pode substituir por sua lógica para obter a cidade atual
        return "Detalhes do relatório:\nData e Hora: " + dataHora + "\nCidade: " + cidade;
    }
}
