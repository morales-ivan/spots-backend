package com.spots.backend.interfaces;

import com.spots.backend.models.Spot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISpot extends CrudRepository<Spot, Integer> {
}
