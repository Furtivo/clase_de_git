package kaban;

import java.util.Date;

public class Programa {
	public static IDashboard dashboard = new DashboardList();

	public static void main(String[] args) throws Exception 
	{
		System.out.println("Start" + new Date());
		Usuario user;
		for (int i = 0; i < 15; i++) 
		{
			user = new Usuario();
			user.setName("Titulo " + i);
			int priority = 1 +(int) (Math.random()*((10-1)+1));
			user.setPriority(priority);
			user.start();
		}
		System.out.println("End" + new Date());
	}

}
