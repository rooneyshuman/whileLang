public class Out extends State {
  private Var var;

  public Out(Var var) {
    this.var = var;
  }

  public void pp(int indent) {
    for(int i = 0; i < indent; ++i) {
      System.out.print("\t");
    }
    System.out.print("output ");
    var.display();
  }

  public void interpret() {
    System.out.println("\n" + var.getVar() + " = " + var.eval());
  }
}
