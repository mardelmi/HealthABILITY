package healthability.aplicacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class InicioDeSesion extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField pwdContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioDeSesion frame = new InicioDeSesion();
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
	public InicioDeSesion() {
		setTitle("HealthABILITY");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblInicieSesion = new JLabel("Inicie Sesion");
		lblInicieSesion.setFont(new Font("SansSerif", lblInicieSesion.getFont().getStyle() & ~Font.ITALIC | Font.BOLD, lblInicieSesion.getFont().getSize() + 5));
		lblInicieSesion.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblInicieSesion, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.CENTER);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		
		pwdContrasena = new JPasswordField();
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("SansSerif", lblUsuario.getFont().getStyle() & ~Font.BOLD & ~Font.ITALIC, lblUsuario.getFont().getSize()));
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("SansSerif", lblUsuario.getFont().getStyle() & ~Font.BOLD & ~Font.ITALIC, lblUsuario.getFont().getSize()));
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesion.setFont(new Font("SansSerif", lblUsuario.getFont().getStyle() & ~Font.BOLD & ~Font.ITALIC, lblUsuario.getFont().getSize()));
		
		JSeparator separator = new JSeparator();
		
		JButton btnRegistrese = new JButton("Reg\u00EDstrese");
		btnRegistrese.setFont(new Font("SansSerif", lblUsuario.getFont().getStyle() & ~Font.BOLD & ~Font.ITALIC, lblUsuario.getFont().getSize()));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(20)
					.addComponent(btnRegistrese, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
					.addGap(20))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(btnIniciarSesion, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblUsuario)
								.addComponent(lblContrasea))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(pwdContrasena, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
								.addComponent(txtUsuario, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))))
					.addGap(20))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUsuario))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(pwdContrasena, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblContrasea))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnIniciarSesion)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnRegistrese)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		pack();
	}
}
