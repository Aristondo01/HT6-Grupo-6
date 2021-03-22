import java.util.HashMap;

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
    System.out.println(Mapa);
  }

}