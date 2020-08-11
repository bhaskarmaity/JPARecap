package com.org.JPARecap.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.JPARecap.Entity.User;

public interface UserRepository extends JpaRepository<User,Long>{
	

}
