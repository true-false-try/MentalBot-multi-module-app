package org.redis.controller;

import lombok.RequiredArgsConstructor;
import org.redis.dto.VaultKeysDto;
import org.redis.service.VaultKeysService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/redis")
public class VaultKeysController {
    private final VaultKeysService vaultKeysService;

    @PostMapping("save/vault/keys")
    public ResponseEntity<String> saveVaultKeys(@RequestBody VaultKeysDto vaultKeysDto) {
        String saveOk = vaultKeysService.saveVaultKeys(vaultKeysDto);
        return ResponseEntity.ok(saveOk);
    }
}
