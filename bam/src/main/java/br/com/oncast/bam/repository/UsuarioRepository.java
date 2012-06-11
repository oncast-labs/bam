package br.com.oncast.bam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UsuarioRepository extends JpaRepository<User, Long> {
}
