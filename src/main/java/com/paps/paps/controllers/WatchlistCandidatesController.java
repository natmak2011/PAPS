package com.paps.paps.controllers;

import com.paps.paps.domains.Wachlist_Candidates;
import com.paps.paps.services.WatchlistCandidatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Service
public class WatchlistCandidatesController {

    @Autowired private WatchlistCandidatesService watchlistCandidatesService;
    @GetMapping("/api/watchlist/matches")


    public Iterable<Wachlist_Candidates> getAllRequests() {
        return watchlistCandidatesService.getAllHits();
    }


}
