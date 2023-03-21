package g_flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Digit {
  private ArrayList<String> data = new ArrayList<String>();

  public Digit(String fileName) {
    try(
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
    ) {
      String text = "";
      while ((text = br.readLine()) != null) {
        data.add(text);
      }
    } catch(IOException e) {
      e.printStackTrace();
    }
  }

  // 파일로 읽은 데이터를 출력하는 메서드
  public void print(int x, int y) {
    for (int i = 0; i < 6; i++) {
      String line = data.get(i);
      System.out.printf("%c[%d;%df%n", 0x1B, y + i, x);
      System.out.println(line);
    }
  }
}
