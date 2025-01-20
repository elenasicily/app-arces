package com.arces.app_arces.service;

import com.arces.app_arces.entity.Corso;
import com.arces.app_arces.entity.Settore;
import com.arces.app_arces.repository.CorsoRepository;
import com.arces.app_arces.repository.SettoreRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CorsoService {
    private static final Logger logger = LoggerFactory.getLogger(CorsoService.class);
    private final CorsoRepository corsoRepository;

    @Autowired
    public CorsoService(CorsoRepository corsoRepository) {
        this.corsoRepository = corsoRepository;
    }


    @Autowired
    private SettoreRepository settoreRepository;

    public List<Corso> findAll() {
        List<Corso> corses = corsoRepository.findAll();
        logger.debug("Corso found: {}", corses);
        return corses;
    }

    public Corso findCorsoByID (Long id) {
        return corsoRepository.findById(id).orElseThrow(()->new RuntimeException ("Student not found"));
    }

    public Corso findCorsoByTitolo (String titolo) {
        return corsoRepository.findByTitolo(titolo).orElseThrow(()->new RuntimeException ("Student not found"));
    }

   /* @Transactional
    public Corso updateCorsoByID (Long id) {
        Corso corso = corsoRepository.findById(id).orElseThrow(()->new RuntimeException ("Student not found")) ;
        corso.set
    }*/



    public Corso createCorso(Corso corso) {

                System.out.println(corso.toString());

            return corsoRepository.save(corso);
    }
}



