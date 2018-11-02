public class BinOp extends Expr{
  private Expr left;
  private Expr right;
  private char op;

  //Constructor
  public BinOp(char op, Expr left, Expr right){
    this.op = op;
    this.left = left;
    this.right = right;
  }

  public void display(){
    System.out.print("(");
    left.display();

    if (op == '*')
    System.out.print(" * ");
    else if (op == '+')
      System.out.print(" + ");
    else if (op == '-')
      System.out.print(" - ");
    else if (op == '>')
      System.out.print(" > ");
    else if (op == '<')
      System.out.print(" < ");
    else
      System.out.print(" op not supported ");
    right.display();
    System.out.print(")");

  }

  public int eval() {
    if (op == '*')
      return left.eval() * right.eval();
    else if (op == '+')
      return left.eval() + right.eval();
    else if (op == '-')
      return left.eval() - right.eval();
    else if (op == '<') {
      if (left.eval() < right.eval())
        return 1;
      else
        return 0;
    }
    else if (op == '>') {
      if (left.eval() > right.eval())
        return 1;
      else
        return 0;
    }

    return 0;
  }
}
