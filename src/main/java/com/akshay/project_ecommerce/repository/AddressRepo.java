package com.akshay.project_ecommerce.repository;

import com.akshay.project_ecommerce.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Long> {
}
