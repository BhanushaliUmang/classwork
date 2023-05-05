package com.example.employeeaddress.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeaddress.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address,Long>{
    
    @Modifying
    @Query(value = "update address set city = :city, state= :state, street =:street, zipcode =:zipcode where address_id = :id",nativeQuery = true)
    void updateAddressById(Long id,  String city, String state, String street, String zipcode);
}
