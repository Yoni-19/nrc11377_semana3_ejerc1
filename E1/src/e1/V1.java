package e1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer número");
			lblNewLabel.setBounds(35, 34, 104, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Segundo número");
			lblNewLabel_1.setBounds(37, 79, 102, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Tercer número (opcional)");
			lblNewLabel_2.setBounds(35, 128, 145, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtN1 = new JTextField();
			txtN1.setBounds(194, 31, 86, 20);
			contentPane.add(txtN1);
			txtN1.setColumns(10);
		}
		{
			txtN2 = new JTextField();
			txtN2.setBounds(194, 76, 86, 20);
			contentPane.add(txtN2);
			txtN2.setColumns(10);
		}
		{
			txtN3 = new JTextField();
			txtN3.setBounds(194, 125, 86, 20);
			contentPane.add(txtN3);
			txtN3.setColumns(10);
		}
		{
			btnNewButton = new JButton("Sumar dos enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(35, 168, 166, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Sumar tres enteros");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(35, 213, 166, 23);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Sumar dos reales");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(35, 255, 166, 23);
			contentPane.add(btnNewButton_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(35, 303, 330, 121);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				txtS.setText("Verificando");
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtN1.getText());
			int n2 = Integer.parseInt(txtN2.getText());
			Calculadora c = new Calculadora(n1, n2);
			txtS.setText("");
			txtS.append("La suma es: " + c.Sumar(n1, n2));
		}catch(Exception e2){
			JOptionPane.showMessageDialog(this, "Ingrese dos números enteros");
		}
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtN1.getText());
			int n2 = Integer.parseInt(txtN2.getText());
			int n3 = Integer.parseInt(txtN3.getText());
			Calculadora c = new Calculadora(n1, n2, n3);
			txtS.setText("");
			txtS.append("La suma es: " + c.Sumar(n1, n2, n3));
		}catch(Exception e2){
			JOptionPane.showMessageDialog(this, "Ingrese tres números enteros");
		}
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		double num1 = Double.parseDouble(txtN1.getText());
		double num2 = Double.parseDouble(txtN2.getText());
		Calculadora c = new Calculadora(num1, num2); 
		txtS.append("La suma es: " + c.Sumar(num1, num2));
	}
}
