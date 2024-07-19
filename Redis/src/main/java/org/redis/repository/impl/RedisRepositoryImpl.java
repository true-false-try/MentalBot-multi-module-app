package org.redis.repository.impl;

import lombok.RequiredArgsConstructor;
import org.redis.repository.RedisRepository;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPooled;
import redis.clients.jedis.json.Path;


import java.util.Map;

import static org.redis.constants.RedisHashKeyConstant.HASH_KEY_VAULT_AUTH;


@Repository
@RequiredArgsConstructor
public class RedisRepositoryImpl implements RedisRepository {
    private final JedisPooled jedisPooled;

    @Override
    public Object getVaultAuth() {
        Object jsonObject = String.valueOf(jedisPooled.jsonGet(HASH_KEY_VAULT_AUTH.getName()));
        System.out.println(jsonObject);
        return jsonObject;
    }
}
