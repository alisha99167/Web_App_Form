package com.webappform.webappform.Repositories;

import java.util.List;

import com.webappform.webappform.Models.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
    @Query("{name:'?0'}")
    User findItemByFirstName(String name);
    
    
}