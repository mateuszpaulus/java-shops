package com.java_ecommerce.java_shops.service.user;

import com.java_ecommerce.java_shops.dto.UserDto;
import com.java_ecommerce.java_shops.model.User;
import com.java_ecommerce.java_shops.request.CreateUserRequest;
import com.java_ecommerce.java_shops.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);

    User createUser(CreateUserRequest request);

    User updateUser(UserUpdateRequest request, Long userId);

    void deleteUser(Long userId);

    UserDto convertUserToDto(User userId);

    User getAuthenticatedUser();
}
