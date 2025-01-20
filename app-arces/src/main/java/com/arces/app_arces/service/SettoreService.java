package com.arces.app_arces.service;


import com.arces.app_arces.entity.Corso;
import com.arces.app_arces.entity.Settore;
import com.arces.app_arces.repository.SettoreRepository;
//import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class SettoreService {
    private static final Logger logger = LoggerFactory.getLogger(SettoreService.class);
    private final SettoreRepository settoreRepository;

    @Autowired
    public SettoreService(SettoreRepository settoreRepository) {
        this.settoreRepository = settoreRepository;
    }


    public List<Settore> findAll() {
        List<Settore> settores = settoreRepository.findAll();
        logger.debug("Settore found: {}", settores);
        return settores;
    }

    public Settore findSettoreByID (Long id) {
        return settoreRepository.findById(id).orElseThrow(()->new RuntimeException ("Settore not found"));
    }

    public Settore findSettoreByName (String name) {
        return settoreRepository.findByName(name).orElseThrow(()->new RuntimeException ("Settore not found"));
    }

    public Settore createSettore(Settore settore) {

        System.out.println(settore.toString());

        return settoreRepository.save(settore);
    }

}