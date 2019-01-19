package com.onkar.angelbroking.repository;

import com.onkar.angelbroking.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository to manage entity {@link User}
 * 
 * @author Onkar Saravade
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

  User findByUsername(final String username);

}
