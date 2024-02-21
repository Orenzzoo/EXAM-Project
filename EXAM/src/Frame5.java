import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField txtName;
	public static JTextField txtCourse;
	public static JTextField txtYear;
	public static JTextField txtLevel;
	private static JTextField txtTerm;
	public static String name;
	public static String course;
	public static	int year;
	public static	int level;
	public static 	int term;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame5 frame = new Frame5();
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
	public Frame5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel asdas = new JLabel("Name:");
		asdas.setBounds(10, 11, 46, 14);
		contentPane.add(asdas);
		
		txtName = new JTextField();
		txtName.setBounds(10, 25, 198, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel asdas1 = new JLabel("Course:");
		asdas1.setBounds(10, 56, 46, 14);
		contentPane.add(asdas1);
		
		txtCourse = new JTextField();
		txtCourse.setBounds(10, 70, 198, 20);
		contentPane.add(txtCourse);
		txtCourse.setColumns(10);
		
		JLabel asdas5 = new JLabel("Year:");
		asdas5.setBounds(10, 101, 46, 14);
		contentPane.add(asdas5);
		
		txtYear = new JTextField();
		txtYear.setBounds(10, 116, 198, 20);
		contentPane.add(txtYear);
		txtYear.setColumns(10);
		
		JLabel xad5 = new JLabel("Level:");
		xad5.setBounds(10, 147, 46, 14);
		contentPane.add(xad5);
		
		txtLevel = new JTextField();
		txtLevel.setBounds(10, 160, 198, 20);
		contentPane.add(txtLevel);
		txtLevel.setColumns(10);
		
		JLabel asdfs5 = new JLabel("Term:");
		asdfs5.setBounds(10, 188, 46, 14);
		contentPane.add(asdfs5);
		
		txtTerm = new JTextField();
		txtTerm.setBounds(10, 202, 198, 20);
		contentPane.add(txtTerm);
		txtTerm.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = txtName.getText();
				course = txtCourse.getText();
				year = Integer.parseInt(txtYear.getText());
				level = Integer.parseInt(txtLevel.getText());
				term = Integer.parseInt(txtTerm.getText());
				
				setVisible(false);
				Frame6 f6 = new Frame6();
				f6.setVisible(true);
			}
			
		});
		btnSubmit.setBounds(61, 227, 89, 23);
		contentPane.add(btnSubmit);
	}

}
