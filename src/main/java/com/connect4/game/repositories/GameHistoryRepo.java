package com.connect4.game.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.connect4.game.models.GameHistory;

/**
 * Repository Interface used to Basic Crud Operation through spring-data and Querying data.
 * @author fadhilprm , Sep 6, 2016
 *	
 */
public interface GameHistoryRepo extends PagingAndSortingRepository<GameHistory, Integer>{

}
