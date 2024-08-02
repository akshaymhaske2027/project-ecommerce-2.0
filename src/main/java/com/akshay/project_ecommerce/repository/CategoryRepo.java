package com.akshay.project_ecommerce.repository;

import com.akshay.project_ecommerce.entity.Address;
import com.akshay.project_ecommerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {
}
