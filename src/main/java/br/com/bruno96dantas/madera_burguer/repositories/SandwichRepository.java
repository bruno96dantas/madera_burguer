package br.com.bruno96dantas.madera_burguer.repositories;

import br.com.bruno96dantas.madera_burguer.models.Sandwich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SandwichRepository extends JpaRepository<Sandwich, Long> {
}
