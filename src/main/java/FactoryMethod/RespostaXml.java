package FactoryMethod;

public class RespostaXml implements IRespostaHttp {

    @Override
    public String enviar() {
        return "Enviando resposta XML";
    }

    @Override
    public String cancelar() {
        return "Cancelando resposta XML";
    }
}
