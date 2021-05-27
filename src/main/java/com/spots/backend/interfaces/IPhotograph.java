package com.spots.backend.interfaces;

import com.spots.backend.models.Photograph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhotograph extends CrudRepository<Photograph, Integer> {
}
