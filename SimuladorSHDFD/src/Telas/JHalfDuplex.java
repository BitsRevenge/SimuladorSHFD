package Telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager.LookAndFeelInfo;
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
public class JHalfDuplex extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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
					JHalfDuplex frame = new JHalfDuplex();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	boolean prb1 = false;
	boolean prb2 = false;

	public JHalfDuplex() {
		setTitle("Half-Duplex");
		iniComponentes();
		
		
		
	}
	
	private void iniComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 330);
		setResizable(false);
		setLocationRelativeTo(null);

		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Opções");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Voltar para o menu");
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
		lblNewLabel.setIcon(new ImageIcon(JHalfDuplex.class.getResource("/Image/Computer-icon.png")));
		lblNewLabel.setBounds(10, 93, 110, 94);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(JHalfDuplex.class.getResource("/Image/Computer-icon.png")));
		lblNewLabel_1.setBounds(374, 29, 110, 94);
		contentPane.add(lblNewLabel_1);
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (UnsupportedLookAndFeelException e) {
		    // handle exception
		} catch (ClassNotFoundException e) {
		    // handle exception
		} catch (InstantiationException e) {
		    // handle exception
		} catch (IllegalAccessException e) {
		    // handle exception
		}
		
		MyJProgressBar progressBar = new MyJProgressBar();
		progressBar.setIndeterminate(prb1);
		progressBar.setVisible(true);
		progressBar.setBounds(100, 42, 284, 20);
		contentPane.add(progressBar);
		
		try {
	        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	      } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
	        ex.printStackTrace();
	        Toolkit.getDefaultToolkit().beep();
	      }
		
		JLabel lblNewLabel_2 = new JLabel("Fluxo dos Dados\r\n");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(100, 93, 284, 30);
		contentPane.add(lblNewLabel_2);
		
		JButton BottLR = new JButton("Enviar Sinal");
		BottLR.setBounds(10, 196, 110, 23);
		contentPane.add(BottLR);
		
		JButton BottRL = new JButton("Enviar Sinal");
		
		BottRL.setBounds(364, 11, 110, 23);
		contentPane.add(BottRL);
		
		JLabel mensagem = new JLabel("New label");
		mensagem.setBounds(10, 230, 454, 20);
		mensagem.setVisible(false);
		contentPane.add(mensagem);
		
		JLabel lblNewLabel_2_1 = new JLabel("--->");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(100, 134, 284, 20);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("<---");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBounds(100, 60, 284, 20);
		contentPane.add(lblNewLabel_2_1_1);
		
		
		try {
	        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	      } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
	        ex.printStackTrace();
	        Toolkit.getDefaultToolkit().beep();
	      }
		
		JProgressBar halfDuplexBar1 = new JProgressBar();
		halfDuplexBar1.setIndeterminate(prb2);
		halfDuplexBar1.setVisible(true);
		halfDuplexBar1.setBounds(100, 165, 285, 20);
		contentPane.add(halfDuplexBar1);
		
		BottLR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!prb2) {
					if(prb1) {
						mensagem.setText("No modo Half-Duplex, um lado pode apenas enviar ou receber o dado");
						mensagem.setVisible(true);
					}else {
						prb2 = true;
						halfDuplexBar1.setIndeterminate(prb2);
					}
					
				}else {
					if(prb1) {
						mensagem.setText("No modo Half-Duplex, um lado pode apenas enviar ou receber o dado");
						mensagem.setVisible(true);
					}else {
						prb2 = false;
						halfDuplexBar1.setIndeterminate(prb2);
							
					}
				}
			}
		});
		
		BottRL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!prb1) {
					if(prb2) {
						mensagem.setText("No modo Half-Duplex, um lado pode apenas enviar ou receber o dado");
						mensagem.setVisible(true);
					}else {
						prb1 = true;
						progressBar.setIndeterminate(prb1);
					}
					
				}else {
					if(prb2) {
						mensagem.setText("No modo Half-Duplex, um lado pode apenas enviar ou receber o dado");
						mensagem.setVisible(true);
					}else {
						prb1 = false;
						progressBar.setIndeterminate(prb1);
							
					}
				}

			}
		});
		
	}

	class MyJProgressBar extends JProgressBar {
		@Override
		protected void paintComponent(Graphics g) {
		  Graphics2D g2d = (Graphics2D) g;
		  g2d.scale(-1, 1); 
		  g2d.translate(-getWidth(), 0);
		  super.paintComponent(g2d);
		}
	}
}
