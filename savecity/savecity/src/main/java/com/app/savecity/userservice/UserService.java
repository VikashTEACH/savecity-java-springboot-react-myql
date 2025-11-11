package com.app.savecity.userservice;

import java.util.List;


import com.app.savecity.error.EntityNotFoundException;
import com.app.savecity.user.UserEntity;


public interface UserService {

	List<UserEntity> getAllUser() throws EntityNotFoundException;

	UserEntity saveUserInformation( UserEntity user);

	UserEntity findUserById(Long id) throws EntityNotFoundException;


	List<UserEntity> findByUserName(String fullName) throws EntityNotFoundException;

	String deleteUserById(Long id);

	UserEntity updateUserById(Long id, UserEntity user);

}
