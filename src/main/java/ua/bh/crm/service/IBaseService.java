package ua.bh.crm.service;

public interface IBaseService <E> {

    E create(E entity);
    E update(Long id, E entity);
    E findById(Long id);
    E findAll();
    void delete(Long id);
}
