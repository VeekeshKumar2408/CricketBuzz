package com.crickcet.apis.LiveCricketScoreBackend.services;


import com.crickcet.apis.LiveCricketScoreBackend.entites.Match;

import java.util.List;

public interface MatchService {
    //get all matches
    List<Match> getAllMatches();

    //get live matches
    List<Match> getLiveMatches();

    //Point table
    List<List<String>> getPointTable();

}
