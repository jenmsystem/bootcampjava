package com.bootcampjava.client.mapper;

import java.util.List;

import com.bootcampjava.client.domain.Client;
import com.bootcampjava.client.model.ClientModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;


@Mapper(componentModel = "spring")
public interface ClientMapper {
    Client clientModelToClient (ClientModel model);

    ClientModel clientToClientModel (Client client);

    List<ClientModel> clientsToClientModels(List<Client> clients);

    void update(@MappingTarget Client entity, ClientModel updateEntity);
}
