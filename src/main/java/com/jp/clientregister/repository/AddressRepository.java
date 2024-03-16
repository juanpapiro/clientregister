package com.jp.clientregister.repository;

import com.jp.clientregister.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
