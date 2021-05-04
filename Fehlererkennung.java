package tuc.isse.uebung02;
import javax.swing.JOptionPane;
/**
* Klasse mit Fehlern.
* @author Fehlererkennung
*
*/
public class Fehlererkennung {
public static void main (String[] args) {
String input1 = JOptionPane.showInputDialog ("Bitte geben Sie Eingabe A");
String input2 = JOptionPane.showInputDialog ("Bitte geben Sie Eingabe B");
 int x1 = Integer.parseInt(input1);
 int x2 = Integer.parseInt(input2);
 System.out.println("Before swapping, A = " + x1 + " , B = " + x2);
 swap(x1, x2);
 }
public static void swap(int x1, int x2) {
 int x3 = x1;
 x1 = x2;
 x2 = x3;
 System.out.Println("After swapping, A = " + x1 + " , B = " + x2);
 }
}