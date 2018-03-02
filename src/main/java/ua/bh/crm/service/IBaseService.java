package ua.bh.crm.service;

import org.springframework.data.domain.Pageable;
import java.util.Collection;

public interface IBaseService <E> {

    E create(E entity);
    E update(Long id, E entity);
    E findById(Long id);
    Collection<E> findAll(Pageable pageable);
    void delete(Long id);
}
