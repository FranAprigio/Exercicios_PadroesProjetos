package Decorator;

public class FormatacaoRelatorio extends RelatorioDecorator{
    public FormatacaoRelatorio(Relatorio relatorioDec) {
        super(relatorioDec);
    }

    @Override
    public String gerarRelatorio() {

        String conteudoBasico = super.gerarRelatorio();
        String linhaSeparadora = "====================";

        StringBuilder relatorioFormatado = new StringBuilder();
        relatorioFormatado.append(linhaSeparadora).append("\n");
        relatorioFormatado.append("Relatório Formatado").append("\n");
        relatorioFormatado.append(linhaSeparadora).append("\n");
        relatorioFormatado.append("\n");
        relatorioFormatado.append(conteudoBasico).append("\n");
        relatorioFormatado.append("\n");
        relatorioFormatado.append(linhaSeparadora);

        return relatorioFormatado.toString();
    }
}
