import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtheight;
	private JTextField txtwidth;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2 frame = new Frame2();
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
	public Frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Triangle");
		lblNewLabel.setBounds(10, 11, 92, 14);
		contentPane.add(lblNewLabel);
		
		txtheight = new JTextField();
		txtheight.setBounds(99, 130, 64, 31);
		contentPane.add(txtheight);
		txtheight.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Height");
		lblNewLabel_1.setBounds(111, 113, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("*");
		lblNewLabel_2.setBounds(183, 138, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Width");
		lblNewLabel_3.setBounds(225, 113, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtwidth = new JTextField();
		txtwidth.setBounds(210, 130, 64, 31);
		contentPane.add(txtwidth);
		txtwidth.setColumns(10);
		
		JLabel lbltotal = new JLabel("");
		lbltotal.setBounds(307, 138, 117, 14);
		contentPane.add(lbltotal);
		
		JLabel lblNewLabel_5 = new JLabel("=");
		lblNewLabel_5.setBounds(284, 138, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btntotal = new JButton("TOTAL");
		btntotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double con = 0.5;
				double height = Double.parseDouble(txtheight.getText());
				double width = Double.parseDouble(txtwidth.getText());
				double tot = con * height * width;
				
				
				lbltotal.setText("" + tot);
			}
		});
		btntotal.setBounds(145, 170, 89, 23);
		contentPane.add(btntotal);
		
		JButton btnBack = new JButton("Return");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				Frame1 f1 = new Frame1();
				f1.setVisible(true); 
			}
		});
		btnBack.setBounds(335, 7, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnClear = new JButton("Try Again");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtheight.setText(null);
				txtwidth.setText(null);
				lbltotal.setText(null);
				
				
				
			}
		});
		btnClear.setBounds(145, 197, 89, 23);
		contentPane.add(btnClear);
	}
}
