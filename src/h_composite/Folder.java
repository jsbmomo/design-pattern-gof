package h_composite;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 여러개의 Unit을 가지며, Folder 안에 또 다른 Folder를 가질 수 있다.
 */
public class Folder extends Unit {
  private LinkedList<Unit> unitList = new LinkedList<Unit>();

  public Folder(String name) {
    super(name);
  }

  @Override
  public int getSize() {
    int size = 0;
    Iterator<Unit> it = unitList.iterator();

    while(it.hasNext()) {
      Unit unit = it.next();
      size += unit.getSize();
    }

    return size;
  }

  public boolean add(Unit unit) {
    unitList.add(unit);
    return true;
  }

  public void list(String indent, Unit unit) {
    if (unit instanceof File) {
      System.out.println(indent + unit);
    } else {
      Folder dir = (Folder) unit;
      Iterator<Unit> it = dir.unitList.iterator();
      System.out.println(indent + "+ " + unit);

      while(it.hasNext()) {
        list(indent + "     ", it.next());
      }
    }
  }

  public void list() {
    list("", this);
  }
}
