public class Comp extends State {
  private State[] states;

  public Comp(State[] states) {
    this.states = states;
  }

  public void pp(int indent) {
    for (int i = 0; i < indent; ++i) {
      System.out.print("\t");
    }
    System.out.println("begin");
    indent += 1;
    for (State state : states) {
      state.pp(indent);
      System.out.println();
    }
    for (int i = 0; i < indent - 1; ++i) {
      System.out.print("\t");
    }
    System.out.print("end");
  }

  public void interpret() {
    for (State state : states) {
      state.interpret();
    }
  }
}
