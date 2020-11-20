package com.sitesimplu.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sitesimplu.User;

//repositories are interfaces ---- extends jparepo with class that needs the repo and the primary key type
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	
}