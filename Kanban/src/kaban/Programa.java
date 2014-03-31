package kaban;

import java.util.Date;

public class Programa {
	public static IDashboard dashboard = new DashboardList();

	public static void main(String[] args) throws Exception 
	{
		System.out.println("Start" + new Date());
		Tarea tarea;
		for (int i = 0; i < 15; i++) 
		{
			tarea = new Tarea("Tarea " + i, Estado.DO_TO);
			if (tarea.save()) 
			{
				System.out.println("Agregada " + tarea.getTitulo());
			}
		}
		System.out.println("End" + new Date());
	}

}
