package tut05_res.xref1;

import java.util.List;
import java.util.Map;

import utils.fileio.FileHandler;

//import exer.ch14.fileio.FileHandler;

/**
 * @overview 
 *  A program that uses Xref.
 *  
 * @author dmle
 *
 */
public class XrefApp {
  /**
   * @effects 
   *  Read a document from file
   *  Initialise Xref 
   *  Index the document
   *  Print the word index
   */
  public static void main(String[] args) {
    //  Read a document from file
    String docFileName = "compiler.txt";
    String docFilePath = XrefApp.class.getResource(docFileName).getPath();
    
    String docStr = FileHandler.getFile(docFilePath);
    
    //  Initialise Xref
    Xref xref = new Xref();
    
    //  Index the document
    Map<String,List<Line>> wordIndex = xref.indexDocument(docStr);
    
    //  Print the word index
    if (wordIndex == null) {
      // TODO: print "empty"
    } else {
      // TODO: print each entry in wordIndex as required
    }
  }
}
