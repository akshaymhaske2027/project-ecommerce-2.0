package com.akshay.project_ecommerce.service.interfaces;

import com.akshay.project_ecommerce.dto.AddressDto;
import com.akshay.project_ecommerce.dto.Response;

public interface AddressService {
    Response saveAndUpdateAddress(AddressDto addressDto);
}
