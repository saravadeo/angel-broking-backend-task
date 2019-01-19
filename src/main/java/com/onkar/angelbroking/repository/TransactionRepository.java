package com.onkar.angelbroking.repository;

import com.onkar.angelbroking.entity.Transaction;
import com.onkar.angelbroking.entity.User;

import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository to manage entity {@link Transaction}, which used to perfrom CRUD
 * operation on {@link Transaction}
 * 
 * @author Onkar Saravade
 *
 */
@Repository
public interface TransactionRepository extends
    JpaRepository<Transaction, String> {

  List<Transaction> findByUserAndCreatedGreaterThanEqual(final User user,
      final ZonedDateTime fromDate);

}
