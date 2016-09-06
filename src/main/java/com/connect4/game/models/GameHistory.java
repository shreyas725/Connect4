package com.connect4.game.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This is the GameHistory Entity. used to abstraction of GameHistory Data from application to MongoDb vice-versa.
 * @author fadhilprm , Sep 6, 2016
 *	
 */
@Document(collection = "GAME_HISTORY")
public class GameHistory {
 
  @Id
  private Long gameId;
  private String player1;
  private String player2;
  private String score1;
  private String score2;
  private String winner;
  private Date date;

  public GameHistory(Long gameId, String player1, String player2, String score1, String score2,
      String winner, Date date) {
    super();
    this.gameId = gameId;
    this.player1 = player1;
    this.player2 = player2;
    this.score1 = score1;
    this.score2 = score2;
    this.winner = winner;
    this.date = date;
  }


  public Long getGameId() {
    return gameId;
  }


  public void setGameId(Long gameId) {
    this.gameId = gameId;
  }


  public String getPlayer1() {
    return player1;
  }


  public void setPlayer1(String player1) {
    this.player1 = player1;
  }


  public String getPlayer2() {
    return player2;
  }


  public void setPlayer2(String player2) {
    this.player2 = player2;
  }


  public String getScore1() {
    return score1;
  }


  public void setScore1(String score1) {
    this.score1 = score1;
  }


  public String getScore2() {
    return score2;
  }


  public void setScore2(String score2) {
    this.score2 = score2;
  }


  public String getWinner() {
    return winner;
  }


  public void setWinner(String winner) {
    this.winner = winner;
  }


  public Date getDate() {
    return date;
  }


  public void setDate(Date date) {
    this.date = date;
  }


  @Override
  public String toString() {
    return "GameHistory [gameId=" + gameId + ", player1=" + player1 + ", player2=" + player2
        + ", score1=" + score1 + ", score2=" + score2 + ", winner=" + winner + ", date=" + date
        + "]";
  }


}
