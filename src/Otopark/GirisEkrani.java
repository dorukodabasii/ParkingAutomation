package Otopark;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class GirisEkrani extends JFrame {

	private JPanel contentPane;
	private JTextField txtKullaniciAdi;
	private JPasswordField txtSifre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirisEkrani frame = new GirisEkrani();
					frame.setVisible(true);
					Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
					frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GirisEkrani() {
		setTitle("Giri\u015F Yap");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SERBAY\\eclipse-workspace\\Otopark\\login-modal.png"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 304, 174);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtKullaniciAdi = new JTextField();
		txtKullaniciAdi.setBounds(132, 26, 133, 20);
		contentPane.add(txtKullaniciAdi);
		txtKullaniciAdi.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kullan\u0131c\u0131 Ad\u0131            :");
		lblNewLabel.setBounds(10, 26, 112, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblifre = new JLabel("\u015Eifre                        :");
		lblifre.setBounds(10, 61, 112, 20);
		contentPane.add(lblifre);
		
		txtSifre = new JPasswordField();
		txtSifre.setBounds(132, 57, 133, 20);
		contentPane.add(txtSifre);
		
		JButton btnGirisYap = new JButton("G\u0130R\u0130\u015E YAP");
		btnGirisYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtKullaniciAdi.getText().compareTo("admin")==0 && txtSifre.getText().compareTo("admin")==0)
				{
					 AnaMenu anamenu = new AnaMenu();
					 anamenu.setVisible(true);
					 Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
					 anamenu.setLocation(dim.width/2-anamenu.getSize().width/2, dim.height/2-anamenu.getSize().height/2);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Kullanýcý Adý veya Þifre yanlýþ", "Hata", -1);
				}
			}
		});
		btnGirisYap.setBounds(132, 88, 133, 37);
		contentPane.add(btnGirisYap);
	}
}
