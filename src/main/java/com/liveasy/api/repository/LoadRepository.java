package com.liveasy.api.repository;

import com.liveasy.api.model.Loads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoadRepository extends JpaRepository<Loads, String> {


}
