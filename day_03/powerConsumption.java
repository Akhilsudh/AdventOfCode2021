package day_03;

import java.io.*;
import java.util.*;
public class powerConsumption {
  int puzzle1() throws IOException {
    int result = 0;
    BufferedReader br = new BufferedReader(new FileReader("day_03/binary.list"));
    String line;
    Map<Integer, Integer> map = new HashMap<>();
    int lineCount = 0;
    while((line = br.readLine()) != null) {
      lineCount++;
      for(int i = 0; i < line.length(); i++) {
        if(line.charAt(i) == '1') {
          if(!map.containsKey(i)) {
            map.put(i, 1);
          } else {
            map.put(i, map.get(i) + 1);
          }
        }
      }
    }
    System.out.println(map);
    String gamma = "";
    String epsilon = "";
    System.out.println(lineCount);
    for(int i = 0; i < map.keySet().size(); i++) {
      if(map.get(i) > lineCount - map.get(i)) {
        gamma += "1";
        epsilon += "0";
      } else {
        gamma += "0";
        epsilon += "1";
      }
    }
    System.out.println(gamma);
    System.out.println(epsilon);
    return Integer.parseInt(gamma, 2) * Integer.parseInt(epsilon, 2);
  }

  public static void main(String[] args) {
    powerConsumption pc = new powerConsumption();
    try {
      System.out.println(pc.puzzle1());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
