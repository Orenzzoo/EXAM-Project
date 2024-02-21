import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Frame6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEthics;
	private JTextField txtInprola;
	private JTextField txtProgcon;
	private JLabel lblDisplay;
	private JLabel lblAverage;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame6 frame = new Frame6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDispName = new JLabel("");
		lblDispName.setBounds(10, 11, 46, 14);
		contentPane.add(lblDispName);
		
		JLabel lblDispCourse = new JLabel("");
		lblDispCourse.setBounds(10, 36, 46, 14);
		contentPane.add(lblDispCourse);
		
		JLabel lblDispYear = new JLabel("");
		lblDispYear.setBounds(406, 11, 46, 14);
		contentPane.add(lblDispYear);
		
		JLabel lblDispLevel = new JLabel("");
		lblDispLevel.setBounds(406, 36, 46, 14);
		contentPane.add(lblDispLevel);
		
		JLabel lblDispTerm = new JLabel("");
		lblDispTerm.setBounds(406, 61, 46, 14);
		contentPane.add(lblDispTerm);
		
		lblDispName.setText(Frame5.name);
		lblDispCourse.setText(Frame5.course);
		lblDispYear.setText(Frame5.year + "");
		lblDispLevel.setText(Frame5.level + "");
		lblDispTerm.setText(Frame5.term + "");
		
		JLabel lblNewLabel = new JLabel("Ethics:");
		lblNewLabel.setBounds(10, 83, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtEthics = new JTextField();
		txtEthics.setBounds(10, 95, 86, 20);
		contentPane.add(txtEthics);
		txtEthics.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("INPROLA:");
		lblNewLabel_1.setBounds(10, 122, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		txtInprola = new JTextField();
		txtInprola.setBounds(10, 136, 86, 20);
		contentPane.add(txtInprola);
		txtInprola.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("PROGCON:");
		lblNewLabel_2.setBounds(10, 167, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		txtProgcon = new JTextField();
		txtProgcon.setBounds(10, 180, 86, 20);
		contentPane.add(txtProgcon);
		txtProgcon.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double add1 = Double.parseDouble(txtEthics.getText());
				Double add2 = Double.parseDouble(txtInprola.getText());
				Double add3 = Double.parseDouble(txtProgcon.getText());
				Double add = add1 + add2 + add3;
				Double total = (add / 3);
				
				lblAverage.setText(String.format("Your Average is: %.2f", total));
				
				if (total > 3.0) {
					lblDisplay.setText("Excellent");
				}else if (total >= 2.5) {
					lblDisplay.setText("Good");
				}else if (total >= 2.0) {
					lblDisplay.setText("Fair");
				}else if (total >= 1.0) {
					lblDisplay.setText("Repeat");
				}else if (total <= 1) {
					lblDisplay.setText("Drop");
				}else if (total == 0) {
					lblDisplay.setText("Invalid");
				}
			}
		});
		btnSubmit.setBounds(10, 211, 89, 23);
		contentPane.add(btnSubmit);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(165, 122, 198, 14);
		contentPane.add(lblNewLabel_3);
		
		lblDisplay = new JLabel("");
		lblDisplay.setBounds(183, 167, 116, 14);
		contentPane.add(lblDisplay);
		
		JLabel lblNewLabel_4 = new JLabel("Result:");
		lblNewLabel_4.setBounds(183, 122, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblAverage = new JLabel("");
		lblAverage.setBounds(175, 139, 136, 14);
		contentPane.add(lblAverage);
	}
}
