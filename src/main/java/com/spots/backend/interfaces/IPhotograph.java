package com.spots.backend.interfaces;

import com.spots.backend.models.Photograph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPhotograph extends CrudRepository<Photograph, Integer> {
    List<Photograph> findBySpotId(@Param(value = "spotId") int spotId);
}
