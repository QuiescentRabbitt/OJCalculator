import javax.swing.JFrame;
public class OrangeJuiceMain {

	
	public static void main (String[] args) {
		//@QuiescentRabbitt
		//OJCalculator 8/14/18
		
		JFrame gridFrame = new JFrame ("OJ");
		gridFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gridFrame.getContentPane().add(new OrangeJuice());		
		gridFrame.pack();
		gridFrame.setVisible(true);
		
		
	}
	
	
	
	
	
	
	
}


