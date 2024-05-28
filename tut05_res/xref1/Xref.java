package tut05_res.xref1;

import java.util.List;
import java.util.Map;

/**
 * @overview
 *  A program that index words in a document and print the lines 
 *  where the words appear.
 *  
 * @attributes
 * 
 * @object
 * 
 * @abstract_properties
 * 
 * @author dmle
 *
 */
public class Xref {
  public Xref() {
    // 
  }
  
  /**
   * @effects 
   *  if doc is empty 
   *    return null
   *  else
   *    for each word w containing more than one letter
   *      find the lines of doc where w appears
   *    return words and lines in a Set 
   */
  public Map<String,List<Line>> indexDocument(String docStr) {
    // TODO: implement this
    return null;
  }
}
