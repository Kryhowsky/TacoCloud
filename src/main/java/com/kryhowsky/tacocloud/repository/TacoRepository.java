package com.kryhowsky.tacocloud.repository;

import com.kryhowsky.tacocloud.model.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
