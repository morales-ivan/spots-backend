package com.spots.backend.services;

import com.spots.backend.interfaceService.IphotographService;
import com.spots.backend.interfaces.IPhotograph;
import com.spots.backend.models.Photograph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhotographService implements IphotographService {
    @Autowired
    private IPhotograph data;

    @Override
    public List<Photograph> list() {
        return (List<Photograph>)data.findAll();
    }

    @Override
    public Optional<Photograph> listId(int id) {
        return data.findById(id);
    }

    public List<Photograph> listSpotId(int spotId) { return data.findBySpotId(spotId); }

    @Override
    public Photograph save(Photograph p) {
        return data.save(p);
    }

    @Override
    public void delete(int id) {

    }
}
