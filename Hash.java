import java.util.HashMap;

public class Hash implements Map
{
  public HashMap<<T>,<T>> Mapa;

  public Hash()
  {
    Mapa = HashMap<<T>,<T>>();
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