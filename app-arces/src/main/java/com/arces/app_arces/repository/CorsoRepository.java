package com.arces.app_arces.repository;

import com.arces.app_arces.entity.Corso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface CorsoRepository extends JpaRepository<Corso, Long> {

    // Пример дополнительного метода поиска студента по email
    Optional <Corso> findByTitolo(String titolo);

}

