package com.iluwatar.caching.practice;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 描述：
 *
 * @author biguodong
 * Create time 2018-11-05 下午12:01
 **/
public class GuavaCacheTest {

    /**
     *
     * 首先，我们将创建CacheLoader - 用于计算存储在缓存中的值。从这里，我们将使用方便的CacheBuilder使用给定的规范来构建我们的缓存：
     */
    @Test
    public void whenCacheMiss_thenValueIsComputed() {
        CacheLoader<String, String> loader;
        loader = new CacheLoader<String, String>() {
            @Override
            public String load(String key) {
                return key.toUpperCase();
            }
        };

        LoadingCache<String, String> cache;
        cache = CacheBuilder.newBuilder().build(loader);

        assertEquals(0, cache.size());
        assertEquals("HELLO", cache.getUnchecked("hello"));
        assertEquals(1, cache.size());
    }
}
