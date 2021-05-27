package com.spots.backend.services;

import java.util.List;
import java.util.Optional;

import com.spots.backend.interfaceService.IspotService;
import com.spots.backend.interfaces.ISpot;
import com.spots.backend.models.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpotService implements IspotService {
    @Autowired
    private ISpot data;

    @java.lang.Override
    public List<Spot> list() {
        return (List<Spot>)data.findAll();
    }

    @java.lang.Override
    public Optional<Spot> listId(int id) {
        return data.findById(id);
    }

    @java.lang.Override
    public Spot save(Spot s) {
        return data.save(s);
    }

    @java.lang.Override
    public void delete(int id) {

    }
}
