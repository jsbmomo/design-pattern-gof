package i_factory;

public abstract class Factory {
  public Item create(String name) {
    boolean bCreatable = this.isCreatable(name); // 생성 가능 여부 확인.

    if (bCreatable) {
      Item item = this.createItem(name); // 객체 생성.
      postProcessItem(name); // 생성 후, 후처리.
      return item;
    }

    return null;
  }

  public abstract boolean isCreatable(String name);
  public abstract Item createItem(String name);
  public abstract void postProcessItem(String name);

}
