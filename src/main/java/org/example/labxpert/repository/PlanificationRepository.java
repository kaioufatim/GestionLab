package org.example.labxpert.repository;

import org.example.labxpert.entites.Planification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanificationRepository extends JpaRepository<Planification,Long> {
}
