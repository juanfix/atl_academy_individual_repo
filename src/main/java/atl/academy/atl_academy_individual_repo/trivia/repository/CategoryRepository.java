package atl.academy.atl_academy_individual_repo.trivia.repository;

import atl.academy.atl_academy_individual_repo.trivia.entities.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CategoryRepository {
    @PersistenceContext
    EntityManager entityManager; // Conexion a la base de datos

    public Category findById(Long id) {
        return entityManager.find(Category.class, id);
    }

}
