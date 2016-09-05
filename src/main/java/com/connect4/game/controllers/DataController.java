package com.connect4.game.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.connect4.game.models.GameHistory;
import com.connect4.game.services.GameHistoryService;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController()
@RequestMapping(value = "/game")
public class DataController {

  @Autowired
  GameHistoryService gameHistoryService;

  @RequestMapping(value = "/history", method = RequestMethod.POST, consumes = "application/json",
      produces = "application/json")
  public ResponseEntity<Object> saveHistory(@RequestBody ObjectNode objectNode) {
    gameHistoryService.save(new GameHistory(1, String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis()), String.valueOf(System.currentTimeMillis())));
    return new ResponseEntity<Object>(HttpStatus.OK);
  }
  
  
  @RequestMapping(value = "/history", method = RequestMethod.GET, consumes = "application/json",
      produces = "application/json")
  public ResponseEntity<Object> getHistory(@RequestBody ObjectNode objectNode) {

    return new ResponseEntity<Object>(HttpStatus.OK);
  }

}
