package com.bootcampjava.client.mapper;


import com.bootcampjava.client.domain.Register;
import com.bootcampjava.client.model.RegisterModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RegisterMapper {
    Register registerModelToRegister (RegisterModel model);

    RegisterModel registerToRegisterModel (Register register);

    List<RegisterModel> registersToRegisterModels(List<Register> registers);

    void update(@MappingTarget Register entity, RegisterModel updateEntity);
}
