package FactoryMethod;

public class RespostaHttpFactory {

    public static IRespostaHttp criarResposta(String resposta) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("FactoryMethod.Resposta" + resposta);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Resposta do método inexistente");
        }
        if (!(objeto instanceof IRespostaHttp)) {
            throw new IllegalArgumentException("Resposta do método inválida");
        }
        return (IRespostaHttp) objeto;
    }
}
