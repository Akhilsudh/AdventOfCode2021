package day_02;

import java.io.*;

public class dive {
  long puzzle1() throws IOException {
    long forward = 0;
    long depth = 0;
    BufferedReader br = new BufferedReader(new FileReader("day_02/direction.list"));
    String line;
    while((line = br.readLine()) != null) {
      if(line.startsWith("f")) {
        forward += Long.parseLong(line.split(" ")[1]);
      } else if (line.startsWith("d")) {
        depth += Long.parseLong(line.split(" ")[1]);;
      } else {
        depth -= Long.parseLong(line.split(" ")[1]);;
      }
    }
    return forward * depth;
  }

  long puzzle2() throws IOException {
    long forward = 0;
    long depth = 0;
    long aim = 0;
    BufferedReader br = new BufferedReader(new FileReader("day_02/direction.list"));
    String line;
    while((line = br.readLine()) != null) {
      if(line.startsWith("f")) {
        long x = Long.parseLong(line.split(" ")[1]);
        forward += x;
        depth += aim * x;
      } else if (line.startsWith("d")) {
        aim += Long.parseLong(line.split(" ")[1]);;
      } else {
        aim -= Long.parseLong(line.split(" ")[1]);;
      }
    }
    return forward * depth;
  }

  public static void main(String[] args) {
    try {
      System.out.println("Puzzle 1 solution = " + new dive().puzzle1());
      System.out.println("Puzzle 2 solution = " + new dive().puzzle2());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
