package Decorator;

public class RelatorioDecorator implements Relatorio{

    protected Relatorio relatorioDec;

    public RelatorioDecorator(Relatorio relatorioDec) {
        this.relatorioDec = relatorioDec;
    }

    @Override
    public String gerarRelatorio() {
        return relatorioDec.gerarRelatorio();
    }
}
