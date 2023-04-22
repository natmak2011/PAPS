package com.paps.paps.repository;

import com.paps.paps.domains.Validation_List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationListsRepository extends CrudRepository<Validation_List, Long> {

}
