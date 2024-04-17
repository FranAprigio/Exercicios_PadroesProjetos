package Decorator;

public class RelatorioInicial implements Relatorio{
    @Override
    public String gerarRelatorio() {
        return "Conteúdo do relatório básico";
    }
}
