package ibrahim.car.management.repository;


import ibrahim.car.management.model.Client;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository {
    List<Client> findAll();
}
