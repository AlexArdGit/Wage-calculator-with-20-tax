package E2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Sample2 {
	
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		String hours = JOptionPane.showInputDialog("How many hours did you work this week");
		double hoursInDouble = Double.parseDouble(hours);
		String rate = JOptionPane.showInputDialog("What is your hourly pay rate");
		double rateInDouble = Double.parseDouble(rate);
		double wages = hoursInDouble * rateInDouble;
		double atax = wages * 0.8;
		DecimalFormat formatter = new DecimalFormat("000.00");
		JOptionPane.showMessageDialog(null, "Hello " +name+""
		+ " \n Your total wage is: "+formatter.format(wages)+
		" \n Your wages after tax: "+formatter.format(atax));
		
		
	}

}
