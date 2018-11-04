public class Main {
  public static void main(String[] args) {

    // Factorial
    System.out.println("\n\n--- FACTORIAL PROGRAM ---\n");

    State factorial = new Comp(new State[]{
      new Assign(new Var('n'), new Val(5)),
      new Assign(new Var('r'), new Val(1)),
      new While(new BinOp('>', new Var('n'), new Val(0)),
        new Comp(new State[]{
          new Assign(new Var('r'), new BinOp('*', new Var('r'), new Var('n'))),
          new Assign(new Var('n'), new BinOp('-', new Var('n'), new Val(1))),
        })),
      new Out(new Var('r'))
    });

    factorial.pp(0);
    System.out.println();
    factorial.interpret();

    // Fibonacci
    System.out.println("\n\n--- FIBONACCI PROGRAM ---\n");

    State fib = new Comp(new State[]{
      new Assign(new Var('c'), new Val(10)),
      new Assign(new Var('n'), new Val(0)),
      new Assign(new Var('r'), new Val(1)),
      new Assign(new Var('i'), new Val(0)),
      new While(new BinOp('<', new Var('i'), new Var('c')),
        new Comp(new State[]{
          new Out(new Var('n')),
          new Assign(new Var('s'), new BinOp('+', new Var('n'), new Var('r'))),
          new Assign(new Var('n'), new Var('r')),
          new Assign(new Var('r'), new Var('s')),
          new Assign(new Var('i'), new BinOp('+', new Var('i'), new Val(1))),
        }))
    });
    fib.pp(0);
    System.out.println();
    fib.interpret();



  }
}