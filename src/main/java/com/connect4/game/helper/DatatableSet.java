package com.connect4.game.helper;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * 
 * /** This class is provided to create an object that will be used by the user interface tables
 * 
 * @author fadhilprm , Sep 6, 2016
 * 
 */
public class DatatableSet {
  long total;
  List<?> rows;

  public DatatableSet() {

  }

  public DatatableSet(String json) throws JsonParseException, JsonMappingException, IOException {
    DatatableSet datatableSet = new ObjectMapper().readValue(json, DatatableSet.class);
    this.total = datatableSet.getTotal();
    this.rows = datatableSet.getRows();
  }

  public DatatableSet(long total, List<?> rows) {
    super();
    this.total = total;
    this.rows = rows;
  }

  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }

  public List<?> getRows() {
    return rows;
  }

  public void setRows(List<?> rows) {
    this.rows = rows;
  }
}
