package com.D.Daid.repositories;

import com.D.Daid.models.DaidModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaidRepository extends CrudRepository<DaidModel, Long> {
    
}
