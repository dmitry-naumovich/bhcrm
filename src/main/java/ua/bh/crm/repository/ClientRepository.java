package ua.bh.crm.repository;

import org.springframework.data.repository.CrudRepository;
import ua.bh.crm.entity.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
