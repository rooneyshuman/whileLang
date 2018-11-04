public class While extends State {
  private Expr expr;
  private State state;

  public While(Expr expr, State state) {
    this.expr = expr;
    this.state = state;
  }

  public void pp(int indent) {
    for (int i = 0; i < indent; ++i) {
      System.out.print("\t");
    }
    System.out.print("while ");
    expr.display();
    System.out.println(" do");
    state.pp(indent + 1);
  }

  public void interpret() {
    while (expr.eval() > 0) {
      state.interpret();
    }
  }
}
