import java.util.HashMap;
import java.util.Set;
public class Hash implements Map
{
  public HashMap<Object,Object> Mapa;

  public Hash()
  {
    Mapa = new HashMap<Object,Object>();
  }

  public void agregar(Object key,Object ingresar)
  {
    Mapa.put(key,ingresar);
  }

  public Object obtener(Object key)
  {
    return Mapa.get(key);
  }

  public Set<Object> getKeys()
  {
    Set<Object> keys = Mapa.keySet();
    return keys;
  }

  public void quitar(Object key)
  {
    Mapa.remove(key);
  }

  public int tamano()
  {
    return Mapa.size();
  }
   public void imprimir()
  {
    Object hech = "hechizo";
    Object mons = "monstruo";
    Object tramp = "trampa";
    int trampas = 0;
    int hechizos = 0;
    int monstruos = 0;
    Set<Object> keys = Mapa.keySet();
    for(Object i :keys)
    {
      System.out.println(i + " : "+Mapa.get(i));
      if(Mapa.get(i).equals(hech)){
        hechizos++;
      }else if(Mapa.get(i).equals(mons)){
        monstruos++;

      }else if(Mapa.get(i).equals(tramp)){
        trampas++;
      }
    }
    System.out.println();
    System.out.println("Monstros = "+monstruos);
    System.out.println("Hechizos = "+hechizos);
    System.out.println("Trampas = "+trampas);
    System.out.println();
  }


}