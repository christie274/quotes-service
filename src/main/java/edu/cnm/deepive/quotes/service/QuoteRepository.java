package edu.cnm.deepive.quotes.service;

import edu.cnm.deepive.quotes.model.entity.Quote;
import edu.cnm.deepive.quotes.model.entity.Source;
import edu.cnm.deepive.quotes.model.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Long> {

  Iterable<Quote> getAllByOrderByTextAsc();

  Iterable<Quote> getAllBySourceOrderByTextAsc(Source source);

  Iterable<Quote> getAllByTagsContainingOrderByTextAsc(Tag tag);

}
