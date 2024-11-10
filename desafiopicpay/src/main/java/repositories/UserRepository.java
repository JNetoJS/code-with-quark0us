package repositories;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Optional;

@Entity
@Table(name = "users")
public class UserRepository extends PanacheEntity {

    public String document;

    // Outros campos

    // Método de consulta para buscar por documento
    public static Optional<UserRepository> findUserByDocument(String document) {
        return find("document", document).firstResultOptional();
    }
}




