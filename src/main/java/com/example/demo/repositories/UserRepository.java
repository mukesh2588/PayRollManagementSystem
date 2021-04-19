package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	
	@Query(value="select * from user where u_id=:u_id",nativeQuery = true)
	public User login(@Param("u_id")int u_id);
	
	
	@Query(value="select u_type from user  where emailid=:emailid and password=:password",nativeQuery = true)
	public String checkLogin(@Param("emailid")String emailid,@Param("password")String password);
	
	@Query(value= "select u_type from user where u_type=:u_type",nativeQuery = true)
	public List<User> getByUType(@Param("u_type")String u_type);
}
