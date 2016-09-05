package com.connect4.game.services;


public interface CommonService<T> {
  
  public T save(T t);
  public T deleteById(T t);
  public T getById(T t);
  public T getAll();
}
