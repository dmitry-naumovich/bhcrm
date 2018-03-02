package ua.bh.crm.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ua.bh.crm.entity.Client;

public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {
}
