import java.util.HashMap;

public class Tree implements Map
{
  public TreeMap<<T>,<T>> Mapa;

  public Tree()
  {
    Mapa = TreeMap<<T>,<T>>();
  }

  public void agregar(<?> key,<?>ingresar)
  {
    Mapa.input(key,ingresar);
  }

  public <T> obtener(<T> key)
  {
    Mapa.get(key);
  }

  public void quitar(<T> key)
  {
    Mapa.remove(key);
  }

  public int tamaño()
  {
    Mapa.size();
  }

}