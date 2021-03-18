import java.util.LinkedHashMap;

public class Linked implements Map
{
  public  LinkedHashMap<<T>,<T>> Mapa;

  public Linked()
  {
    Mapa =  LinkedHashMap<<T>,<T>>();
  }

  public void agregar(<T> key,<T>ingresar)
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