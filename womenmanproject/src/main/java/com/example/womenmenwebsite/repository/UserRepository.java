package com.example.womenmenwebsite.repository;

import com.example.womenmenwebsite.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    @Query("select COUNT(m)>0 from User m where UPPER(m.username)=UPPER(?1) and m.password=?2")
    Boolean isExistUser(String username, String password);

    Optional<User> findOptionalByUsernameAndPassword(String username, String password);
}
