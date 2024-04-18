package FactoryMethod;

public class RespostaJson implements IRespostaHttp {

    @Override
    public String enviar() {
        return "Enviando resposta JSON";
    }

    @Override
    public String cancelar() {
        return "Cancelando resposta JSON";
    }
}
