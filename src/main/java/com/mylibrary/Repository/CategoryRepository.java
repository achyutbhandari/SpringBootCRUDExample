package com.mylibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mylibrary.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
