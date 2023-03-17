package c_template;

/**
 * 각 단계를 정해진 순서대로 실행하는 추상 클래스.
 */
public abstract class DisplayArticleTemplate {
  protected Article article; // 파생 클래스에서 접근 가능하도록 protected 사용

  public DisplayArticleTemplate(Article article) {
    this.article = article;
  }

  // final로 메서드를 제공하여 파생 클래스에서 메서드 변경이 불가능하도록 적용.
  public final void display() {
    title();
    content();
    footer();
  }

  protected abstract void title();
  protected abstract void content();
  protected abstract void footer();

}
