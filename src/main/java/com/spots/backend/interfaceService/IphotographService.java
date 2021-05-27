package com.spots.backend.interfaceService;

import com.spots.backend.models.Photograph;

import java.util.List;
import java.util.Optional;

public interface IphotographService {
    public List<Photograph>list();
    public Optional<Photograph>listId(int id);
    public Photograph save(Photograph p);
    public void delete(int id);
}
