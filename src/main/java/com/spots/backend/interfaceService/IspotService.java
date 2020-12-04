package com.spots.backend.interfaceService;

import com.spots.backend.models.Spot;

import java.util.List;
import java.util.Optional;

public interface IspotService {
    public List<Spot>list();
    public Optional<Spot>listId(int id);
    public int save(Spot s);
    public void delete(int id);
}
