package org.example.labxpert.repository;

import org.example.labxpert.entites.Analyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyseRepository extends JpaRepository<Analyse,Long> {
}
