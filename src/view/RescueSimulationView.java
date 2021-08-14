package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RescueSimulationView extends JFrame {
	private JPanel rescuePanel;
	private JPanel infoPanel;
	private JPanel unitPanel;
	public JPanel AUnitPanel=new JPanel();
	public JPanel TUnitPanel=new JPanel();
	public JPanel RUnitPanel=new JPanel();

	public RescueSimulationView() {
		setTitle("Rescue Simulation");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(50, 50, 1400, 800);
		
		rescuePanel = new JPanel();
		rescuePanel.setLayout(new GridLayout(10, 10));
		add(rescuePanel, BorderLayout.CENTER);
		//rescuePanel.setPreferredSize(new Dimension(10, 0));
		rescuePanel.setBackground(Color.BLACK);
		infoPanel = new JPanel();
		infoPanel.setPreferredSize(new Dimension(200,getHeight()));

		add(infoPanel, BorderLayout.EAST);
		infoPanel.setBackground(Color.BLUE);
		unitPanel = new JPanel() ;
		unitPanel.setPreferredSize(new Dimension(200,getHeight()));
		
		add(unitPanel , BorderLayout.WEST);
		unitPanel.setBackground(Color.yellow);	
		AUnitPanel.setBackground(Color.CYAN);
		TUnitPanel.setBackground(Color.green);
		unitPanel.setLayout(new BoxLayout( unitPanel,BoxLayout.Y_AXIS));
		unitPanel.add(AUnitPanel);
		unitPanel.add(RUnitPanel);
		unitPanel.add(TUnitPanel);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
	}// end constructor

	private void add(String string, String center) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		RescueSimulationView a = new RescueSimulationView();
	}
}
