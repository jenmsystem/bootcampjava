package com.bootcampjava.client.service;

import com.bootcampjava.client.model.ClientModel;

import java.util.List;

public interface IClientService {
    List<ClientModel> findAll() throws Exception;

    ClientModel findById(Long id) throws Exception;

    ClientModel create(ClientModel clientModel) throws Exception;

    void update(Long id, ClientModel clientModel) throws Exception;

    void deleteById(Long id) throws Exception;
}
