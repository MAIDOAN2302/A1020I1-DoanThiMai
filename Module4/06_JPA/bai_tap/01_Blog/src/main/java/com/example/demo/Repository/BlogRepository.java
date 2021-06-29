package com.example.demo.Repository;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findByAuthorContaining(String author, Pageable pageable);

    @Query(value = "SELECT  * FROM blog join ecommerce where blog.e_commerce_id = ecommerce.id and ecommerce.id = :id",
            nativeQuery = true)
    Page<Blog> findAllBlogByEcommerceId(@Param("id") int id, Pageable pageable);

    Page<Blog> findByAuthor(String author, Pageable pageable);
}
