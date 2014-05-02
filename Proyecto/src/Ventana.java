import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana extends JFrame 
{
	public Ventana (String title)
	{
		super(title);//Mandar LLamar al constructor
		setLayout(new FlowLayout());
		add(new JButton("Button 2"));
		add(new JButton("Button 1"));
		add(new JButton("Button 3"));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx =0;
		gc.gridy =0;
		panel.add(new JButton("Button 4"), gc);
		gc.gridy =1;
		panel.add(new JButton("Button 5"), gc);
		add(panel);
		
	}
	public static void main(String...args)
	{
		JFrame labelFrame = new Ventana("Test");
		labelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		labelFrame.setSize(260, 180);
		labelFrame.setVisible(true);
	}

}
