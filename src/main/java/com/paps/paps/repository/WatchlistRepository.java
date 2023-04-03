package com.paps.paps.repository;

import com.paps.paps.domains.Watchlist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchlistRepository extends CrudRepository<Watchlist, Long> {}
