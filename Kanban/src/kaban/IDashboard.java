package kaban;


public interface IDashboard 
{
	public abstract boolean agregar(Tarea tarea);
	boolean remover(Tarea tarea);
	void clear();
}

