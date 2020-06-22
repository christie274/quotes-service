package edu.cnm.deepive.quotes.service;

import edu.cnm.deepive.quotes.model.entity.Source;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourceRepository extends JpaRepository<Source, Long> {

  Iterable<Source> getAllByOrderByNameAsc();

}