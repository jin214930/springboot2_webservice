package org.example.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

// Posts 클래스로 DB를 접근하게 해줌
// JpaRepository<Entity, PK 타입>를 상속하면 기본적인 CRUD 메소드가 자동으로 생성됨
public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
