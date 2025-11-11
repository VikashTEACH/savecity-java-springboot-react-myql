package com.app.savecity.userrepository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.app.savecity.user.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>{

	
	List<UserEntity> findByFullNameIgnoreCase(String fullName);

	
}
