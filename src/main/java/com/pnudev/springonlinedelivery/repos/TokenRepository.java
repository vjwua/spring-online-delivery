package com.pnudev.springonlinedelivery.repos;

import com.pnudev.springonlinedelivery.models.Token;
import com.pnudev.springonlinedelivery.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {
    List<Token> findByUser(User user);

    Optional<Token> findByValue(String jwt);
}
