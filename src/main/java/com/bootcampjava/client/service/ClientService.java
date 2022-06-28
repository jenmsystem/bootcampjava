package com.bootcampjava.client.service;

import com.bootcampjava.client.domain.Client;
import com.bootcampjava.client.mapper.ClientMapper;
import com.bootcampjava.client.model.ClientModel;
import com.bootcampjava.client.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClientService  implements IClientService{

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public List<ClientModel> findAll() throws Exception {
        List<Client> clients = clientRepository.findAll();
        return clientMapper.clientsToClientModels(clients);
    }

    @Override
    public ClientModel findById(Long id) throws Exception {
        Optional<Client> client = clientRepository.findById(id);
        if(client.isPresent())	return clientMapper.clientToClientModel(client.get());
        else throw new Exception("Not clients");
    }

    @Override
    public ClientModel create(ClientModel clientModel) throws Exception {
        Client client = clientRepository.save(clientMapper.clientModelToClient(clientModel));
        return clientMapper.clientToClientModel(client);
    }

    @Override
    public void update(Long id, ClientModel clientModel) throws Exception {
        Optional<Client> clientOptional = clientRepository.findById(id);

        if(clientOptional.isPresent()) {
            Client clientToUpdate = clientOptional.get();
            clientMapper.update(clientToUpdate, clientModel);
            clientRepository.save(clientToUpdate);
        }
        else throw new Exception("Not clients");
    }

    @Override
    public void deleteById(Long id) throws Exception {
        clientRepository.deleteById(id);
    }
}
