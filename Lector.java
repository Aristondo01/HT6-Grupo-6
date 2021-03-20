import java.io.File;
import java.util.Scanner;
public class Lector
{
  public Lector()
  {

  }

  public Map LeerArchivo(Map temp)
  {  
    //Lectura de archivo convirtiendolo a interface Hash
    try
    {
      File Archivo = new File("cards_desc.txt");
      Scanner lector = new Scanner(Archivo);      
      while(lector.hasNextLine())    
      {
        String Line = lector.nextLine();
        String[] carta =Line.split("\\|");
        temp.agregar(carta[0].toLowerCase(),carta[1].toLowerCase());
        
      }
      lector.close();
    }
    catch(Exception e)
    {
      System.out.print("Error en la lectura del archivo");
    }
    
    return temp;
  }

  
}