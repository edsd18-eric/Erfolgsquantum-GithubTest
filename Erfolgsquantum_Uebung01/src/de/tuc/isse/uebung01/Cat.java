package de.tuc.isse.uebung01;
import javax.swing.JOptionPane;
/**
 * Hier Ihre eigene Kommentar
 * @author personne 
 * @version 1.0
 *
 */
public class Cat {
	/**
	 * 
	 * @param x 
	 * @param y 
	 * @return
	 */
	public static int diff(int x , int y) {
		int d = (x*y) - (x + y);
		return  d;
	}
    /**
     * Ihre eigne Kommentare
     * @param args
     */
	public static void main(String[] args) {
	  
	  System.out.println(" __  __");
	  System.out.println("/  \\/  \\");
	  System.out.println("\\      /");
	  System.out.println(" \\    /");
	  System.out.println("  \\  / ");
	  System.out.println("   \\/");
	  
	  int x = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine Zahl"));
	  int y = Integer.parseInt(JOptionPane.showInputDialog("Geben sie eine Zahl"));
	  
	  System.out.println("diff("+x+","+y+")="+diff(x,y));
	
	}

}
