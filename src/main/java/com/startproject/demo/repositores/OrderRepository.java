package com.startproject.demo.repositores;

import com.startproject.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<User, Long> {

}
