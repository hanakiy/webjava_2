package working;

public class Yes implements Choice{
  @Override
  public String choice() {
    return "はい";
  }

  public String name = "はい";
  public String getName() {
    return name;

  }

  public void setName(String name) {
    this.name = name;
  }
}