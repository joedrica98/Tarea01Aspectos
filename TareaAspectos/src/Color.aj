
public aspect Color{

    //Aspecto: Deben hacer los puntos de cortes (pointcut) para crear un log con los tipos de transacciones realizadas.
    pointcut success() : call(* color*(..) );
    after() : success() {
    	System.out.println("Este es mi nuevo color favorito");
    }

}