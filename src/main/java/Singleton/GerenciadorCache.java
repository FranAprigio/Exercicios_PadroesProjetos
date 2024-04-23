package Singleton;

public class GerenciadorCache {

    private String usuarioCache;
    private String produtoCache;
    private int contagemUsCache;
    private String destroyerCache;

    private GerenciadorCache() {
        usuarioCache = "Cache do usuário inicializado";
        produtoCache = "Cache de produtos inicializado";
        contagemUsCache = 0;
        destroyerCache = "Cache não destruído";
    }

    private static GerenciadorCache instance;

    public static GerenciadorCache getInstance() {
        if (instance == null){
            instance = new GerenciadorCache();
        }
        return instance;
    }

    public String getCacheUsuario() {
        return usuarioCache;
    }

    public String getCacheProduto() {
        return produtoCache;
    }

    public int getCacheContagem() {
        return contagemUsCache;
    }

    public String getDestroyerCache() {
        return destroyerCache;
    }

    public void setDestroyerCache(String destroyerCache) {
        this.destroyerCache = destroyerCache;
    }

    public void addCache(String cacheUsuario, String cacheProduto, int cacheContagem, String cacheDestroyer) {
        // Simula a adição de cache
        System.out.println("Caches adicionados:");
        if (cacheUsuario != null) {
            System.out.println("Cache do usuário adicionado: " + cacheUsuario);
            this.usuarioCache = cacheUsuario;
        }
        if (cacheProduto != null) {
            System.out.println("Cache de produtos adicionado: " + cacheProduto);
            this.produtoCache = cacheProduto;
        }
        if (cacheContagem >= 0) {
            System.out.println("Contagem de cache adicionada: " + cacheContagem);
            this.contagemUsCache = cacheContagem;
        }
        if (cacheDestroyer != null) {
            System.out.println("Cache destruidor adicionado: " + cacheDestroyer);
            this.destroyerCache = cacheDestroyer;
        }
    }

    public void destroy() {
        usuarioCache = null;
        produtoCache = null;
        contagemUsCache = 0;
        destroyerCache = "Cache destruído";
        instance = null;
    }
    @Override
    public String toString() {
        return "GerenciadorCache{" +
                "usuarioCache='" + usuarioCache + '\'' +
                ", produtoCache='" + produtoCache + '\'' +
                ", contagemUsCache=" + contagemUsCache +
                ", destroyerCache='" + destroyerCache + '\'' +
                '}';
    }
}
