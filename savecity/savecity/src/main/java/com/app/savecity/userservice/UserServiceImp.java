package com.app.savecity.userservice;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.savecity.address.Address;
import com.app.savecity.error.EntityNotFoundException;
import com.app.savecity.user.UserEntity;
import com.app.savecity.userrepository.UserAddressRepository;
import com.app.savecity.userrepository.UserRepository;


@Service
public class UserServiceImp implements UserService ,UserAddressService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserAddressRepository addressRepository;
	@Override
	public List<UserEntity> getAllUser() throws EntityNotFoundException {
	
		List<UserEntity> entity=userRepository.findAll();
		if(entity.isEmpty()) {
			throw new EntityNotFoundException(" Any Entity not present ");
		}
		return entity;
	}
	@Override
	public UserEntity saveUserInformation( UserEntity user) {
		
		return userRepository.save(user);
	}
	@Override
	public Address saveUserAddress( Address address) {
	
		return addressRepository.save(address);
	}
	@Override
	public UserEntity findUserById(Long id) throws EntityNotFoundException {
		
		Optional<UserEntity> found=userRepository.findById(id);
		
		if(!found.isPresent()) {
			throw new EntityNotFoundException("There are no User present with this id !! please enter valid id ");
		}
		
		return found.get();
	}
	@Override
	public List<UserEntity> findByUserName(String fullName) throws EntityNotFoundException {
		
		List<UserEntity> found=userRepository.findByFullNameIgnoreCase(fullName);
		if(found.isEmpty()) {
			throw new EntityNotFoundException("There are no user present with this name ");
		}
		
		return found;
	}
	@Override
	public String deleteUserById(Long id) {
		Optional<UserEntity> found=userRepository.findById(id);
		if(!found.isPresent()) {
			return "No entity present of this id ";
		}
		 userRepository.deleteById(id);
		 return "Delete userInformation successfully !!! ";
	}
	@Override
	public UserEntity updateUserById(Long id, UserEntity user) {
		UserEntity updateUser=userRepository.findById(id).get();
		if(Objects.nonNull(user.getFullName())&&!"".equalsIgnoreCase(user.getFullName())) {
			updateUser.setFullName(user.getFullName());
		}else if(Objects.nonNull(user.getAge())) {
			updateUser.setAge(user.getAge());
		}else if(Objects.nonNull(user.getMobailNo())) {
			updateUser.setMobailNo(user.getMobailNo());
		}else if(Objects.nonNull(user.getEmail())&&!"".equalsIgnoreCase(user.getEmail())) {
			updateUser.setEmail(user.getEmail());
		}
		if(Objects.nonNull(user.getAddress())) {
			Address addressuser=user.getAddress();
			if(Objects.nonNull(addressuser.getCityName())&&!"".equalsIgnoreCase(addressuser.getCityName())) {
				updateUser.getAddress().setCityName(addressuser.getCityName());
			}
			if(Objects.nonNull(addressuser.getPinCodeNo())) {
				updateUser.getAddress().setPinCodeNo(addressuser.getPinCodeNo());
			}
			if(Objects.nonNull(addressuser.getPostName())&&!"".equalsIgnoreCase(addressuser.getPostName())) {
				updateUser.getAddress().setPostName(addressuser.getPostName());
			}
			if(Objects.nonNull(addressuser.getStateName())&&!"".equalsIgnoreCase(addressuser.getStateName())) {
				updateUser.getAddress().setStateName(addressuser.getStateName());
			}
			if(Objects.nonNull(addressuser.getTehsilName())&&!"".equalsIgnoreCase(addressuser.getTehsilName())) {
				updateUser.getAddress().setTehsilName(addressuser.getTehsilName());
			}
			if(Objects.nonNull(addressuser.getVillageName())&&!"".equalsIgnoreCase(addressuser.getVillageName())) {
				updateUser.getAddress().setVillageName(addressuser.getVillageName());
			}
			if(Objects.nonNull(addressuser.getWordNo())&&!"".equalsIgnoreCase(addressuser.getWordNo())) {
				updateUser.getAddress().setWordNo(addressuser.getWordNo());
			}
		}
		return userRepository.save(updateUser);
	}

}
