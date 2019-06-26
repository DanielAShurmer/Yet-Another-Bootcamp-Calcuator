package com.nbs.calculatorGroup;


import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddHandler implements ActionListener {
	TextField No1;
	public AddHandler(TextField T) {
	No1 = T;
	}
	public void actionPerformed(ActionEvent A) {
		Button btn =(Button) A.getSource();
		No1.setText(No1.getText()+btn.getLabel());
	}
}
