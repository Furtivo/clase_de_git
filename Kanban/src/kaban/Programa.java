package kaban;

public class Programa {

	public static void main(String[] args) throws Exception 
	{
		Tarea tarea;
		IDashboard dashboard = new DashboardList();
		for (int i = 0; i < 15; i++) 
		{
			tarea = new Tarea("Tarea " + i, Estado.DO_TO);
			if (dashboard.agregar(tarea)) 
			{
				System.out.println("Agregada " + tarea.getTitulo());
			}
		}
	}

}
