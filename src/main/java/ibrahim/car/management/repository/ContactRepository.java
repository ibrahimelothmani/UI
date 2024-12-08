package ibrahim.car.management.repository;


import ibrahim.car.management.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactRepository {

    Optional<Object> findById(int id);
    void delete(Contact contact);
    List<Contact> findAll();
}