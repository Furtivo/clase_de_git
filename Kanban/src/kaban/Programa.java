package kaban;

public class Programa {

	public static void main(String[] args) 
	{
		Tarea tarea = new Tarea();
		tarea.setDescripcion("Completar el programa");
		tarea.setEstado(Estado.DO_TO);
		IDashboard lista= new ListaDeTareas();
		if (lista.agregar(tarea))
		{
			System.out.println("Agregada");
		}
	}

}
