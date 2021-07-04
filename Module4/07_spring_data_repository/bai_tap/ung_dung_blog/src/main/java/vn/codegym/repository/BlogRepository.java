package vn.codegym.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Blog;
@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findAllByName(String name, Pageable pageable);
}
