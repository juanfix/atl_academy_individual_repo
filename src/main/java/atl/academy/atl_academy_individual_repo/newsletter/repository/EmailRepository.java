package atl.academy.atl_academy_individual_repo.newsletter.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class EmailRepository {

    @PersistenceContext
    EntityManager entityManager; // Conexion a la base de datos

    public List<String> getEmail(){
        return entityManager.createQuery("SELECT email FROM Prospect").getResultList();
    }

    public void saveEmail(String userEmail){
        entityManager.createQuery("INSERT INTO Prospect (email)" +
                "VALUES (:paramEmail)")
                .setParameter("paramEmail", userEmail)
                .executeUpdate();
    }

    public void deleteEmail(Long idEmail){
        entityManager.createQuery("DELETE FROM Prospect WHERE id=:paramIdEmail")
                .setParameter("paramIdEmail", idEmail)
                .executeUpdate();
    }

}
