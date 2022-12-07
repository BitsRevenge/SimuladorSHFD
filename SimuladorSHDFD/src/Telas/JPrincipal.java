package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

@SuppressWarnings("serial")
public class JPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPrincipal frame = new JPrincipal();
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
	public JPrincipal() {
		setTitle("Simulador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 240);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIMULADOR DOS TIPOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 11, 364, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Simplex");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				try {
			        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			      } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
			        ex.printStackTrace();
			        Toolkit.getDefaultToolkit().beep();
			      }
				
				JSimplex jSimpWin = new JSimplex();
				jSimpWin.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(138, 72, 107, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Half-Duplex");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				try {
			        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			      } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
			        ex.printStackTrace();
			        Toolkit.getDefaultToolkit().beep();
			      }
				JHalfDuplex jhaDuWin = new JHalfDuplex();
				jhaDuWin.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(138, 106, 107, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Full-Duplex");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				JFullDuplex hfuDuWin = new JFullDuplex();
				hfuDuWin.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(138, 140, 107, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblDeFluxoDe = new JLabel("DE FLUXO DE DADOS");
		lblDeFluxoDe.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeFluxoDe.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblDeFluxoDe.setBounds(10, 31, 364, 33);
		contentPane.add(lblDeFluxoDe);
	}
}
