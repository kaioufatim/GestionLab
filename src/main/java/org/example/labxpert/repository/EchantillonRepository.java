package org.example.labxpert.repository;

import org.example.labxpert.entites.Echantillon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EchantillonRepository extends JpaRepository<Echantillon,Long> {
}
