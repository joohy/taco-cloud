package com.action.in.datastore.repository;

import com.action.in.datastore.domain.Taco;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TacoRepository extends CrudRepository<Taco, String> {
    Iterable<Taco> findAll(Pageable page);

    Optional<Taco> findAllById(Long id);
//    Taco save(Taco design);
}
