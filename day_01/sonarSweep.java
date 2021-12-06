package day_01;

import java.io.*;

public class sonarSweep {
  int puzzle1() throws IOException {
    int result = 0;
    BufferedReader br = new BufferedReader(new FileReader("day_01/deapth.list"));
    String line = "";
    int prev = Integer.parseInt(br.readLine());
    while((line = br.readLine()) != null) {
      int curr = Integer.parseInt(line);
      if(curr > prev) {
        result += 1;
      }
      prev = curr;
    }
    br.close();
    return result;
  }

  int puzzle2() throws IOException {
    int result = 0;
    BufferedReader br = new BufferedReader(new FileReader("day_01/deapth.list"));
    String line = "";
    int item1 = Integer.parseInt(br.readLine());
    int item2 = Integer.parseInt(br.readLine());
    int item3 = Integer.parseInt(br.readLine());
    while((line = br.readLine()) != null) {
      int next = Integer.parseInt(line);
      int sum1 = item1 + item2 + item3;
      int sum2 = item2 + item3 + next;
      if(sum2 > sum1) {
        result += 1;
      }
      item1 = item2;
      item2 = item3;
      item3 = next;
    }
    br.close();
    return result;
  }

  public static void main(String[] args) throws IOException {
    sonarSweep ss = new sonarSweep();
    System.out.println("Puzzle 1 solution = " + ss.puzzle1());
    System.out.println("Puzzle 2 solution = " + ss.puzzle2());
  }
}
