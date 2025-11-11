package com.app.savecity.usercontroleer;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.savecity.address.Address;
import com.app.savecity.error.EntityNotFoundException;
import com.app.savecity.user.UserEntity;
import com.app.savecity.userservice.UserAddressService;
import com.app.savecity.userservice.UserService;


@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserAddressService userAddress;
	
	//save userAddress in databse
	@PostMapping("/savecity/addresses")
	public Address saveUserAddress( @RequestBody Address address) {
		return userAddress.saveUserAddress(address);
	}
	
	//save user in databse 
	@PostMapping("/savecity/user")
	public UserEntity saveUserInformation( @RequestBody UserEntity user) {
		return userService.saveUserInformation(user);
	}
	
	//find all users
	@GetMapping("/savecity/users")
	public List<UserEntity> getAllUser() throws EntityNotFoundException{
		return userService.getAllUser();
	}
	
	
	//find user with help of userId
	@GetMapping("/savecity/user/id/{id}")
	public UserEntity findByUserId(@PathVariable("id") Long id) throws EntityNotFoundException {
		return userService.findUserById(id);
	}
	
	//find user to using user name
	@GetMapping("/savecity/user/name/{fullName}")
	public List<UserEntity> findByUserName(@PathVariable("fullName") String fullName) throws EntityNotFoundException{
		return userService.findByUserName(fullName);
	}
	//delete user using user id 
	@DeleteMapping("/savecity/deleteuser/id/{id}")
	public String deleteUserById(@PathVariable("id") Long id) {
		return userService.deleteUserById(id);
	}
	
	//update All user information using user id 
	@PutMapping("/savecity/updateuser/id/{id}")
	public UserEntity updateUserById(@PathVariable("id") Long id ,@RequestBody UserEntity user) {
		return userService.updateUserById(id,user);
	}
	
}
