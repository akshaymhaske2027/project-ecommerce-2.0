package com.akshay.project_ecommerce.service.interfaces;

import com.akshay.project_ecommerce.dto.LoginRequest;
import com.akshay.project_ecommerce.dto.Response;
import com.akshay.project_ecommerce.dto.UserDto;
import com.akshay.project_ecommerce.entity.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}