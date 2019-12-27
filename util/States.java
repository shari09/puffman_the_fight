package util;

import java.io.*;
import java.util.*;

public class States {

  private static HashSet<String> getStates(String filepath) throws IOException {
    HashSet<String> states = new HashSet<>();
    File file = new File(filepath);

    Scanner fin = new Scanner(file);
    while (fin.hasNext()) {
      states.add(fin.next());
    }
    fin.close();
    return states;
  } 


  public static HashSet<String> all;
  public static HashSet<String> attack;
  public static HashSet<String> special;


  static {
    try {
      all = getStates("assets/states/valid-states.txt");
      attack = getStates("assets/states/attack-states.txt");
      special = getStates("assets/states/special-states.txt");
    } catch (IOException e) {
      //not handled
      System.out.println(e.getLocalizedMessage());
    }
    
  }
  
  
}