import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	private JTextField txtRate;
	private JTextField txtStatus;
	private JTextField txtHono;
	private JLabel lblDispSalary;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 frame = new Frame3();
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
	public Frame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(40, 11, 46, 14);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(40, 23, 222, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(40, 97, 46, 14);
		contentPane.add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setBounds(40, 109, 222, 20);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		txtRate = new JTextField();
		txtRate.setBounds(40, 66, 222, 20);
		contentPane.add(txtRate);
		txtRate.setColumns(10);
		
		txtStatus = new JTextField();
		txtStatus.setBounds(40, 150, 222, 20);
		contentPane.add(txtStatus);
		txtStatus.setColumns(10);
		
		JLabel lblRate = new JLabel("Rate:");
		lblRate.setBounds(40, 54, 46, 14);
		contentPane.add(lblRate);
		
		JLabel lblNewLabel = new JLabel("Status: (P for Part Time | F for Full TIme)");
		lblNewLabel.setBounds(40, 138, 247, 14);
		contentPane.add(lblNewLabel);
		
		txtHono = new JTextField();
		txtHono.setBounds(40, 197, 222, 20);
		contentPane.add(txtHono);
		txtHono.setColumns(10);
		
		JLabel lblHonorarium = new JLabel("Honorarium:");
		lblHonorarium.setBounds(40, 181, 103, 14);
		contentPane.add(lblHonorarium);
		
		JLabel lblDispName = new JLabel("");
		lblDispName.setBounds(287, 181, 46, 14);
		contentPane.add(lblDispName);
		
		JLabel lblDispAge = new JLabel("");
		lblDispAge.setBounds(349, 200, 46, 14);
		contentPane.add(lblDispAge);
		
		JLabel lblDispStat = new JLabel("");
		lblDispStat.setBounds(349, 181, 85, 14);
		contentPane.add(lblDispStat);
		
		lblDispSalary = new JLabel("");
		lblDispSalary.setBounds(287, 200, 46, 14);
		contentPane.add(lblDispSalary);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtName.getText();
				Double rate = Double.parseDouble(txtRate.getText());
				int age = Integer.parseInt(txtAge.getText());
				char stat = txtStatus.getText().charAt(0);
				Double hono = Double.parseDouble(txtHono.getText());
				
				lblDispName.setText(name);
				lblDispAge.setText(age + "");
				lblDispStat.setText(stat + "");
				
	
				
				if (stat == 'P') {
					Double pRate = (rate*64);
					Double pDeduc =	(((pRate-1000.00)-1500.00)-500);     
					lblDispSalary.setText(pDeduc + "");
				}else if (stat == 'F') {
					Double fRate = (rate*160);
					Double fDeduc =	(((fRate-1000.00)-1500.00)-500);
					lblDispSalary.setText(fDeduc + hono + "");
				}else {
					lblDispSalary.setText("Error");
				}
				
				if (stat == 'P') {
					lblDispStat.setText("Part-Time");
				}else if (stat == 'F') {
				
						lblDispStat.setText("Full-Time");
					}
				}
				
				
			
		});
		btnSubmit.setBounds(107, 228, 89, 23);
		contentPane.add(btnSubmit);
		
		JLabel lblNewLabel_1 = new JLabel("Result:");
		lblNewLabel_1.setBounds(287, 156, 78, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnReturn = new JButton("Home");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Frame1 f1 = new Frame1();
				f1.setVisible(true);
			}
		});
		btnReturn.setBounds(349, 7, 75, 23);
		contentPane.add(btnReturn);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Frame2 f2 = new Frame2();
				f2.setVisible(true);
			}
		});
		btnBack.setBounds(272, 7, 75, 23);
		contentPane.add(btnBack);
		
		JButton btnTry = new JButton("Clear");
		btnTry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText(null);
				txtRate.setText(null);
				txtAge.setText(null);
				txtStatus.setText(null);
				txtHono.setText(null);
				lblDispName.setText(null);
				lblDispAge.setText(null);
				lblDispStat.setText(null);
				lblDispSalary.setText(null);	
			}
		});
		btnTry.setBounds(287, 108, 89, 23);
		contentPane.add(btnTry);
	}

}
