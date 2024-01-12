package org.example.labxpert.repository;

import org.example.labxpert.entites.Reactif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReactiveRepository extends JpaRepository<Reactif,Long> {
}
