package com.bootcampjava.client.service;


import com.bootcampjava.client.model.RegisterModel;

import java.util.List;

public interface IRegisterService {
    List<RegisterModel> findAll() throws Exception;

    RegisterModel findById(Long id) throws Exception;

    RegisterModel create(RegisterModel registerModel) throws Exception;

    void update(Long id, RegisterModel registerModel) throws Exception;

    void deleteById(Long id) throws Exception;
}
