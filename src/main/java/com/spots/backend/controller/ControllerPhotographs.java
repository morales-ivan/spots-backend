package com.spots.backend.controller;

import com.spots.backend.interfaceService.IphotographService;
import com.spots.backend.models.Photograph;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/photographs")
@CrossOrigin(origins = "*")
public class ControllerPhotographs {

    @Autowired
    private IphotographService service;

    @GetMapping("/list")
    public List<Photograph> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public Optional<Photograph> read(@PathVariable Integer id) {
        return service.listId(id);
    }

    @GetMapping("/spot/{spotId}")
    public List<Photograph> get(@PathVariable Integer spotId) { return service.listSpotId(spotId); }

    @PostMapping(value = "/post", consumes = "application/json", produces = "application/json")
    public Photograph save(@Validated @RequestBody Photograph p) {
        return service.save(p);
    }
}
