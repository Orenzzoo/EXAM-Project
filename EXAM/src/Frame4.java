import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtRadius;
	private JLabel lblDispAnswer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame4 frame = new Frame4();
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
	public Frame4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Area of a Circle");
		lblNewLabel.setBounds(173, 24, 135, 14);
		contentPane.add(lblNewLabel);
		
		txtRadius = new JTextField();
		txtRadius.setBounds(161, 112, 86, 20);
		contentPane.add(txtRadius);
		txtRadius.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Input Radius");
		lblNewLabel_1.setBounds(173, 98, 74, 14);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("The area of the circle is:");
		lblNewLabel_2.setBounds(147, 164, 148, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("SOLVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double rad = Double.parseDouble(txtRadius.getText());
				Double pi = (3.14);
				Double ans = (rad * rad);
				lblDispAnswer.setText(ans * pi + "");
				
			}
		});
		btnNewButton.setBounds(161, 135, 89, 23);
		contentPane.add(btnNewButton);
		
		lblDispAnswer = new JLabel("");
		lblDispAnswer.setBounds(161, 189, 112, 14);
		contentPane.add(lblDispAnswer);
	}
}
