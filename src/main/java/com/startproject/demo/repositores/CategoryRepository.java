package com.startproject.demo.repositores;

import com.startproject.demo.entity.Category;
import com.startproject.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
