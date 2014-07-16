/**
 * Jul 16, 2014
 * Created by: Alex Markovich
 * www.grapefruitcode.com 
 **/
package com.grapefruitcode.data;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPasswordField;

/**
 * @author alex
 *
 */
public class Window extends Frame{
	//Static Variables
	private static final int WIDTH = 800;
	private static final int HEIGHT = 800 * 3/4;
	private static final String TITLE = "Login Application";
	//Objects
	Panel p = new Panel();
	
	Button button = new Button("Login");
	
	TextField t = new TextField(20);
	JPasswordField pf = new JPasswordField(20);
	
	
	
	Events e = new Events();
	
	
	public Window(){
		this.setSize(WIDTH, HEIGHT);
		this.setTitle(TITLE);
		p.setLayout(new BoxLayout(p,BoxLayout.PAGE_AXIS));
		this.add(p);
		
		
		p.add(t);
		p.add(pf);
		p.add(button);
		button.addActionListener(e);
		
		this.validate();
		this.pack();
		this.setVisible(true);
		
		
	}
	private class Events implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==button){
				String input = t.getText();
				
			}
			
		}
		
	}

}
