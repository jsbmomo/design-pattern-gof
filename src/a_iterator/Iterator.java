package a_iterator;

public interface Iterator {
  boolean next(); // 다음 구성 데이터를 얻을 수 있으면 true
  Object current(); // 구성 데이터를 하나 얻어 반환.
}
