package org.example.repository;

import org.example.entity.loginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface loginRepository extends JpaRepository<loginEntity,Long> {
}
