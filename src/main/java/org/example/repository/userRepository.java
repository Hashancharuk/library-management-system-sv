package org.example.repository;

import org.example.entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends JpaRepository<userEntity,Long> {
    public userEntity findByUserName(String userName);
    Boolean existsByUserName(String userName);

}
