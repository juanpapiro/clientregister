package com.jp.clientregister.service.impl;

import com.jp.clientregister.dto.AddressDto;
import com.jp.clientregister.model.Address;
import com.jp.clientregister.repository.AddressRepository;
import com.jp.clientregister.service.AddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public AddressDto createAddress(AddressDto addressDto) {
        Address address = new Address();
        BeanUtils.copyProperties(addressDto, address);
        address = addressRepository.save(address);
        BeanUtils.copyProperties(address, addressDto);
        return addressDto;
    }
}
