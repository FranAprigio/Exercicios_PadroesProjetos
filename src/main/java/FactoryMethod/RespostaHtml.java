package FactoryMethod;

public class RespostaHtml implements IRespostaHttp {
    @Override
    public String enviar() {
        return "Enviando resposta HTML";
    }

    @Override
    public String cancelar() {
        return "Cancelando resposta HTML";
    }
}