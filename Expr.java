import java.util.Hashtable;

public abstract class Expr {
  public abstract void display();

  public abstract int eval();

  public static Hashtable hashtable = new Hashtable();
}

