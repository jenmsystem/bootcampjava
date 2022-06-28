package com.bootcampjava.client.mapper;



import com.bootcampjava.client.domain.Fund;
import com.bootcampjava.client.model.FundModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FundMapper {
    Fund fundModelToFund (FundModel model);

    FundModel fundToFundModel (Fund fund);

    List<FundModel> fundsToFundModels(List<Fund> funds);

    void update(@MappingTarget Fund entity, FundModel updateEntity);
}
