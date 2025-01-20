package com.arces.app_arces.controller;

import com.arces.app_arces.entity.Corso;
import com.arces.app_arces.service.CorsoService;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CorsoController {
    private static final Logger logger = LoggerFactory.getLogger(CorsoController.class);
    private final CorsoService corsoService;
    public CorsoController(CorsoService corsoService) {
        this.corsoService = corsoService; }

    @GetMapping("/corses")
    @ResponseBody

    public List<Corso> getAllCorses() {
        List <Corso> corses = corsoService.findAll();
        logger.debug("Retrieved students: {}", corses);
        return corses;
    }


    @GetMapping("/by-titolo/{titolo}/corses")
    public Corso getCorsoByTitolo(@PathVariable String titolo) {
        return corsoService.findCorsoByTitolo(titolo);
        //  logger.debug("Retrieved students: {}", students);
    }

    @GetMapping("/by-id/{id}/corses")
    public Corso getCorsoById(@PathVariable Long  id) {
        return corsoService.findCorsoByID(id);
        //  logger.debug("Retrieved students: {}", students);
    }


    @PostMapping("/new-corso")
    public ResponseEntity<Corso> createCorso(@RequestBody Corso corso) {
        Corso createdCorso = corsoService.createCorso(corso);
        return ResponseEntity.ok(createdCorso);
    }

}

