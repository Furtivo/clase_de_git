import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import javax.swing.JOptionPane;
 
public class Hilo extends Thread 
{
	 File ficheroaux;
	 static String ruta = JOptionPane.showInputDialog ("Rodrigo Sánchez Practica de Hilos" + " \n" + "Escribe ruta:"); 
	 public void run() 
	 {
		FileReader fichero = null;
		try {
			fichero = new FileReader(ficheroaux);
			} 
				catch (Exception e)
				{
				e.printStackTrace();
				}
		if (fichero != null)
		{
			LineNumberReader numerolinea = new LineNumberReader(fichero);
			try
			{
				numerolinea.skip(Long.MAX_VALUE);
			} 
			catch (Exception e1) {
				e1.printStackTrace();
			}
			System.out.println(ficheroaux.getName() + "  " + numerolinea.getLineNumber() + " Lineas");
		}
	}
	public Hilo(File file) 
	{
		super();
		this.ficheroaux = file;
	}
	 public static void main (String [] args) 
	 {
		long start = System.currentTimeMillis();
		File folder = new File(ruta);
		Hilo nucleodinamico;
		for (File file : folder.listFiles()) 
		{
			if (file.isFile()) 
			{
				nucleodinamico = new Hilo(file);
				nucleodinamico.start();
			}
		}
		System.out.println("Lapso de Tiempo = " + (System.currentTimeMillis() - start)+ " Milisegundo");
	}
}
