import static org.junit.Assert.assertEquals;

import java.io.PrintWriter;
import java.util.ArrayList;

import org.junit.Test;


public class Evaluador {

	@Test
	public void sonPares() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(4);
		al.add(30);
		al.add(8);
		al.add(40);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(2);
		al2.add(4);
		al2.add(3);
		al2.add(1);
		al2.add(4);
		
		assertEquals("Error ejecutando getPromedio(al)", true, Ejercicios.sonPares(al));
		assertEquals("Error ejecutando getPromedio(al2)", false, Ejercicios.sonPares(al2));
	}
	
	@Test
	public void getMenor() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(40);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(2);
		al2.add(5);
		al2.add(3);
		al2.add(1);
		al2.add(4);
		
		assertEquals("Error ejecutando getPromedio(al)", 10, Ejercicios.getMenor(al));
		assertEquals("Error ejecutando getPromedio(al2)", 1, Ejercicios.getMenor(al2));
	}
	
	@Test
	public void cuantasVecesExiste() {
		String nombre_archivo="testaArchivo";
		try
		{
			PrintWriter pw = new PrintWriter(nombre_archivo);
			pw.write("1 2 3 1 2 1");
			pw.flush();
			
			
		}catch(Exception e)
		{
			
		}
		
		assertEquals("Error ejecutando existe(nombre_archivo)", 3, Ejercicios.cuantasVecesExiste(nombre_archivo,"1"));
		assertEquals("Error ejecutando existe(nombre_archivo)", 2, Ejercicios.cuantasVecesExiste(nombre_archivo,"2"));
		
		assertEquals("Error ejecutando existe(nombre_archivo)", 1, Ejercicios.cuantasVecesExiste(nombre_archivo,"3"));
		assertEquals("Error ejecutando existe(nombre_archivo)", 0, Ejercicios.cuantasVecesExiste(nombre_archivo,"4"));
		
	}
	
	@Test
	public void getNumeroMayor() {
		String nombre_archivo="testaArchivo";
		try
		{
			PrintWriter pw = new PrintWriter(nombre_archivo);
			pw.write("32 43 34 564 23 134 64 2 432");
			pw.flush();
			
			
		}catch(Exception e)
		{
			
		}
		
		assertEquals("Error ejecutando getNumeroMenor(nombre_archivo)", 564, Ejercicios.getNumeroMayor(nombre_archivo));
	}

}
