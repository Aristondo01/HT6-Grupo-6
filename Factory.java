public class Factory
{
  //Factory de la implementacion
public  Map crear(String op)
{
  Map temp=null;
      if(op.equals("1"))
    {
      temp = new Hash();
    }
    else if(op.equals("2"))
    {
      temp = new Tree();
    }
    else if(op.equals("3"))
    {
      temp = new Linked();
    }
    return temp;
  }

}