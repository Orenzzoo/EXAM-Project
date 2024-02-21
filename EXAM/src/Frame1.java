import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 frame = new Frame1();
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
	public Frame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADALEM");
		lblNewLabel.setBounds(189, 80, 68, 14);
		contentPane.add(lblNewLabel);
		
		JButton btntriangle = new JButton("Triangle");
		btntriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				Frame2 f2 = new Frame2();
				f2.setVisible(true);
				
			}
		});
		btntriangle.setBounds(93, 122, 89, 23);
		contentPane.add(btntriangle);
		
		JButton btnsalary = new JButton("Salary");
		btnsalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Frame3 f3 = new Frame3();
				f3.setVisible(true);
				
			}
		});
		btnsalary.setBounds(237, 122, 89, 23);
		contentPane.add(btnsalary);
		
		JButton btnCirlce = new JButton("Circle");
		btnCirlce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Frame4 f4 = new Frame4();
				f4.setVisible(true);
			}
		});
		btnCirlce.setBounds(93, 164, 89, 23);
		contentPane.add(btnCirlce);
		
		JButton btnStudents = new JButton("Students");
		btnStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Frame5 f5 = new Frame5();
				f5.setVisible(true);
			}
		});
		btnStudents.setBounds(237, 164, 89, 23);
		contentPane.add(btnStudents);
	}
}
