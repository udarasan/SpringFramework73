package org.example.security_backend.repository;

import org.example.security_backend.entity.Role;
import org.example.security_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    /*
    //custom query

    @Query(value = "select * from User where id = ?1",nativeQuery = true)
    Optional<User> findbyusername(String username);*/

    /*
    //custom update queery

    @Modifying
    @Query(value = "select * from User where id = ?1",nativeQuery = true)
    Optional<User> findbyusername(String username);

    */
}
