package com.spots.backend.controller;

import java.util.List;
import java.util.Optional;

import com.spots.backend.interfaceService.IspotService;
import com.spots.backend.models.Spot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/spots")
@CrossOrigin(origins = "*")
public class ControllerSpots {

    @Autowired
    private IspotService service;

    @GetMapping("/list")
    public List<Spot> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Optional<Spot> read(@PathVariable Integer id) {
        return service.listId(id);
    }

    @PostMapping(value = "/post", consumes = "application/json", produces = "application/json")
    public Spot save(@Validated @RequestBody Spot s) {
        return service.save(s);
    }
}
