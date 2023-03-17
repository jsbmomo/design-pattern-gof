package c_template;

import java.util.ArrayList;

public class SimpleDisplayArcticle extends DisplayArticleTemplate {
  public SimpleDisplayArcticle(Article article) {
    super(article);
  }

  @Override
  protected void title() {
    System.out.println(article.getTitle());
  }

  @Override
  protected void content() {
    ArrayList<String> content = article.getContent();

    for (String line : content) {
      System.out.println(line);
    }
  }

  @Override
  protected void footer() {
    System.out.println(article.getFooter());
  }
}
