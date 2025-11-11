package com.app.savecity.userrepository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.savecity.address.Address;


@Repository
public interface UserAddressRepository extends JpaRepository<Address, Long>{
	
}
