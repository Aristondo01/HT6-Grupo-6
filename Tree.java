import java.util.TreeMap;

public class Tree implements Map
{
  public TreeMap<Object,Object> Mapa;

  public Tree()
  {
    Mapa = new TreeMap<Object,Object>();
  }

  public void agregar(Object key,Object ingresar)
  {
    Mapa.put(key,ingresar);
  }

  public Object obtener(Object key)
  {
    return Mapa.get(key);
  }

  public void quitar(Object key)
  {
    Mapa.remove(key);
  }

  public int tamaño()
  {
    return Mapa.size();
  }

}