package h_composite;

/**
 * 단일체와 집합체를 하나의 동일한 개념으로 처리하기 위한 패턴
 */
public class Main {
  public static void main(String[] args) {
    Folder root = new Folder("root");
    root.add(new File("a.txt", 1000));
    root.add(new File("b.txt", 2000));

    Folder sub1 = new Folder("sub1");
    root.add(sub1);
    sub1.add(new File("sa.txt", 100));
    sub1.add(new File("sb.txt", 1000));

    Folder sub2 = new Folder("sub2");
    root.add(sub2);
    sub2.add(new File("sA.txt", 1500));
    sub2.add(new File("sB.txt", 4000));

    root.list();
  }
}
