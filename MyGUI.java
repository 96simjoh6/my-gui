
import java.awt.event.*;
import javax.swing.*;

/*
 * @ Simon Johansson
 * 2014
 *
 */
 
 public class MyGUI extends JFrame {
     
     public MyGUI(){
	 this.GUI();
     }
     
     private void GUI(){
	 
        this.setTitle("Title goes here"); //Title
	this.setSize(400,300); //Ändra storlek
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	// Skapar alla objekt
	JMenuBar menu = new JMenuBar(); //Meny
	JMenu archive = new JMenu("Archive"); //Flik (Archive)
	JMenu about = new JMenu("About"); //Flik (About)
	JMenuItem exit = new JMenuItem("Exit"); //Archive - Alternativ (Exit)
	JMenuItem about_help = new JMenuItem("Help"); //About - Alternativ (Help) 
	JMenuItem about_about = new JMenuItem("About"); //About - Alternativ (About)
	// Lägger till flikar i menyn
	 setJMenuBar(menu);
	 menu.add(archive);
	 menu.add(about);
	// Lägger till alternativ i flikarna
	 archive.add(exit);
	 about.add(about_help);
	 about.add(about_about);
	 
	 // Gör så att Exit är klickbar + avslutar programmet
	 exit.addActionListener( new ActionListener() {
	    @Override
	    public void actionPerformed( ActionEvent e ){
		System.exit(0);
	    }
	 });
	 
	 // Visar info på "About" knappen under fliken About.
	 about_about.addActionListener( new ActionListener() {
	    @Override
	    public void actionPerformed( ActionEvent e ){
		 JOptionPane.showMessageDialog(null, new JLabel(
			 
			 ""
				 
			 +
				 
			 "\n\n\nCopyright © Simon Johansson - 2014" //Copyright
			 
			 , JLabel.CENTER)); //Ändra till information om programmet
	    }
	 });
	 
	 about_help.addActionListener( new ActionListener() {
	    @Override
	    public void actionPerformed( ActionEvent e ){
		 JOptionPane.showMessageDialog(null, 
			 
			 "Help"
		 
		 ); //Ändra till hjälp/funktioner om programmet
	    }
	 });
     }
     
 public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable(){
         public void run(){
             new MyGUI().setVisible(true);
         }
      });
      
        
    }
 }
