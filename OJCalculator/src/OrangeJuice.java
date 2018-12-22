import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;


public class OrangeJuice extends JPanel  {
	static JTextField Evade = new JTextField(5);
	static JTextField HP = new JTextField(5);
	static JTextField Defense = new JTextField(5);
	static JTextField Attack = new JTextField(5);
	static JTextArea output = new JTextArea(10, 50);
	static JLabel Evade2 = new JLabel("Evasion", 4);
	static JLabel HP2 = new JLabel("Health", 4);
	static JLabel Defense2 = new JLabel("Defense", 4);
	static JLabel Attack2 = new JLabel("Attack Roll", 4);
	JButton calc = new JButton();
	
	private final static String newline = "\n";
	public OrangeJuice() {	
		calc.resize(30, 30);
		calc.setText("Calculate");
	    this.add(Evade);
	    this.add(Defense);
	    this.add(HP);
	    this.add(Attack);
	    this.add(Evade2);
	    this.add(Defense2);
	    this.add(HP2);
	    this.add(Attack2);
	    this.add(output);
	    this.add(calc);
	    calc.addActionListener(new ButtonListener());
	}
	
	public void paintComponent (Graphics page)  {
		super.paintComponent(page);
	}
	
	
	public static class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			int evasion = Integer.parseInt(Evade.getText());
			int attack = Integer.parseInt(Attack.getText());
			int defense = Integer.parseInt(Defense.getText());
			int health = Integer.parseInt(HP.getText());
			int count = 0;
			int count2 = 0;
			for (int i = 1; i < 7; i++) {
				if (i + evasion > attack) {
					count+=1;
				}
			}
			
			for (int i = 1; i < 7; i++) {
				if (i + defense + health > attack) {
					count2+=1;
				}
			}
			
			
			
			output.append("Dodge: " + (count/6.0) * 100 + "% ");
			output.append("Defend: " + (count2/6.0) * 100 + "%\n");
			
		}
    
	}
	
	
	
	
}
	





