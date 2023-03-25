package i_factory;

import java.util.HashMap;
import java.util.Objects;

public class ItemFactory extends Factory {
  private static class ItemData {
    int maxCount;
    int currentCount;
    ItemData(int maxCount) {
      this.maxCount = maxCount;
    }
  }

  private HashMap<String, ItemData> repository;

  public ItemFactory() {
    repository = new HashMap<String, ItemData>();

    repository.put("sword", new ItemData(3)); // 아이템, 생성개수
    repository.put("shield", new ItemData(2));
    repository.put("bow", new ItemData(1));
  }

  @Override
  public boolean isCreatable(String name) {
    ItemData itemData = repository.get(name);

    if (itemData == null) {
      System.out.println(name + "은 알 수 없는 아이템입니다.");
      return false;
    }

    if (itemData.currentCount >= itemData.maxCount) {
      System.out.println(name + "은 품절 아이템입니다.");
      return false;
    }

    return false;
  }

  @Override
  public Item createItem(String name) {
    Item item = null;

    if (Objects.equals(name, "sword")) item = new Sword();
    if (Objects.equals(name, "shield")) item = new Shield();
    if (Objects.equals(name, "bow")) item = new Bow();

    return item;
  }

  @Override
  public void postProcessItem(String name) {
    ItemData itemData = repository.get(name);

    if (itemData != null) itemData.currentCount++;
  }
}
