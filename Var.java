public class Var extends Expr
{
  private char var;

 public Var(char var){
   this.var = var;
 }
 public void display() {
   System.out.print(var);
 }

 public int eval() {
   String res = hashtable.get(var).toString();
   return Integer.parseInt(res);
 }

  public char getVar(){
    return this.var;
  }

  public void setVal(int val){
   hashtable.put(var, val);
  }


}
