import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicios {
	
	//Devuelve true si todos los elementos de 'mi_lista' son pares, de lo contrario devuelve false
	static boolean sonPares(ArrayList<Integer> mi_lista)
	{
		int sonPares = 0;//usamos el int            
		for(int i = 0; i<mi_lista.size(); i++)//con for buscamos en el archivo
	{
		if(mi_lista.get(i)%2==0)//utilizo el if donde compara el residuo del numero oara concluir si es par o no
		{
			sonPares++;
		if(sonPares==mi_lista.size())
			return true;//si es par devuelve true
	}
	}
		return false;//de lo contrario devuelve false
	}
	
	//Devuelve el numero menor almacenado en 'mi_lista'
	static int getMenor(ArrayList<Integer> mi_lista)
	{//en este caso ya tenemos la lista creada solo hacemos los pasos para encontrar el numero menor
	
		int menor = mi_lista.get(0); //usamos int menor para obtener numero menor
		for(int i = 0; i<mi_lista.size(); i++)//usamos for para buscar en el archivo
		{
			if(mi_lista.get(i)<menor)//buscamos el numero menor dentro de la lista
			{
				menor = mi_lista.get(i);
			}
		}
		return menor;
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	static int getNumeroMayor(String nombre_archivo)
	{int mayor = -9999;//creamos el int
	try//iniciamos con try
	{
		File archivo = new File(nombre_archivo);//iniciamos el archivo
		Scanner s = new Scanner(archivo);//leemos el archivo
		while (s.hasNext())//utilziamos while para leer todo lo que hay en el archivo
		{
			int num = s.nextInt();//usamos if para leer numero mayor
			if (num>mayor)
				mayor=num;
		}
	}catch (Exception e)//capturamos cualquier excepcion
	{
		e.printStackTrace();
	}
	return mayor;
	}
	
	//Devuelve cuantas veces existe la string buscada en el archivo con nombre nombre_archivo
	static int cuantasVecesExiste(String nombre_archivo, String buscada)
	{
		int existe = 0;//inciiamos un int
		try//iniciamos un try 
		{
			File archivo = new File(nombre_archivo);//inciiamos el archivo
			Scanner s = new Scanner(archivo);//leemos el archivo
			while(s.hasNext()){//utilizamos while para leer todo lo que hay en el archivo
				String resultado = s.next();//hacemos string resultado
				if(resultado.equals(buscada))//if para buscar "buscada"
				{
					existe++;
				}
			}
			
		}catch(Exception e)//capturamos cauqluier excepcion
		{
			e.printStackTrace();
		}
		return existe;
		//ultimo ejercicio trabajado con compañeros de clase: Kevin Lanza, Alex Fabian, Walter y Maynor
	}
		
}
