package com.adc.da.main.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.adc.da.util.util2.JRedisPoolConfig;
import com.adc.da.util.util2.JedisUtil;

import redis.clients.jedis.Jedis;

@Configuration
public class RedisConfig {
    /**
     * 设置host
     */
    @Value("${spring.redis.host}")
    private String host;
    
    /**
     * 设置port
     */
    @Value("${spring.redis.port}")
    private int port;
    
    /**
     * 设置password
     */
    @Value("${spring.redis.password}")
    private String password;

    /**
     * 获得jedis
     * @return
     */
    @Bean(value = "jedis")
    public Jedis getJedis() {
        try {
            JRedisPoolConfig.REDIS_IP = host;
            JRedisPoolConfig.REDIS_PORT = port;
            JRedisPoolConfig.REDIS_PASSWORD = password;
            Jedis jedis = JedisUtil.getInstance().getJedis();
            return jedis;
        } catch (Exception ex) {
            return null;
        }
    }
}