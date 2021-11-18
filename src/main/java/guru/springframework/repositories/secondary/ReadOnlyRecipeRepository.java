package guru.springframework.repositories.secondary;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 6/13/17.
 */
public interface ReadOnlyRecipeRepository extends CrudRepository<Recipe, String> {
}
