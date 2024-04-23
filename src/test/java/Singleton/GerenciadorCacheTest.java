package Singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GerenciadorCacheTest {

    @Test
    void testAddCache() {

        GerenciadorCache cache = GerenciadorCache.getInstance();

        System.out.println("Estado do cache antes da adição: " + cache);
        cache.addCache("Novo cache de usuário", "Novo cache de produto", 10, "Novo cache destruidor");
        System.out.println("Estado do cache após adição: " + cache);

        assertEquals("Novo cache de usuário", cache.getCacheUsuario());
        assertEquals("Novo cache de produto", cache.getCacheProduto());
        assertEquals(10, cache.getCacheContagem());
        assertEquals("Novo cache destruidor", cache.getDestroyerCache());
    }
    @Test
    void testSingletonInstance() {

        GerenciadorCache cache1 = GerenciadorCache.getInstance();
        GerenciadorCache cache2 = GerenciadorCache.getInstance();

        assertSame(cache1, cache2);
    }

    @Test
    void testCacheValuesInitialization() {

        GerenciadorCache cache = GerenciadorCache.getInstance();

        assertEquals("Cache do usuário inicializado", cache.getCacheUsuario());
        assertEquals("Cache de produtos inicializado", cache.getCacheProduto());
        assertEquals(0, cache.getCacheContagem());
        assertEquals("Cache não destruído", cache.getDestroyerCache());
    }

    @Test
    void testDestroy() {

        GerenciadorCache cache = GerenciadorCache.getInstance();

        System.out.println("Estado do cache antes da destruição: " + cache);

        cache.destroy();

        System.out.println("Estado do cache após destruição: " + cache);

        assertNull(cache.getCacheUsuario());
        assertNull(cache.getCacheProduto());
        assertEquals(0, cache.getCacheContagem());
        assertEquals("Cache destruído", cache.getDestroyerCache());
    }
}
