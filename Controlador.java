import java.util.Scanner;
public class Controlador
{
  Scanner scan;
  Lector leer;
  Map Baraja,jugador;
  Factory fabrica;
  Ordenar ordenar;
  
  Controlador()
  {
    scan = new Scanner(System.in);
    leer=new Lector();
    fabrica= new Factory();
    ordenar= new Ordenar();
  }

  
  public void start()
  {
    boolean validacion=true;
    String op="";
    //Menu eterno
    while(validacion)
    {
      System.out.print("¿Que implemenación desea utilizar? \n 1.HashMap\n 2.TreeMap\n 3.LinkedHashMap\n");
      op= scan.nextLine();
      //Validar opcion correcta
      if(op.equals("1") ||op.equals("2") ||op.equals("3"))
      {
        validacion=false;
      }
      if (op.equals("1")) {
        System.out.println("\nMapa escogido: "+"HashMap"+"\n");
      }else if (op.equals("2")) {
        System.out.println("\nMapa escogido: "+"TreeMap"+"\n");
      }else if (op.equals("2")) {
        System.out.println("\nMapa escogido: "+"LinkedHashMap"+"\n");
      }
      
    }
    //Llamada al facotry para baraja del jugador y general
    jugador=fabrica.crear(op);
    Baraja=fabrica.crear(op);

    Baraja=leer.LeerArchivo(Baraja);
    
    while(true)
    {
      System.out.println("1)Agregar carta a baraja de jugador");
      System.out.println("2)Mostrar tipo de carta");
      System.out.println("3)Mostrar nombre, tipo y cantidad de cartas del usuario");
      System.out.println("4)Mostrar nombre, tipo y cantidad de cartas del usuario ordenadas");
      System.out.println("5)Mostrar nombre y tipo de cartas existentes");
      System.out.println("6)Mostrar nombre y tipo de cartas existentes ordenadas por tipo");

      int opcion = scan.nextInt();
      scan.nextLine();
      switch(opcion){
        case 1:
          System.out.println("\nopcion: "+opcion+"\n");
          System.out.println("Ingrese el nombre de la carta que deseas agregar Jugador");
          String agregando = scan.nextLine();
          if(Baraja.obtener(agregando)==null){
            System.out.println("\nERROR... No se encuentra la carta\n");
          }else if(jugador.obtener(agregando)==null){
            System.out.println("\nEstamos agregando tu carta a tu baraja...\n");
            jugador.agregar(agregando,Baraja.obtener(agregando));
          }else{
            System.out.println("Ya tienes esta carta!\n");
          }
          jugador.imprimir();
          break;

        case 2:
          System.out.println("\nopcion: "+opcion+"\n");
          System.out.println("Ingresa el nombre de la carta de la cual deseas obtener su tipo");
          String llave = scan.nextLine();

          if(Baraja.obtener(llave)==null){
            System.out.println("\nERROR... No se encuentra la carta\n");
          }else{
            System.out.println("\nEl tipo de la carta... "+llave+" es:");
            System.out.println(Baraja.obtener(llave)+"\n");
          }
          break;
        case 3:
          System.out.println("\nopcion: "+opcion+"\n");
          System.out.println("Mostrando, nombre, tipo y cantidad de cada carta que el jugador posee en su baraja\n");
          if(jugador.tamano()<1){System.out.println("Tu baraja no tiene nada!!!! Agrega cartas con la opcion 1\n");
          }
          else{
            jugador.imprimir();
            System.out.println();
          }  
          break;
        case 4:
          System.out.println("\nopcion: "+opcion+"\n");
          
          ordenar.sortvalue(jugador);
          
          break;
        case 5:
          System.out.println("\nopcion: "+opcion+"\n");
          System.out.println("Mostrando, nombre, tipo y cantidad de cada carta que el jugador posee en su baraja\n");
          Baraja.imprimir();
          System.out.println();
      
          break;
        case 6:
          System.out.println("\nopcion: "+opcion+"\n");
          
          ordenar.sortvalue(Baraja);
          

          
          break;
        default:
          System.out.println("Esto no es una opcion, porfavor intenta de nuevo.");

      }

      

    }


  }

}