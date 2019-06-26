package com.nbs.calculatorGroup;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;



public class CalculatorMain {

		public static void main(String xyz[]){
			Frame F = new Frame("Calculation");
			TextField T1,T2,T3, T4;
			Label L1,L2,L3;
			Button B1 = new Button("+");
			Button B2 = new Button("-");
			Button B3 = new Button("/");
			Button B4 = new Button("*");
			
			L1 = new Label ("First No:");
			L2 = new Label ("Second No:");
			L3 = new Label ("Result:");
			T1 = new TextField(10);
			T2 = new TextField(10);
			T3 = new TextField(10);
			FlowLayout FL = new FlowLayout();
			F.setLayout(FL);
			AddHandler A = new AddHandler(T1);
			B1.addActionListener(A);
			MinusHandler B = new MinusHandler(T2);
			B2.addActionListener(B);
			DivideHandler C = new DivideHandler(T3);
			B3.addActionListener(C);
			MultiplyHandler D = new MultiplyHandler(T4);
			B4.addActionListener(D);
		
			
			F.add(L1);
			F.add(T1);
			F.add(L2);
			F.add(T2);
			F.add(B1);
			F.add(B2);
			F.add(B3);
			F.add(B4);
			F.add(L3);
			F.add(T3);
			F.setSize(400,400);
			F.setVisible(true);
		}
	}


	}

}
