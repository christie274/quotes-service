package edu.cnm.deepive.quotes.service;

import edu.cnm.deepive.quotes.model.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {

  Iterable<Tag> getAllByOrderByNameAsc();


}
