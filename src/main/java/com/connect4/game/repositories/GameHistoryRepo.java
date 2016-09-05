package com.connect4.game.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.connect4.game.models.GameHistory;

public interface GameHistoryRepo extends PagingAndSortingRepository<GameHistory, Integer>{

}
