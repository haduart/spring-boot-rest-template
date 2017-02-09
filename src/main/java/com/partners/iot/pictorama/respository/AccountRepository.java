package com.partners.iot.pictorama.respository;

import com.partners.iot.pictorama.persistence.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by haduart on 08/02/17.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}