import java.util.Set;
public interface Map
{
  public void agregar(Object key,Object ingresar);

  public Object obtener(Object key);

  public void quitar(Object key);

  public int tamano();
  
  public void imprimir();

  public Set<Object> getKeys();

}