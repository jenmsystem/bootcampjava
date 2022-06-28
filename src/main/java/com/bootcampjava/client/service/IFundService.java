package com.bootcampjava.client.service;

import com.bootcampjava.client.model.FundModel;

import java.util.List;

public interface IFundService {
    List<FundModel> findAll() throws Exception;

    FundModel findById(Long id) throws Exception;

    FundModel create(FundModel fundModel) throws Exception;

    void update(Long id, FundModel fundModel) throws Exception;

    void deleteById(Long id) throws Exception;
}
