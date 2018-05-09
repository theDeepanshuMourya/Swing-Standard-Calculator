import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
*
* @author Deepanshu Mourya(theDeepanshuMourya)
*/

public class Calculator extends JFrame {
	
	// Variables declaration - do not modify-
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu file;
	private JMenu edit;
	private JMenu help;
	private JMenuItem close;
	private JMenuItem copy;
	private JMenuItem paste;
	private JMenuItem view;
	private JMenuItem about;
	
	private JTextArea display;
	
	private JButton clear;
	private JButton delete;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton zero;
	private JButton decimal;
	private JButton negatives;
	
	private JButton divide;
	private JButton multiply;
	private JButton subtract;
	private JButton add;
	private JButton reciprocal;
	private JButton square;
	private JButton sqrt;
	private JButton cube;
	private JButton answer;
	
	private double tempFirst = 0.0;
	
	private boolean[] operation = new boolean[4];
	// End of variables declaration
	
	public Calculator() {
		super("Calculator");
		sendMenuBar();
		sendDisplay();
		sendButtons();
		sendUI(this);
	}
	
    // Method to create MenuBar on top.
	private void sendMenuBar() {
		menuBar = new JMenuBar();
		file = new JMenu(" File ");
		edit = new JMenu(" Edit ");
		help = new JMenu(" Help ");
		close = new JMenuItem("Close");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		view = new JMenuItem("View Help");
		about = new JMenuItem("About Calculator");

		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);
		setJMenuBar(menuBar);
		
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		copy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String tempDisplay = display.getText();
				StringSelection string = new StringSelection(tempDisplay);
				Clipboard system = Toolkit.getDefaultToolkit().getSystemClipboard();
				system.setContents(string, string);
			}
		});
		
		paste.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
			    Transferable t = c.getContents(this);
			    if (t == null)
			        return;
			    try {
			        display.setText((String) t.getTransferData(DataFlavor.stringFlavor));
			    } catch (Exception ex){
			        ex.printStackTrace();
			    }
			}
		});
		
		view.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "There are currently no help topics to view", "Calculator", JOptionPane.OK_CANCEL_OPTION);
				
			}
		});
		
		about.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Copyright© theDeepanshuMourya 2018. All rights reserved.", "Calculator", JOptionPane.OK_CANCEL_OPTION);
			}
		});
		
		file.add(close);
		edit.add(copy);
		edit.add(paste);
		help.add(view);
		help.add(about);
		
	}
	
	//Method to provide the display field
	private void sendDisplay() {
		display = new JTextArea();
		display.setBounds(10, 10, 254, 50);
		display.setEditable(false);
		display.setText("0");
		display.setFont(new Font("Arial", Font.PLAIN, 28));
		add(display);
	}
	
	//Method to create buttons for operators and numbers.
	private void sendButtons() {
		
		seven = new JButton("7");
		seven.setBounds(10, 110, 48, 40);
		
		seven.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (display.getText().length() > 13)
					return;
				if (display.getText().equalsIgnoreCase("0")) {
					display.setText("7");
					return;
				}
				
				display.append("7");
				
			}
		});
		
		add(seven);
		
		eight = new JButton("8");
		eight.setBounds(60, 110, 48, 40);
		
        eight.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (display.getText().length() > 13)
					return;
				if (display.getText().equalsIgnoreCase("0")) {
					display.setText("8");
					return;
				}
				
				display.append("8");
				
			}
		});
		
		add(eight);
		
		nine = new JButton("9");
		nine.setBounds(111, 110, 48, 40);
		
        nine.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (display.getText().length() > 13)
					return;
				if (display.getText().equalsIgnoreCase("0")) {
					display.setText("9");
					return;
				}
				
				display.append("9");
				
			}
		});
		
		add(nine);
		
		four = new JButton("4");
		four.setBounds(10, 155, 48, 40);
		
        four.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (display.getText().length() > 13)
					return;
				if (display.getText().equalsIgnoreCase("0")) {
					display.setText("4");
					return;
				}
				
				display.append("4");
				
			}
		});
		
		add(four);
		
		five = new JButton("5");
		five.setBounds(60, 155, 48, 40);
		
        five.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (display.getText().length() > 13)
					return;
				if (display.getText().equalsIgnoreCase("0")) {
					display.setText("5");
					return;
				}
				
				display.append("5");
				
			}
		});
		
		add(five);
		
		six = new JButton("6");
		six.setBounds(111, 155, 48, 40);
		
        six.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (display.getText().length() > 13)
					return;
				if (display.getText().equalsIgnoreCase("0")) {
					display.setText("6");
					return;
				}
				
				display.append("6");
				
			}
		});
		
		add(six);
		
		one = new JButton("1");
		one.setBounds(10, 200, 48, 40);
		
        one.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (display.getText().length() > 13)
					return;
				if (display.getText().equalsIgnoreCase("0")) {
					display.setText("1");
					return;
				}
				
				display.append("1");
				
			}
		});
		
		add(one);
		
		two = new JButton("2");
		two.setBounds(60, 200, 48, 40);
		
        two.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (display.getText().length() > 13)
					return;
				if (display.getText().equalsIgnoreCase("0")) {
					display.setText("2");
					return;
				}
				
				display.append("2");
				
			}
		});
		
		add(two);
		
		three = new JButton("3");
		three.setBounds(111, 200, 48, 40);
		
        three.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (display.getText().length() > 13)
					return;
				if (display.getText().equalsIgnoreCase("0")) {
					display.setText("3");
					return;
				}
				
				display.append("3");
				
			}
		});
		
		add(three);
		
		zero = new JButton("0");
		zero.setBounds(10, 245, 48, 40);
		
        zero.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (display.getText().length() > 13)
					return;
				if (display.getText().equalsIgnoreCase("0")) {
					display.setText("0");
					return;
				}
				
				display.append("0");
				
			}
		});
		
		add(zero);
		
		decimal = new JButton(".");
		decimal.setBounds(60, 245, 48, 40);
		
        decimal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (display.getText().contains("."))
					return;
				display.append(".");
				
			}
		});
		
		add(decimal);
		
		negatives = new JButton("+/-");
		negatives.setBounds(111, 245, 48, 40);
		
        negatives.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (display.getText().length() > 13)
					return;
				display.setText(Double.toString(Double.parseDouble(display.getText()) * (-1)));
				if(display.getText().endsWith("."));
				display.setText(display.getText().replace(".0", ""));
				
			}
		});
		
		add(negatives);
		
		sqrt = new JButton("\u221A");
		sqrt.setBounds(10, 65, 48, 40);
		
        sqrt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setTempFirst(Double.parseDouble(display.getText()));
				
				double square = Math.sqrt(Double.parseDouble(display.getText()));
					display.setText(Double.toString(square));
					
				if(display.getText().endsWith(".0"))
						display.setText(display.getText().replace(".0", ""));	
				}
				
		});
		
		add(sqrt);
		
		square = new JButton("x\u00B2");
		square.setBounds(60, 65, 48, 40);
		
        square.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double square = Math.pow(Double.parseDouble(display.getText()), 2);
					display.setText("(sqr)" + Double.toString(square));
					
				if(display.getText().endsWith(".0"))
						display.setText(display.getText().replace(".0", ""));	
				}
				
		});
		
		add(square);
		
		cube = new JButton("x\u00B3");
		cube.setBounds(111, 65, 48, 40);
		
        cube.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double square = Math.pow(Double.parseDouble(display.getText()), 3);
					display.setText("(cube)" + Double.toString(square));
					
				if(display.getText().endsWith(".0"))
						display.setText(display.getText().replace(".0", ""));	
				}
				
		});
		
		add(cube);
		
		reciprocal = new JButton("1/x");
		reciprocal.setBounds(162, 110, 48, 40);
		
        reciprocal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double rec = 1/Double.parseDouble(display.getText());
					display.setText(Double.toString(rec));
					
				if(display.getText().endsWith(".0"))
						display.setText(display.getText().replace(".0", ""));	
				}
				
		});
		
		add(reciprocal);
		
		add = new JButton("+");
		add.setBounds(213, 110, 48, 85);
		
        add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setTempFirst(Double.parseDouble(display.getText()));
				display.setText("0");
				operation[0] = true;
				
			}
		});
		
		add(add);
		
		subtract = new JButton("-");
		subtract.setBounds(162, 245, 48, 40);
		
        subtract.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setTempFirst(Double.parseDouble(display.getText()));
				display.setText("0");
				operation[1] = true;
				
			}
		});
		
		add(subtract);
		
		multiply = new JButton("X");
		multiply.setBounds(162, 200, 48, 40);
		
        multiply.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setTempFirst(Double.parseDouble(display.getText()));
				display.setText("0");
				operation[2] = true;
				
			}
		});
		
		add(multiply);
		
		divide = new JButton("/");
		divide.setBounds(162, 155, 48, 40);
		
		divide.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setTempFirst(Double.parseDouble(display.getText()));
				display.setText("0");
				operation[3] = true;
				
			}
		});
		
		add(divide);
		
		clear = new JButton("C");
		clear.setBounds(162, 65, 48, 40);
		
        clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
								
				display.setText("0");
				setTempFirst(0.0);
				for (int i = 0; i < operation.length; i++) {
					operation[i] = false;
				}
				
			}
		});
		
		add(clear);
		
		delete = new JButton("DEL");
		delete.setBounds(213, 65, 50, 40);
		
        delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
								
				int length = display.getText().length();
	            int number = length - 1;
	 
	            if (length > 0) {
	                StringBuilder back = new StringBuilder(display.getText());
	                back.deleteCharAt(number);
	                display.setText(back.toString());
	 
	            }
	        }
		});
		
		add(delete);
		
		answer = new JButton("=");
		answer.setBounds(213, 200, 48, 85);
		
		answer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(operation[0]) {
					display.setText(Double.toString(getTempFirst() + (Double.parseDouble(display.getText()))));
					
				if(display.getText().endsWith(".0"))
					display.setText(display.getText().replace(".0", ""));
				}
				
				if(operation[1]) {
					display.setText(Double.toString(getTempFirst() - (Double.parseDouble(display.getText()))));
					
				if(display.getText().endsWith(".0"))
						display.setText(display.getText().replace(".0", ""));
				
				}
				
				if(operation[2]) {
					display.setText(Double.toString(getTempFirst() * (Double.parseDouble(display.getText()))));
				
				if(display.getText().endsWith(".0"))
						display.setText(display.getText().replace(".0", ""));	
				}
				
				if (operation[3]) {
					display.setText(Double.toString(getTempFirst() / (Double.parseDouble(display.getText()))));
					
				if(display.getText().endsWith(".0"))
						display.setText(display.getText().replace(".0", ""));	
				}
				
				setTempFirst(0.0);
				for (int i = 0; i < operation.length; i++) {
					operation[i] = false;
				}
			}
		});
		
		add(answer);
			
	}
	
	//Method to provide the UI for the application.
	private void sendUI(Calculator app) {
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(280, 350);
		app.setResizable(false);
		app.setLayout(null);
		app.setLocationRelativeTo(null);
		app.setVisible(true);
	}

	public double getTempFirst() {
		return tempFirst;
	}

	public void setTempFirst(double tempFirst) {
		this.tempFirst = tempFirst;
	}
}
