package org.redis.service;

import org.redis.dto.VaultKeysDto;

public interface VaultKeysService {
    String saveVaultKeys(VaultKeysDto dao);
}
