package com.paps.paps.repository;

import com.paps.paps.domains.Wachlist_Candidates;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchlistCandidatesRepository extends CrudRepository<Wachlist_Candidates, Long> {}
