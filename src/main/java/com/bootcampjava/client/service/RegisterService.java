package com.bootcampjava.client.service;


import com.bootcampjava.client.domain.Client;
import com.bootcampjava.client.domain.Fund;
import com.bootcampjava.client.domain.Register;
import com.bootcampjava.client.mapper.RegisterMapper;
import com.bootcampjava.client.model.RegisterModel;
import com.bootcampjava.client.repository.RegisterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RegisterService implements IRegisterService{
    private final RegisterRepository registerRepository;
    private final RegisterMapper registerMapper;
    @Override
    public List<RegisterModel> findAll() throws Exception {
        List<Register> registers = registerRepository.findAll();
        return registerMapper.registersToRegisterModels(registers);
    }

    @Override
    public RegisterModel findById(Long id) throws Exception {
        Optional<Register> register = registerRepository.findById(id);
        if(register.isPresent())	return registerMapper.registerToRegisterModel(register.get());
        else throw new Exception("Not register");
    }

    @Override
    public RegisterModel create(RegisterModel registerModel) throws Exception {
        Register register = registerRepository.save(registerMapper.registerModelToRegister(registerModel));
        return registerMapper.registerToRegisterModel(register);
    }

    @Override
    public void update(Long id, RegisterModel registerModel) throws Exception {
        Optional<Register> registerOptional = registerRepository.findById(id);

        if(registerOptional.isPresent()) {
            Register registerToUpdate = registerOptional.get();
            registerMapper.update(registerToUpdate, registerModel);
            registerRepository.save(registerToUpdate);
        }
        else throw new Exception("Not register");
    }

    @Override
    public void deleteById(Long id) throws Exception {
        registerRepository.deleteById(id);
    }
}
