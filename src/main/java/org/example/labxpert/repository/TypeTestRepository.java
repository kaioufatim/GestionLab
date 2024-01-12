package org.example.labxpert.repository;

import org.example.labxpert.entites.TypeTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeTestRepository extends JpaRepository<TypeTest,Long> {
}
