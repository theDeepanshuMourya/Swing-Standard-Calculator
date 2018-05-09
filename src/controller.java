import javax.swing.UIManager;

public class controller {

	public static void main(String[] args) {
	
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Could not load System look.");
		} 
		new Calculator();

	}

}
