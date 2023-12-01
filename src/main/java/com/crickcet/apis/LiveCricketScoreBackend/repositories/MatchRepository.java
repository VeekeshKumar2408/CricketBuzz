package com.crickcet.apis.LiveCricketScoreBackend.repositories;

import com.crickcet.apis.LiveCricketScoreBackend.entites.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepository extends JpaRepository<Match,Integer> {
  //  Find the match by cricketTeam Name

    Optional<Match> findByTeamHeading(String teamHeading);
}
