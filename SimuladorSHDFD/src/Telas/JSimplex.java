package Telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;



@SuppressWarnings("serial")
public class JSimplex extends JFrame{

	private JPanel contentPane;
	boolean visSimplex = false;

	public static void main(String[] args) {
		
	    try {
	        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	      } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
	        ex.printStackTrace();
	        Toolkit.getDefaultToolkit().beep();
	      }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JSimplex frame = new JSimplex();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public JSimplex() {
		setTitle("Simplex");		
		
		iniComponentes();
	
	}

	
	private void iniComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 230);
		setResizable(false);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Opções");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Voltar para o menu");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JPrincipal jprinWin = new JPrincipal();
				jprinWin.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JSimplex.class.getResource("/Image/Computer-icon.png")));
		lblNewLabel.setBounds(10, 0, 98, 96);
		contentPane.add(lblNewLabel);
		
		JProgressBar simplexBar = new JProgressBar();
		simplexBar.setIndeterminate(visSimplex);
		simplexBar.setVisible(true);
		simplexBar.setBounds(100, 71, 284, 20);
		contentPane.add(simplexBar);
		
		JLabel lblNewLabel_2 = new JLabel("Fluxo dos Dados\r\n");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(100, 11, 284, 30);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Enviar Sinal");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(visSimplex == false) {
					visSimplex=true;
					simplexBar.setIndeterminate(visSimplex);
			
				}else {
					visSimplex = false;
					simplexBar.setIndeterminate(visSimplex);
				}
				
			}
		});
		simplexBar.setIndeterminate(visSimplex);
		
		btnNewButton.setBounds(10, 102, 110, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Enviar Sinal");
		
		btnNewButton_1.setBounds(364, 102, 110, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel mensagem = new JLabel("New label");
		mensagem.setBounds(20, 136, 454, 20);
		mensagem.setVisible(false);
		contentPane.add(mensagem);
		
		JLabel lblNewLabel_2_1 = new JLabel("--->");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(100, 44, 284, 30);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(JSimplex.class.getResource("/Image/Computer-icon.png")));
		lblNewLabel_1.setBounds(386, 0, 98, 96);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setEnabled(false);
				mensagem.setText("No modo Simplex, apenas um lado pode enviar o dado");
				mensagem.setVisible(true);

			}
		});
		
	}
}
