package kaban;

import java.util.Date;
public class Tarea 
{

	private String Titulo;
	private String descripcion;
	private Estado estado;
	private String categoria;
	private short priority;
	private int prioridad;
	private String Propietario;
	private Date fechaDeEntrega;
	private Date fechaDeCreacion;
	
	public Tarea()
	{
		this("");
		System.out.println("starting Task() ctor...");
	}
	public Tarea(String titulo) {
		this(titulo, Estado.BACKLOG, (short) 1);
		System.out.println("starting Task(String) ctor...");
	}
	public Tarea(String titulo, short priority){
		this(titulo, Estado.BACKLOG, priority);
		System.out.println("starting Task(String, Priority)ctor...");
	}
	public Tarea(String titulo, Estado estado){
        this(titulo, estado, (short)1);		
        System.out.println("starting Task(String Estado)ctor...");
	}
	public Tarea(String title, Estado state, short priority) {
		super();
		System.out.println("starting Task(String, State) ctor...");
		this.Titulo = title;
		fechaDeCreacion = new Date();
		this.prioridad= priority;
		this.estado = state;
	}

	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo)
	{
		if (titulo != null) {
			this.Titulo = titulo;
		}
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado doTo) 
	{
		this.estado = doTo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria.toUpperCase().trim();	
	}
	public short getPriority() {
		return priority;
	}

	public void setPriority(short priority) {
		this.priority = priority;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	public String getPropietario() {
		return Propietario;
	}
	public void setPropietario(String propietario) {
		Propietario = propietario;
	}
	public Date getFechaDeEntrega() {
		return fechaDeEntrega;
	}
	public void setFechaDeEntrega(Date fechaDeEntrega) {
		this.fechaDeEntrega = fechaDeEntrega;
	}
	public Date getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	public void setFechaDeCreacion(Date fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}
	public String toString() {
		return this.Titulo;
	}
	public boolean equals(Object obj) 
	{
		if (obj != null) 
		{
			if (obj instanceof Tarea) 
			{
				return Titulo.equals(((Tarea) obj).getTitulo());
			}
		}
		return false;
	}
	public synchronized boolean remove(){
		return true;
	}
	public boolean save(){
		 synchronized (this){
		try{
			Thread.sleep(1*1000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		return true;
		}
	}
}
