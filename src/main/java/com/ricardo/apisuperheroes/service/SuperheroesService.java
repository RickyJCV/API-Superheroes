package com.ricardo.apisuperheroes.service;

import java.util.List;

import com.ricardo.apisuperheroes.entity.Superheroe;

public interface SuperheroesService {

  List<Superheroe> getAllSuperheroes(String palabra);

  Superheroe getSuperheroe(long id);

  Superheroe updateSuperheroe(Superheroe superheroe);

  void deleteSuperheroe(long id);
}
