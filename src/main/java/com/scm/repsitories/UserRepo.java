package com.scm.repsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import com.scm.entities.User;



@Repository
public interface UserRepo extends JpaRepository<User, String>{


    Optional<User> findByEmail(String email);

    Optional<User>  findByEmailAndPassword(String email, String password);

}
