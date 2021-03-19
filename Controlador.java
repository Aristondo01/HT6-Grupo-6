import java.util.Scanner;
public class Controlador
{
  Scanner scan;
  Lector leer;
  Controlador()
  {
    scan = new Scanner(System.in);
    leer=new Lector();
  }

  
  public void start()
  {
    boolean validacion=true;
    int op;
    while(validacion)
    {
      System.out.print("¿Que implemenación desea utilizar? \n 1.HasMap\n 2.TreeMap\n 3.LinkedHasMap");
      op= scan.nextLine();
      if(op instanceof Integer)
      {
        validacion=false;
      }
    }
    
    while(true)
    {

    }
  }

}