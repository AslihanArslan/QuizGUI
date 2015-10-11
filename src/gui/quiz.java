package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;

import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class quiz {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	private JTextField txtResult;
	
	Set<JRadioButton> correctOptions = new HashSet<JRadioButton>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quiz window = new quiz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public quiz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 534, 304);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Questions", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(12, 12, 470, 195);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblWhatIs = new JLabel("1) What is the capital city of Turkey?");
		lblWhatIs.setBounds(8, 24, 381, 15);
		panel.add(lblWhatIs);
		lblWhatIs.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JRadioButton rdbtnAnkara = new JRadioButton("Ankara");
		rdbtnAnkara.setBounds(8, 57, 87, 23);
		panel.add(rdbtnAnkara);
		buttonGroup.add(rdbtnAnkara);
		correctOptions.add(rdbtnAnkara);
		
		JRadioButton rdbtnIstanbul = new JRadioButton("Istanbul");
		rdbtnIstanbul.setBounds(99, 57, 87, 23);
		panel.add(rdbtnIstanbul);
		buttonGroup.add(rdbtnIstanbul);
		
		JRadioButton rdbtnMugla = new JRadioButton("Mugla");
		rdbtnMugla.setBounds(200, 57, 149, 23);
		panel.add(rdbtnMugla);
		buttonGroup.add(rdbtnMugla);
		
		JLabel lblinWhichCity = new JLabel("2)In which city is Akyaka located?");
		lblinWhichCity.setBounds(8, 105, 341, 15);
		panel.add(lblinWhichCity);
		lblinWhichCity.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JRadioButton rdbtnAnkara_1 = new JRadioButton("Ankara");
		rdbtnAnkara_1.setBounds(8, 142, 87, 23);
		panel.add(rdbtnAnkara_1);
		buttonGroup_1.add(rdbtnAnkara_1);
		
		
		JRadioButton rdbtnIzmir = new JRadioButton("Izmir");
		rdbtnIzmir.setBounds(99, 142, 87, 23);
		panel.add(rdbtnIzmir);
		buttonGroup_1.add(rdbtnIzmir);
		
		JRadioButton rdbtnMugla_1 = new JRadioButton("Mugla");		
		rdbtnMugla_1.setBounds(200, 142, 149, 23);
		panel.add(rdbtnMugla_1);
		buttonGroup_1.add(rdbtnMugla_1);
		correctOptions.add(rdbtnMugla_1);
				
						JButton btnEvaluate = new JButton("Evaluate");
						btnEvaluate.setBounds(12, 219, 117, 25);
						frame.getContentPane().add(btnEvaluate);
						
						JButton btnClear = new JButton("Clear");
						btnClear.setBounds(185, 219, 117, 25);
						frame.getContentPane().add(btnClear);
						
						JLabel lblResult = new JLabel("Result:");
						lblResult.setBounds(334, 221, 70, 15);
						frame.getContentPane().add(lblResult);
						
						txtResult = new JTextField();
						txtResult.setBounds(389, 219, 114, 19);
						frame.getContentPane().add(txtResult);
						txtResult.setEditable(false);
						txtResult.setText("");
						txtResult.setColumns(10);
						btnClear.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								buttonGroup.clearSelection();
								buttonGroup_1.clearSelection();
								for (JRadioButton rdbn : correctOptions){
									rdbn.setForeground(new Color (51,51,51));
								}
								txtResult.setText("");
								
							}
						});
						btnEvaluate.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								int result = 0;
								for (JRadioButton rdbn : correctOptions){
									rdbn.setForeground(new Color(50, 205, 50));
									if (rdbn.isSelected()){
										result++;
									}
									
								}
								for (Component comp : panel.getComponents()){
									if (comp instanceof JRadioButton){
										JRadioButton rdbtn = (JRadioButton) comp;
										if (rdbtn.isSelected() && (!correctOptions.contains(rdbtn))){
											rdbtn.setForeground(Color.RED);
										}
									}
									
								}
								
								
								String strResult = Integer.toString(result);
								txtResult.setText(strResult);
								
								
							}
						});
		
	}
}
