public class Val extends Expr{
  private int value;

  public Val(int value){
    this.value = value;
  }
  public void display() {
    System.out.print(value);
  }

  public int eval() {
    return value;
  }
}
