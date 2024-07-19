package org.redis.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.redis.repository.RedisRepository;
import org.redis.service.RedisService;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RedisServiceImpl implements RedisService {
    private final RedisRepository redisRepository;

    @Override
    public Object getVaultAuth() {
        return redisRepository.getVaultAuth();
    }
}
