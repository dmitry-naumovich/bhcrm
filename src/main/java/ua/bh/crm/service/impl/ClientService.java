package ua.bh.crm.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.bh.crm.entity.Client;
import ua.bh.crm.repository.ClientRepository;
import ua.bh.crm.service.IClientService;

@Slf4j
@Service
public class ClientService implements IClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client create(Client entity) {
        return null;
    }

    @Override
    public Client update(Long id, Client entity) {
        return null;
    }

    @Override
    public Client findById(Long id) {
        return null;
    }

    @Override
    public Client findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
