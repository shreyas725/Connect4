package com.connect4.game.services;

import com.connect4.game.helper.DatatableSet;

/**
 * Generic Crud Repository for Object
 * 
 * @author fadhilprm , Sep 6, 2016
 * 
 * @param <T>
 */
public interface CommonService<T> {

  /**
   * Save entity to DB
   * 
   * @param t entity to be persist
   * @return
   */
  public T save(T t);

  /**
   * Delete entity form DB
   * 
   * @param t entity to be deleted.
   * @return
   */
  public T deleteById(T t);

  /**
   * Get 1 entity By Identifier
   * 
   * @param identifier of object
   * @return
   */
  public T getById(Long id);


  /**
   * @param offset page
   * @param limit limit/page
   * @param order order by property
   * @param sort sort asc/desc
   * @return
   */
  public DatatableSet getAll(Integer offset, Integer limit, String order, String sort);
}
