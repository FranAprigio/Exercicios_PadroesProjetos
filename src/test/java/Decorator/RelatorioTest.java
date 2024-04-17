package Decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RelatorioTest {

    @Test
    void relatorioBasico() {
        Relatorio relatorioInicial = new RelatorioInicial();
        assertEquals("Conteúdo do relatório básico", relatorioInicial.gerarRelatorio());
    }
    @Test
    void relatorioDetalhado() {
        Relatorio relatorioInicial = new RelatorioInicial();
        Relatorio relatorioDetalhado = new DetalheRelatorio(relatorioInicial);
        String expectedStart = "Conteúdo do relatório básico\nDetalhes do relatório:\nData e Hora: ";
        String generated = relatorioDetalhado.gerarRelatorio();
        String dateTimeFormat = "dd/MM/yyyy HH:mm:ss";
        String expectedEnd = "\nCidade: Sua Cidade";
        assertEquals(true, generated.startsWith(expectedStart) && generated.endsWith(expectedEnd));
        assertEquals(dateTimeFormat.length(), generated.substring(expectedStart.length(), expectedStart.length() + dateTimeFormat.length()).length());
    }
    @Test
    void relatorioFormatado() {
        Relatorio relatorioFormatado = new FormatacaoRelatorio(new RelatorioInicial());
        String expected = "====================\n" +
                "Relatório Formatado\n" +
                "====================\n" +
                "\n" +
                "Conteúdo do relatório básico\n" +
                "\n" +
                "====================";
        assertEquals(expected, relatorioFormatado.gerarRelatorio());
    }

    @Test
    void relatorioDetalhadoFormatado() {
        Relatorio relatorioDetalhadoFormatado = new FormatacaoRelatorio(new DetalheRelatorio(new RelatorioInicial()));
        String expectedStart = "====================\n" +
                "Relatório Formatado\n" +
                "====================\n" +
                "\n" +
                "Conteúdo do relatório básico\n" +
                "Detalhes do relatório:\n" +
                "Data e Hora: ";
        String generated = relatorioDetalhadoFormatado.gerarRelatorio();
        String dateTimeFormat = "dd/MM/yyyy HH:mm:ss";
        String expectedEnd = "\nCidade: Sua Cidade\n====================";
        assertEquals(false, generated.startsWith(expectedStart) && generated.endsWith(expectedEnd));
        assertEquals(dateTimeFormat.length(), generated.substring(expectedStart.length(), expectedStart.length() + dateTimeFormat.length()).length());
    }
}
