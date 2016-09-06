package com.connect4.game.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.connect4.game.models.GameHistory;
import com.connect4.game.services.GameHistoryService;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * The main Rest Endpoint class.
 * @author fadhilprm , Sep 6, 2016
 *	
 */
@RestController()
@RequestMapping(value = "/game")
public class DataController {

  @Autowired
  GameHistoryService gameHistoryService;

  /**
   * Save game history endpoint
   * 
   * @param objectNode Game history to be saved.
   * @return
   */
  @RequestMapping(value = "/history", method = RequestMethod.POST, consumes = "application/json",
      produces = "application/json")
  public ResponseEntity<Object> saveHistory(@RequestBody ObjectNode objectNode) {
   
    return new ResponseEntity<Object>( gameHistoryService.save(new GameHistory(objectNode.get("gameId").asLong(), objectNode.get("redPlayer").asText(),
        objectNode.get("blkPlayer").asText(),objectNode.get("score1").asText(), objectNode.get("score2").asText(),
        objectNode.get("winner").asText(),new Date())),HttpStatus.OK);
  }


  /**
   * Get game history endpoint, using ObjectNode as parameter which is contains paging information
   * 
   * @param objectNode paging parameter
   * @return
   */
  @RequestMapping(value = "/history", method = RequestMethod.GET, consumes = "application/json",
      produces = "application/json")
  public ResponseEntity<Object> getHistory(@RequestParam(value="offset", defaultValue="1")String offset,
      @RequestParam(value="limit", defaultValue="8")String limit,
      @RequestParam(value="order", defaultValue="Desc")String order,
      @RequestParam(value="sort", defaultValue="date")String sort) {

    return new ResponseEntity<Object>(gameHistoryService.getAll(Integer.valueOf(offset),Integer.valueOf(limit),
        order, sort),HttpStatus.OK);
  }

}
