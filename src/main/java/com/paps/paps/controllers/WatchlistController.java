package com.paps.paps.controllers;

import com.paps.paps.domains.Watchlist;
import com.paps.paps.services.WatchlistService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@Service
public class WatchlistController {

    @Autowired private WatchlistService watchlistService;
    @PostMapping("/api/watchlists")

    public ResponseEntity<Watchlist> createWatchlist (@Valid @RequestBody Watchlist watchlist){

        Watchlist savedWatchlist = watchlistService.createWatchlist(watchlist);

        return new ResponseEntity<>(savedWatchlist, HttpStatus.CREATED);
    }


    @GetMapping("/api/watchlists")
    public Iterable<Watchlist> getAllAccounts() {
        return watchlistService.getAllAccounts();
//        return accountRepository.findAll();
    }
}
