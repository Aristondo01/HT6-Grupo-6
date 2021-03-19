import java.util.LinkedHashMap;

public class Linked implements Map
{
  public  LinkedHashMap<Object ,Object > Mapa;

  public Linked()
  {
    Mapa =new  LinkedHashMap<Object, Object>();
  }

  public void agregar(Object  key,Object ingresar)
  {
    Mapa.put(key,ingresar);
  }

  public Object  obtener(Object  key)
  {
    return Mapa.get(key);
  }

  public void quitar(Object  key)
  {
    Mapa.remove(key);
  }

  public int tamaño()
  {
    return Mapa.size();
  }

}