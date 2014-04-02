package kaban;

public class Usuario extends Thread{
	public void run(){
		String name = Thread.currentThread().getName();
		int priority=Thread.currentThread().getPriority();
		System.out.println("Runnnig " + name + "(Prioridad = " + priority + ")....");
		Tarea tarea = new Tarea(name, (short)priority);
		if (tarea.save()){
			Programa.dashboard.agregar(tarea);
		}
	}

}
