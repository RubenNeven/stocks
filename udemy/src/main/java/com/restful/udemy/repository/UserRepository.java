package com.restful.udemy.repository;

import com.restful.udemy.entitiy.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findUserByEmail(String email);

    UserEntity findByEmail(String email);
}
