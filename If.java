public class If extends State {
  private Expr expr;
  private State state1;
  private State state2;

  public If(Expr expr, State state1, State state2) {
    this.expr = expr;
    this.state1 = state1;
    this.state2 = state2;
  }

  public void pp(int indent) {
    for (int i = 0; i < indent; ++i)
      System.out.print("\t");
    System.out.print("if ");

    expr.display();
    System.out.println(" then");

    state1.pp(indent + 1);
    System.out.println();

    for (int i = 0; i < indent; ++i)
      System.out.print("\t");
    System.out.println("else");
    state2.pp(indent + 1);
  }

  public void interpret() {
    if (expr.eval() > 0)
      state1.interpret();
    else
      state2.interpret();
  }
}
