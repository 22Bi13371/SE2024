package tut05_res.xref1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import utils.DomainConstraint;

/**
 * @overview
 *  Represent a text document.
 *  
 * @attributes
 *  wmap  Map<String,List<Line>>
 *  
 * @object
 * 
 * @abstract_properties
 *  mutable(wmap) = true /\ optional(wmap) = true /\ 
 *  size(wmap) > 0 -> 
 *    (for each (w,l) in wmap. 
 *      w.length > 1 /\ 
 *      l is List<Line> /\ size(l) > 0) /\ 
 *    (for all (w,l), (w',l') in wmap. equals(w,w') = false)
 * 
 * @author dmle
 *
 */
public class Document {
  @DomainConstraint(type="Map",mutable=true,optional=true)
  private Map<String,List<Line>> wmap;
  
  /**
   * @requires 
   *  doc != null
   * @effects
   *  if doc is not empty 
   *    initialise this.wmap to contain all entries (w,l) where
   *    w.length > 1 AND 
   *    size(l) > 0 AND
   *    for all Line i in l. w appears at line ith in doc 
   */
  public Document(String doc) {
    if (!doc.isEmpty()) {
      String[] words = doc.split("\\s+"); // Split the document into words
      for (String word : words) {
        if (word.length() > 1) { // Filter words longer than 1 character
          int lineNumber = 1; // Initialize line number
          List<Integer> lineNumbers = new ArrayList<>(); // To store line numbers for the word
          for (int i = 0; i < doc.length(); i++) {
            if (doc.charAt(i) == '\n' || i == doc.length() - 1) { // Check for newline or end of document
              lineNumbers.add(lineNumber); // Add the current line number to the list
              lineNumber++; // Increment line number for next iteration
            }
            if (word.equals(doc.substring(i, i + word.length()))) { // Check if the current substring matches the word
              lineNumbers.add(lineNumber); // Add the current line number to the list
            }
          }
          if (!lineNumbers.isEmpty()) { // Only add to map if the word appears at least once
            wmap.putIfAbsent(word, lineNumbers);
          }
        }
      }
    }
  }
  
  /**
   * @effects
   *   if wmap is null
   *    return null
   *   else 
   *    return Map<String,List<Line>> in wmap
   */
  public Map<String,List<Line>> wordLocations() {
    // TODO: implement this
    return null;
  }
}
