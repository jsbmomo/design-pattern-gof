package n_decorator;

public abstract class Item {
  public abstract int getLinesCount();
  public abstract int getMaxLength();
  public abstract int getLength(int index);
  public abstract String getString(int index);

  public void print() {
    int countLines = getLinesCount();

    for (int i = 0; i < countLines; i++) {
      String str = getString(i);
      System.out.println(str);
    }
  }
}
