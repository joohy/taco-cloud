package com.action.in.taco.cloud.core.repository;

import com.action.in.taco.cloud.core.domain.Taco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoRepository extends CrudRepository<Taco, String> {
//    Taco save(Taco design);
}
