package quiz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.xml.soap.Text;
import javax.swing.JButton;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Quiz {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz window = new Quiz();
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
	public Quiz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1) What is the capital of the Turkey?");
		lblNewLabel.setBounds(33, 24, 281, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnAnkara = new JRadioButton("Ankara");
		buttonGroup.add(rdbtnAnkara);
		rdbtnAnkara.setBounds(6, 52, 66, 23);
		frame.getContentPane().add(rdbtnAnkara);
		
		JRadioButton rdbtnIstanbul = new JRadioButton("Istanbul");
		buttonGroup.add(rdbtnIstanbul);
		rdbtnIstanbul.setBounds(89, 52, 66, 23);
		frame.getContentPane().add(rdbtnIstanbul);
		
		JRadioButton rdbtnMugla = new JRadioButton("Mugla");
		buttonGroup.add(rdbtnMugla);
		rdbtnMugla.setBounds(166, 52, 109, 23);
		frame.getContentPane().add(rdbtnMugla);
		
		JLabel lblNewLabel_1 = new JLabel("2) In which city Akayaka located?");
		lblNewLabel_1.setBounds(33, 87, 177, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnAnkara_1 = new JRadioButton("Ankara");
		buttonGroup_1.add(rdbtnAnkara_1);
		rdbtnAnkara_1.setBounds(6, 109, 66, 23);
		frame.getContentPane().add(rdbtnAnkara_1);
		
		JRadioButton rdbtnIzmir = new JRadioButton("Izmir");
		buttonGroup_1.add(rdbtnIzmir);
		rdbtnIzmir.setBounds(89, 108, 66, 23);
		frame.getContentPane().add(rdbtnIzmir);
		
		JRadioButton rdbtnMugla_1 = new JRadioButton("Mugla");
		buttonGroup_1.add(rdbtnMugla_1);
		rdbtnMugla_1.setBounds(166, 108, 66, 23);
		frame.getContentPane().add(rdbtnMugla_1);
		
		JButton btnEvaluate = new JButton("Evaluate");
		btnEvaluate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				int count = 0;
				buttonGroup.getSelection().getSelectedObjects();
			
				if(rdbtnAnkara.isSelected()){
					count++;
				}
				if(rdbtnMugla_1.isSelected()){
					count++;
				}
				
				int result =count;
				
				String strResult=Integer.toString(result);
				textField.setText(strResult);
				
			}
		});
		btnEvaluate.setBounds(30, 205, 89, 23);
		frame.getContentPane().add(btnEvaluate);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(166, 209, 46, 14);
		frame.getContentPane().add(lblResult);
		
		textField = new JTextField();
		textField.setBounds(222, 206, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
