package es.curso.examen.dao;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import es.curso.examen.modelo.Empleado;
@Aspect
public class EmpleadoDAO implements IEmpleadoDAO {
	@Pointcut ("execution(* es.curso.examen.Application.pruebaConXML(..))")
	public void modificacion() {}
	
	@Override
	@AfterReturning("modificacion()")
	public void create(Empleado e) {
		// TODO Auto-generated method stub
		System.out.println("Graba el empleado " + e + " en la BBDD.");
	}
	
	@Override
	@AfterReturning("modificacion()")
	public void delete(int codigo) {
		// TODO Auto-generated method stub
		System.out.println("Borra el empleado con " + codigo + " en la BBDD.");
	}
	
	@Override
	@AfterReturning("modificacion()")
	public void update(Empleado e) {
		// TODO Auto-generated method stub
		System.out.println("Actualiza el empleado " + e + " en la BBDD.");
	}
}
