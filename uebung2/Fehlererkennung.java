package tuc.isse.uebung02;
/*
*Fehlererkennung.java:2: error: class, interface, or enum expected
*/
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
/**
*Fehlererkennung.java:12: error: class expected
*Fehlererkennung.java:12: error: ';' expected
*Fehlererkennung.java:12: error: not a statement
*Fehlererkennung.java:12: error: ';' expected
*/
 int x1 = Integer.parseInt(input1);
 /*
 *Fehlererkennung.java:13: error: class expected
 *Fehlererkennung.java:13: error: ';' expected
 *Fehlererkennung.java:13: error: not a statement
 *
 */
 int x2 = Integer.parseInt(input2);
 /**
 *Fehlererkennung.java:14: error: ')' expected
 Fehlererkennung.java:14: error: not a statement
 Fehlererkennung.java:14: error: ';' expected
 */
System.out.println("Before swapping, A = " +x1+ " , B = " + x2);
/*
Fehlererkennung.java:15: error: ';' expected
*/
 swap(x1, x2);
 }
 
public static void swap(int x1, int x2) {
//Fehlererkennung.java:43: error: cannot find symbol  x3 = x1;
 int x3 = x1;
 x1 = x2;
 x2 = x3;
 /*
 *Fehlererkennung.java:21: error: ')' expected
 Fehlererkennung.java:21: error: not a statement
 Fehlererkennung.java:21: error: ';' expected
 symbol:   method Println(String)
 */
 System.out.println("After swapping, A = " +x1+ " , B = " + x2);
 }
}


