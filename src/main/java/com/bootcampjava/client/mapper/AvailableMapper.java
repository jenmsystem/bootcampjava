package com.bootcampjava.client.mapper;

import com.bootcampjava.client.domain.Available;
import com.bootcampjava.client.domain.Register;
import com.bootcampjava.client.model.AvailableModel;
import com.bootcampjava.client.model.RegisterModel;
import org.mapstruct.MappingTarget;

import java.util.List;

public interface AvailableMapper {
    Available availableModelToAvailable (AvailableModel model);

    AvailableModel availableToAvailableModel (Available available);

    List<AvailableModel> availableToAvailableModels(List<Available> available);

    void update(@MappingTarget Available entity, AvailableModel updateEntity);
}
