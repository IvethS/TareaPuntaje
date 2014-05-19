
import java.util.Scanner;
public class TareaPuntajes {

	public static void main(String[] args) {
		Scanner lea =new Scanner(System.in);
        //Se coloca la Pregunta
       System.out.print("Ingrese el Nombre del Primer Jugador:" );
      	//lee la respuesta.  
       String resp1 = lea.next();
       //Se coloca la pregunta del Puntaje
        System.out.print("Ingrese el Puntaje:" );
        //Se lee la variable se declara como int debido a que son numeros
         int pun1 = lea.nextInt();
       System.out.print("Ingrese el Nombre del Segundo Jugador:" ); 
       String resp2 = lea.next();
         System.out.print("Ingrese el Puntaje:" );
       int pun2 = lea.nextInt();
       System.out.print("Ingrese el Nombre del Tercer Jugador:" );
       String resp3 = lea.next();
         System.out.print("Ingrese el Puntaje:" );
       int pun3 = lea.nextInt();
       //aqui se calcula el promedio
       System.out.print("*Promedio de Puntajes es: "+(pun1+pun2+pun3)/3);
      //aqui se hace las condiciones para poder comparar los puntajes
       //se hacen el uso de operadores logicos.
       System.out.print("\n *");
       if (pun1>pun2 && pun1>pun3) {
           System.out.print("El Mejor Puntaje es: "+resp1+" "+pun1+"\n");
       } else {
           if (pun2>pun3) {
               System.out.print("El Mejor Puntaje es: "+resp2+" "+pun2+"\n");
           } else {
              System.out.print("El Mejor Puntaje es: "+resp3+" "+pun3+"\n");
           }
       }
       System.out.print("*");
       if (pun1<pun2 && pun1<pun3) {
          System.out.print("El Peor Puntaje es: "+resp1+" "+pun1+"");
       } else {
           if (pun2<pun3) {
               System.out.print("El Peor Puntaje es: "+resp2+" "+pun2+"");
           } else {
              System.out.print("El Peor Puntaje es: "+resp3+" "+pun3+"");
           }
       }
       //Con la ayuda de informacion de esta pagina: http://www.javaya.com.ar/detalleconcepto.php?codigo=82&inicio

	}

}
