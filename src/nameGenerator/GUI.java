package nameGenerator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUI {
	

	public static void main(String[] args) {
		
		//variables for generatorframe		
		JFrame f = new JFrame("Name Generator");
		JPanel text = new JPanel();
		JTextArea textArea = new JTextArea(10, 40);
		JPanel botPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton buttonRussian = new JButton("Russian");
		JButton buttonDutch = new JButton("Dutch");
		JScrollPane scrollbar = new JScrollPane(text);
		
		//frame size and location
		f.setSize(600, 248);
	    f.setLocation(300,200);
	    
	    //buttonpanel
	    botPanel.add(buttonRussian);
	    botPanel.add(buttonDutch);
	    botPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	    f.add(botPanel, BorderLayout.SOUTH);
	    
	    //textarea
	    //textArea.setSize(680, 240);
	    f.add(scrollbar);
	    scrollbar.add(textArea);
	    text.add(textArea, BorderLayout.CENTER);	    
	        
	    //button functionality
	    buttonRussian.addActionListener(new ActionListener() {
	
	        public void actionPerformed(ActionEvent e) {
	        	String russian = generatorFunctions.russian();
	            textArea.append(russian + "\n");
	
	        }
	    });
	    
	    buttonDutch.addActionListener(new ActionListener() {
	    	
	    	public void actionPerformed(ActionEvent e) {
	    		String dutch = generatorFunctions.dutch();
	    		textArea.append(dutch + "\n");}
	    });
	  
	    f.setVisible(true);

  }


}
