package com.ricardo.apisuperheroes.repository;

import java.util.List;

import com.ricardo.apisuperheroes.entity.Superheroe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperheroesRepository extends JpaRepository<Superheroe, Long> {

  @Query(value = "FROM superheroes s WHERE LOWER(s.nombre) LIKE %:palabra%")
  List<Superheroe> findByNameContaining(@Param("palabra") String palabra);

}
