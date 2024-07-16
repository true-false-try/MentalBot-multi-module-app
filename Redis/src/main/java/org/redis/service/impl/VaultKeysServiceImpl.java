package org.redis.service.impl;

import lombok.RequiredArgsConstructor;
import org.redis.dto.VaultKeysDto;
import org.redis.model.VaultKeysModel;
import org.redis.repository.VaultKeysRepository;
import org.redis.service.VaultKeysService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VaultKeysServiceImpl implements VaultKeysService {
    private final VaultKeysRepository repository;

    @Override
    public String saveVaultKeys(VaultKeysDto dao) {
        VaultKeysModel vaultKeysEntity = new VaultKeysModel(dao.getKeyOne(),dao.getKeyTwo(),dao.getKeyThree(),dao.getToken());
        repository.save(vaultKeysEntity);
        return null;
    }
}
