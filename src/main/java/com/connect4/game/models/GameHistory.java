package com.connect4.game.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="GAME_HISTORY")
public class GameHistory {
  private Integer gameId;
  private String player1;
  private String player2;
  private String winner;



  public GameHistory(Integer gameId, String player1, String player2, String winner) {
    super();
    this.gameId = gameId;
    this.player1 = player1;
    this.player2 = player2;
    this.winner = winner;
  }

  public Integer getGameId() {
    return gameId;
  }

  public void setGameId(Integer gameId) {
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

  public String getWinner() {
    return winner;
  }

  public void setWinner(String winner) {
    this.winner = winner;
  }

  @Override
  public String toString() {
    return "GameHistory [gameId=" + gameId + ", player1=" + player1 + ", player2=" + player2
        + ", winner=" + winner + "]";
  }


}
