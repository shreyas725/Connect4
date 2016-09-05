package com.connect4.game.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.connect4.game.helper.DatatableSet;
import com.connect4.game.models.GameHistory;
import com.connect4.game.repositories.GameHistoryRepo;


@Service("gameHistoryService")
@Async
public class GameHistoryService implements CommonService<GameHistory> {
  private Logger logger = LoggerFactory.getLogger(GameHistoryService.class);
  @Autowired
  GameHistoryRepo gameHistoryRepo;

  @Override
  public GameHistory save(GameHistory t) {
    logger.info("saving new game history ,".concat(t.toString()));
  
    return gameHistoryRepo.save(t);
  }

  @Override
  public GameHistory deleteById(GameHistory t) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public GameHistory getById(Long id) {
    
    return null;
  }

  @Override
  public DatatableSet getAll(Integer offset, Integer limit, String order, String sort) {
    Page<GameHistory> page=gameHistoryRepo.findAll(new PageRequest(offset / limit, limit, Sort.Direction.fromString(order), sort));
    return new DatatableSet(page.getTotalElements(), page.getContent());
  }



}
