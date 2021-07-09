package es.curso.examen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import es.curso.examen.logs.FicherosLog;
import es.curso.examen.modelo.Empleado;

public class Application {
	

	public static void main(String[] args) {
		ejemploGrabarEnElLog();
		
		pruebaConXML();
		pruebaConAnotaciones();
		
	}
		

	private static void ejemploGrabarEnElLog() {
		// Codigo de prueba para ver como se utiliza el metodo grabarLog de la clase FicherosLog
		
		// Grabamos una linea en el fichero de Log:
		//FicherosLog.grabarLog("contenido de la linea de log", "src/logs/mi_log.txt");
		//FicherosLog.grabarLog("Otra linea de log", "src/logs/mi_log.txt");
		//FicherosLog.grabarLog("Una tercera linea de log", "src/logs/mi_log.txt");
	}



	private static void pruebaConAnotaciones() {
		// Cargar el contexto para anotaciones.
		
	}
	
	private static void pruebaConXML() {
		// Cargar el contexto para XML
		ApplicationContext contexto;
		contexto= new ClassPathXmlApplicationContext("contexto.xml");
		
		Empleado empleado1= (Empleado) contexto.getBean("empleado1");
		Empleado empleado2 = (Empleado) contexto.getBean("empleado2");
		Empleado empleado3 = (Empleado) contexto.getBean("empleado3");
		
		
		//System.out.println(empleado1);
		//System.out.println(empleado2);
		//System.out.println(empleado3);
		
		//execution(* es.curso.examen.Applicaction.grabarLog(..));
		FicherosLog.grabarLog("CREAR EMPLEADO: "+empleado1.toString(), "src/logs/mi_log.txt");
		FicherosLog.grabarLog("CREAR EMPLEADO: "+empleado2.toString(), "src/logs/mi_log.txt");
		FicherosLog.grabarLog("BORRAR EMPLEADO: "+empleado3.toString(), "src/logs/mi_log.txt");
		
		
		
		((ClassPathXmlApplicationContext)contexto).close();
	}

}
