package com.letsstartcoding.springbootexample.repository;

import com.letsstartcoding.springbootexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
