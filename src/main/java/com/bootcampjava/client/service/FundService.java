package com.bootcampjava.client.service;

import com.bootcampjava.client.domain.Client;
import com.bootcampjava.client.domain.Fund;
import com.bootcampjava.client.mapper.FundMapper;
import com.bootcampjava.client.model.FundModel;
import com.bootcampjava.client.repository.FundRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FundService implements IFundService{

    private final FundRepository fundRepository;
    private final FundMapper fundMapper;
    @Override
    public List<FundModel> findAll() throws Exception {
        List<Fund> funds = fundRepository.findAll();
        return fundMapper.fundsToFundModels(funds);
    }

    @Override
    public FundModel findById(Long id) throws Exception {
        Optional<Fund> fund = fundRepository.findById(id);
        if(fund.isPresent())	return fundMapper.fundToFundModel(fund.get());
        else throw new Exception("Not fund");
    }

    @Override
    public FundModel create(FundModel fundModel) throws Exception {
        Fund fund = fundRepository.save(fundMapper.fundModelToFund(fundModel));
        return fundMapper.fundToFundModel(fund);

    }


    @Override
    public void update(Long id, FundModel fundModel) throws Exception {
        Optional<Fund> fundOptional = fundRepository.findById(id);

        if(fundOptional.isPresent()) {
            Fund fundToUpdate = fundOptional.get();
            fundMapper.update(fundToUpdate, fundModel);
            fundRepository.save(fundToUpdate);
        }
        else throw new Exception("Not fund");
    }

    @Override
    public void deleteById(Long id) throws Exception {
        fundRepository.deleteById(id);
    }
}
