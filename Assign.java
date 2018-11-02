public class Assign extends State {
  private Var var;
  private Expr expr;

  public Assign(Var var, Expr expr) {
    this.var = var;
    this.expr = expr;
  }

  public void pp(int indent) {
    for(int i = 0; i < indent; ++i) {
      System.out.print("\t");
    }
    var.display();
    System.out.print(" := ");
    expr.display();
  }

  public void interpret() {
    var.setVal(expr.eval());
  }
}
