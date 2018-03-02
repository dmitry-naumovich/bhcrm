package ua.bh.crm.service.impl;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.bh.crm.entity.Client;
import ua.bh.crm.repository.ClientRepository;
import ua.bh.crm.service.IClientService;
import org.springframework.data.domain.Pageable;

@Slf4j
@Service
public class ClientService implements IClientService {

    private ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public Client create(Client entity) {
        log.debug("Creating client: {}", entity);
        return repository.save(entity);
    }

    @Override
    public Client update(Long id, Client entity) {
        entity.setId(id);
        return repository.save(entity);
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> client = repository.findById(id);
        if (!client.isPresent()) {
            // throw
        }
        return client.get();
    }

    @Override
    public Collection<Client> findAll(Pageable pageable) {
        Iterable<Client> clients = repository.findAll(pageable);
        return Lists.newArrayList(clients);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
