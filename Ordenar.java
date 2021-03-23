import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

public class Ordenar
{
  Object llaves[];
  String temp[];
  public void sortvalue(Map miMap)
  {
    temp= new String[miMap.tamano()];
    Set<Object> llaves =miMap.getKeys();
    int x=0;
    for(Object i :llaves)
    {
      temp[x]=(miMap.obtener(i)+" "+i);
      x++;
    }

  int size = temp.length;  
  //logic for sorting   
  for(int i = size-1; i>0; i--)   
  {  
    for (int j = 0; j<i; j++)   
    {  
    //compares each elements of the array to all the remaining elements  
      if(temp[j].compareTo(temp[j+1])>0)   
      {  
      //swapping array elements  
      String tempo = temp[j+1];  
      temp[j+1] = temp[j];  
      temp[j] = tempo;  
      }  
    }  
  }  

  for(String Carta: temp)
    {
    System.out.println(Carta);	
    }
  }

}