package org.redis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.redis.annotation.AutoIncrement;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@NoArgsConstructor
@RedisHash("vault_keys")
public class VaultKeysModel {

    @Id
    @AutoIncrement
    private Integer id;
    private String keyOne;
    private String keyTwo;
    private String keyThree;
    private String token;

    public VaultKeysModel(String keyOne, String keyTwo, String keyThree, String token) {
        this.keyOne = keyOne;
        this.keyTwo = keyTwo;
        this.keyThree = keyThree;
        this.token = token;
    }
}
