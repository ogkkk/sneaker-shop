package com.shop.sneaker.Repository;

import com.shop.sneaker.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Integer> {
}
