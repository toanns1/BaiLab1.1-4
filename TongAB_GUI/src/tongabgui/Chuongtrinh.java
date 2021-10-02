package tongabgui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Chuongtrinh extends JFrame {

	private JPanel Tong_2_so_A_B;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chuongtrinh frame = new Chuongtrinh();
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
	public Chuongtrinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 175);
		Tong_2_so_A_B = new JPanel();
		Tong_2_so_A_B.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Tong_2_so_A_B);
		Tong_2_so_A_B.setLayout(null);
		
		JLabel lblA = new JLabel("A=");
		lblA.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblA.setBounds(120, 24, 25, 20);
		Tong_2_so_A_B.add(lblA);
		
		txtA = new JTextField();
		txtA.setBounds(155, 24, 32, 20);
		Tong_2_so_A_B.add(txtA);
		txtA.setColumns(10);
		
		JLabel lblB = new JLabel("B=");
		lblB.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblB.setBounds(209, 27, 25, 14);
		Tong_2_so_A_B.add(lblB);
		
		txtB = new JTextField();
		txtB.setBounds(239, 24, 38, 20);
		Tong_2_so_A_B.add(txtB);
		txtB.setColumns(10);
		
		JButton btnTinhtong = new JButton("Tinh tong");
		btnTinhtong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strA = txtA.getText();
				String strB = txtB.getText();
				
				int a = Integer.parseInt(strA);
				int b = Integer.parseInt(strB);
				
				int c = a+b;
				
				txtKQ.setText(String.valueOf(c));	
			}
		});
		btnTinhtong.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnTinhtong.setBounds(297, 22, 98, 23);
		Tong_2_so_A_B.add(btnTinhtong );
		
		JLabel lblKQ = new JLabel("KQ=");
		lblKQ.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKQ.setBounds(405, 23, 32, 20);
		Tong_2_so_A_B.add(lblKQ);
		
		txtKQ = new JTextField();
		txtKQ.setBounds(447, 24, 38, 20);
		Tong_2_so_A_B.add(txtKQ);
		txtKQ.setColumns(10);
	}
}
