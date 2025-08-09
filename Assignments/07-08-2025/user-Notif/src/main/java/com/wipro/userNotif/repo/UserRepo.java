package com.wipro.userNotif.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.userNotif.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
