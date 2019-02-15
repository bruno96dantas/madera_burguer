package br.com.bruno96dantas.madera_burguer.repositories;

import br.com.bruno96dantas.madera_burguer.models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
