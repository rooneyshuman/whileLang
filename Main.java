public class Main {
  public static void main(String[] args) {

    // Factorial
    State factorial = new Comp(new State[]{
        new Assign(new Var('n'), new Val(5)),
        new Assign(new Var('r'), new Val(1)),
        new While(new BinOp('>',new Var('n'), new Val(0)),
            new Comp(new State[]{
                new Assign(new Var('r'), new BinOp('*', new Var('r'), new Var('n'))),
                new Assign(new Var('n'), new BinOp('-', new Var('n'), new Val(1))),
            })),
        new Out(new Var('r'))
    });

    //factorial.pp(0);
    //factorial.interpret();

    // Fibonacci
    State fib = new Comp(new State[]{
      new Assign(new Var('c'), new Val(10)),
      new Assign(new Var('n'), new Val(0)),
      new Assign(new Var('r'), new Val(1)),
      new Assign(new Var('i'), new Val(0)),
      new While(new BinOp('<',new Var('i'), new Var('c')),
        new Comp(new State[]{
          new Out(new Var('n')),
          new Assign(new Var('s'), new BinOp('+', new Var('n'), new Var('r'))),
          new Assign(new Var('n'), new Var('r')),
          new Assign(new Var('r'), new Var('s')),
          new Assign(new Var('i'), new BinOp('+', new Var('i'), new Val(1))),
        }))
    });
    fib.pp(0);
    fib.interpret();


// TESTS
    //Simple compound
    State simple = new Comp(new State[]{
        new Assign(new Var('n'), new Val(5)),
        new Assign(new Var('r'), new Val(3)),
        new Assign(new Var('n'), new BinOp('-',new Var('n'), new Val(1))),
        new Assign(new Var('r'), new BinOp('*',new Var('r'), new Var('n'))),
        new Out(new Var('r')),
        new Out(new Var('n'))
    });

    //simple.pp(0);
    //simple.interpret();

    //Simple while
    State simpleW = new Comp(new State[]{
        new Assign(new Var('n'), new Val(5)),
        new Assign(new Var('r'), new Val(1)),
        new While(new BinOp('>',new Var('n'), new Val(0)),
            new Comp(new State[]{
                new Assign(new Var('r'), new BinOp('*',new Var('r'), new Var('n'))),
                new Assign(new Var('n'), new BinOp('-',new Var('n'), new Val(1))),
            })),
        new Out(new Var('r'))
    });

    //simpleW.pp(0);
    //simpleW.interpret();

    //Simple If
    State simpleIf = new Comp(new State[]{
        new Assign(new Var('n'), new Val(5)),
        new If(new BinOp('>',new Var('n'), new Val(4)),
            new Assign(new Var('n'), new Val(2)),
            new Assign(new Var('n'), new Val(3))),  //else
        new Out(new Var('n'))
    });

    //simpleIf.pp(0);
    //simpleIf.interpret();
  }
}