package com.arces.app_arces.repository;

import com.arces.app_arces.entity.Settore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface SettoreRepository extends JpaRepository<Settore, Long> {

    Optional <Settore> findByName(String name);

}
