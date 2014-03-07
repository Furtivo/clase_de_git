package kaban;

public class ListaDeTareas implements IDashboard
{
	private Tarea[] listaDeTareas;
 /* +clasificar(estado)
    +pedirTarea()
    +ordenar()
    +buscar()*/
	public boolean Agregar(Tarea tarea)
	{
		return true;
	}
	public boolean Borrar(Tarea tarea)
	{
		return true;
	}
	public boolean Remover(Tarea tarea)
	{
		return false;
	}
	public Tarea[] getListaDeTareas()
	{
		return listaDeTareas;
	}
	public void setListaDeTareas(Tarea[] listaDeTareas)
	{
		this.listaDeTareas = listaDeTareas;
	}
	@Override
	public boolean agregar(Tarea tarea) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remover(Tarea tarea) {
		// TODO Auto-generated method stub
		return false;
	}
}
