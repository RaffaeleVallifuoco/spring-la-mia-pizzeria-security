package it.raffo.raffopizza.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.raffo.raffopizza.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}
