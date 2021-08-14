package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import simulation.Simulator;
import view.RescueSimulationView;

public class RescueGUI implements ActionListener {
	private RescueSimulationView rescueview;
	private ArrayList [] [] cells ;  
	private Simulator simulator ; 
	
	public RescueGUI() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
//		int Index = indexOf(btn);
	}
}
