package com.paps.paps.services;

import com.paps.paps.domains.Watchlist;
import com.paps.paps.repository.WatchlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WatchlistService {

    //Singleton pattern --> create only one object in memory
    @Autowired  private WatchlistRepository watchlistRepository;

    public Watchlist createWatchlist(Watchlist watchlist) {


        return watchlistRepository.save(watchlist);
    }


    public Iterable<Watchlist> getAllAccounts() {

        return watchlistRepository.findAll();
    }





}



