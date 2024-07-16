package org.redis.repository;

import org.redis.model.VaultKeysModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VaultKeysRepository extends JpaRepository<VaultKeysModel, Long>, CrudRepository<VaultKeysModel, Long> {
    Optional<VaultKeysModel> save();
}
