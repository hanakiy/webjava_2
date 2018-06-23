package working;

public class No implements Choice{
  @Override
  public String choice() {
    return "いいえ";
  }

  public String name = "いいえ";
  public String getName() {
    return name;

  }

  public void setName(String name) {
    this.name = name;
  }
}