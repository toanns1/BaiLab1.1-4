package congTrunhanChia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Ctnc extends JFrame {

	private JPanel phepTinh;
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
					Ctnc frame = new Ctnc();
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
	public Ctnc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 352);
		phepTinh = new JPanel();
		phepTinh.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(phepTinh);
		phepTinh.setLayout(null);
		
		JLabel lblCTNC = new JLabel("C\u1ED9ng tr\u1EEB nh\u00E2n chia");
		lblCTNC.setFont(new Font("Arial", Font.BOLD, 20));
		lblCTNC.setBounds(171, 11, 195, 42);
		phepTinh.add(lblCTNC);
		
		JLabel lblA = new JLabel("Nh\u1EADp a");
		lblA.setFont(new Font("Arial", Font.PLAIN, 16));
		lblA.setBounds(73, 81, 63, 29);
		phepTinh.add(lblA);
		
		JLabel lblB = new JLabel("Nh\u1EADp b");
		lblB.setFont(new Font("Arial", Font.PLAIN, 16));
		lblB.setBounds(73, 125, 63, 29);
		phepTinh.add(lblB);
		
		JLabel lblKQ = new JLabel("K\u1EBFt qu\u1EA3");
		lblKQ.setFont(new Font("Arial", Font.PLAIN, 16));
		lblKQ.setBounds(73, 175, 63, 29);
		phepTinh.add(lblKQ);
		
		txtA = new JTextField();
		txtA.setBounds(171, 84, 114, 20);
		phepTinh.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(171, 131, 114, 19);
		phepTinh.add(txtB);
		txtB.setColumns(10);
		
		txtKQ = new JTextField();
		txtKQ.setBounds(171, 181, 114, 20);
		phepTinh.add(txtKQ);
		txtKQ.setColumns(10);
		
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(txtA.getText());
				double b = Double.parseDouble(txtB.getText());
				double cong = 0;
				cong=a+b;
				txtKQ.setText(cong + "");
				
			}
		});
		btnCong.setFont(new Font("Arial", Font.BOLD, 16));
		btnCong.setBounds(409, 64, 51, 23);
		phepTinh.add(btnCong);
		
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(txtA.getText());
				double b = Double.parseDouble(txtB.getText());
				double tru = 0;
				tru=a-b;
				txtKQ.setText(tru + "");
			}
		});
		btnTru.setFont(new Font("Arial", Font.BOLD, 16));
		btnTru.setBounds(409, 111, 51, 23);
		phepTinh.add(btnTru);
		
		JButton btnNhan = new JButton("*");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(txtA.getText());
				double b = Double.parseDouble(txtB.getText());
				double nhan = 0;
				nhan=a*b;
				txtKQ.setText(nhan + "");
			}
		});
		btnNhan.setFont(new Font("Arial", Font.BOLD, 16));
		btnNhan.setBounds(409, 159, 51, 23);
		phepTinh.add(btnNhan);
		
		JButton btnChia = new JButton("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(txtA.getText());
				double b = Double.parseDouble(txtB.getText());
				double chia = 0;
				chia=a/b;
				txtKQ.setText(chia + "");
			}
		});
		btnChia.setFont(new Font("Arial", Font.BOLD, 16));
		btnChia.setBounds(409, 206, 51, 23);
		phepTinh.add(btnChia);
		
		JButton btnXoa = new JButton("X\u00F3a");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtA.setText("");
				txtB.setText("");
				txtKQ.setText("");
			}
		});
		btnXoa.setFont(new Font("Arial", Font.PLAIN, 16));
		btnXoa.setBounds(182, 259, 70, 23);
		phepTinh.add(btnXoa);
	}

}
