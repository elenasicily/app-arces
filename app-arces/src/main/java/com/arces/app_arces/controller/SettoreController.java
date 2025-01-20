package com.arces.app_arces.controller;


import com.arces.app_arces.entity.Settore;
import com.arces.app_arces.service.SettoreService;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SettoreController {
    private static final Logger logger = LoggerFactory.getLogger(SettoreController.class);
    private final SettoreService settoreService;
    public SettoreController(SettoreService settoreService) {
        this.settoreService = settoreService; }

    @GetMapping("/settores")
    @ResponseBody

    public List<Settore> getAllSettores() {
        List <Settore> settores = settoreService.findAll();
        logger.debug("Retrieved settores: {}", settores);
        return settores;
    }


    @GetMapping("/by-name/{name}/settores")
    public Settore getSettoreByName(@PathVariable String name) {
        return settoreService.findSettoreByName(name);
        //  logger.debug("Retrieved students: {}", students);
    }

    @GetMapping("/by-id/{id}/settores")
    public Settore getSettoreById(@PathVariable Long  id) {
        return settoreService.findSettoreByID(id);
        //  logger.debug("Retrieved students: {}", students);
    }

    @PostMapping("/new-settore")
    public ResponseEntity<Settore> createSettore(@RequestBody Settore settore) {
        Settore createdSettore = settoreService.createSettore(settore);
        return ResponseEntity.ok(createdSettore);
    }

}

