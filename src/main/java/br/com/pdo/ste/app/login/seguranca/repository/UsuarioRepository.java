package br.com.pdo.ste.app.login.seguranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pdo.repository.ListQueryDslPredicateExecutor;
import br.com.pdo.ste.app.login.seguranca.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario , Long>, ListQueryDslPredicateExecutor<Usuario> {

}
