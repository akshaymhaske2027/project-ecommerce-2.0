package com.akshay.project_ecommerce.service.interfaces;

import com.akshay.project_ecommerce.dto.CategoryDto;
import com.akshay.project_ecommerce.dto.Response;

public interface CategoryService {
    Response createCategory(CategoryDto categoryRequest);
    Response updateCategory(Long categoryId, CategoryDto categoryRequest);
    Response getAllCategories();
    Response getCategoryById(Long categoryId);
    Response deleteCategory(Long categoryId);
}
