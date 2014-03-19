package healthability.aplicacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import java.awt.Component;

public class SeleccionDeTipoDeUsuario extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionDeTipoDeUsuario frame = new SeleccionDeTipoDeUsuario();
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
	public SeleccionDeTipoDeUsuario() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 260, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton btnPaciente = new JButton("");
		btnPaciente.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnPaciente.setIcon(new ImageIcon(SeleccionDeTipoDeUsuario.class.getResource("/healthability/resources/People-Patient-Female-icon.png")));
		btnPaciente.setSize(new Dimension(100, 100));
		btnPaciente.setPreferredSize(new Dimension(100, 100));
		btnPaciente.setMinimumSize(new Dimension(100, 100));
		btnPaciente.setMaximumSize(new Dimension(100, 100));
		
		JButton bntDoctor = new JButton("");
		bntDoctor.setAlignmentX(Component.CENTER_ALIGNMENT);
		bntDoctor.setIcon(new ImageIcon(SeleccionDeTipoDeUsuario.class.getResource("/healthability/resources/People-Doctor-Male-icon.png")));
		bntDoctor.setSize(new Dimension(100, 100));
		bntDoctor.setPreferredSize(new Dimension(100, 100));
		bntDoctor.setMinimumSize(new Dimension(100, 100));
		bntDoctor.setMaximumSize(new Dimension(100, 100));
		
		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblDoctor = new JLabel("Doctor");
		lblDoctor.setHorizontalAlignment(SwingConstants.CENTER);
		
		JSeparator separator = new JSeparator();
		separator.setAlignmentX(Component.LEFT_ALIGNMENT);
		separator.setAlignmentY(Component.TOP_ALIGNMENT);
		separator.setSize(new Dimension(2, 100));
		separator.setPreferredSize(new Dimension(2, 100));
		separator.setMinimumSize(new Dimension(2, 100));
		separator.setMaximumSize(new Dimension(2, 100));
		separator.setOrientation(SwingConstants.VERTICAL);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblPaciente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
						.addComponent(btnPaciente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDoctor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(bntDoctor, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(bntDoctor, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnPaciente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPaciente)
						.addComponent(lblDoctor))
					.addGap(0))
		);
		panel.setLayout(gl_panel);
		
		JLabel lblRegistroDeUsuario = new JLabel("Registro de Usuario");
		lblRegistroDeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroDeUsuario.setFont(new Font("SansSerif", lblRegistroDeUsuario.getFont().getStyle() & ~Font.ITALIC | Font.BOLD, lblRegistroDeUsuario.getFont().getSize() + 5));
		contentPane.add(lblRegistroDeUsuario, BorderLayout.NORTH);
		pack();
	}
}
