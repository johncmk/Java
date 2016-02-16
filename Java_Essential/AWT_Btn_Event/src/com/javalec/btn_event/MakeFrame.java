package com.javalec.btn_event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MakeFrame extends Frame implements ActionListener{

	private List list;
	private Panel panel;
	private TextField textField;
	private Button okBtn;
	private Button exitBtn;
	
	public MakeFrame() {
		
		list = new List();
		panel = new Panel();
		textField = new TextField(20);
		okBtn = new Button("OK");
		exitBtn = new Button("EXIT");
		
		setLayout(new BorderLayout());
		add(panel, BorderLayout.NORTH);
		add(list, BorderLayout.CENTER);
		
		panel.add(new Label("write"));
		panel.add(textField);
		panel.add(okBtn);
		panel.add(exitBtn);
		
		okBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
		
	}//End
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource() == okBtn) {
			list.add(textField.getText());
		} else if(event.getSource() == exitBtn) {
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}

}//End Class
