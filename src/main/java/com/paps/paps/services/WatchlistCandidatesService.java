package com.paps.paps.services;

import com.paps.paps.domains.Wachlist_Candidates;
import com.paps.paps.repository.WatchlistCandidatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WatchlistCandidatesService {

    //Singleton pattern --> create only one object in memory
    @Autowired  private WatchlistCandidatesRepository watchlistCandidatesRepository;


      public Iterable<Wachlist_Candidates> getAllHits() {

        return watchlistCandidatesRepository.findAll();
    }

    }



