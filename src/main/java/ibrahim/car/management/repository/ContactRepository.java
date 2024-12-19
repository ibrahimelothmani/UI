package ibrahim.car.management.repository;


import ibrahim.car.management.dto.ContactDto;
import ibrahim.car.management.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

    Optional<Object> findById(int id);
    void delete(Contact contact);
    List<Contact> findAll();
    Contact save(Contact contact);
}