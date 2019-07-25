package Otopark;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class AnaMenu extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdSoyad;
	private JTextField txtTelNo;
	private JTextField txtAdres;
	private JTextField txtAracModeli;
	private JTextField txtAracMarkasi;
	private JTextField txtAracRengi;
	private JTextField txtAracPlakasi;

	public static Otopark otopark = new Otopark();
	private JTextField txtGirisPlaka;
	private JTextField txtCikisPlaka;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnaMenu frame = new AnaMenu();
					frame.setVisible(true);
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
	public AnaMenu() {
		setTitle("Ana Men\u00FC");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\SERBAY\\eclipse-workspace\\Otopark\\23-512.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 374, 438);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		tabbedPane.addTab("ÜYE KAYDI", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblAdVeSoyad = new JLabel("Ad\u0131 ve Soyad\u0131        :");
		lblAdVeSoyad.setBounds(10, 22, 112, 20);
		panel.add(lblAdVeSoyad);
		
		JLabel lblTelefonNo = new JLabel("Telefon No             :");
		lblTelefonNo.setBounds(10, 53, 112, 20);
		panel.add(lblTelefonNo);
		
		JLabel lblAdresi = new JLabel("Adresi                     :");
		lblAdresi.setBounds(10, 84, 112, 20);
		panel.add(lblAdresi);
		
		JLabel lblAracnnTr = new JLabel("Ara\u00E7 T\u00FCr\u00FC              :");
		lblAracnnTr.setBounds(10, 142, 112, 20);
		panel.add(lblAracnnTr);
		
		JLabel lblAraModeli = new JLabel("Ara\u00E7 Modeli             :");
		lblAraModeli.setBounds(10, 179, 112, 20);
		panel.add(lblAraModeli);
		
		JLabel lblAraMarkas = new JLabel("Ara\u00E7 Markas\u0131            :");
		lblAraMarkas.setBounds(10, 210, 112, 20);
		panel.add(lblAraMarkas);
		
		JLabel lblAraRengi = new JLabel("Ara\u00E7 Rengi               :");
		lblAraRengi.setBounds(10, 241, 112, 20);
		panel.add(lblAraRengi);
		
		JLabel lblAraPlakas = new JLabel("Ara\u00E7 Plakas\u0131            :");
		lblAraPlakas.setBounds(10, 273, 112, 20);
		panel.add(lblAraPlakas);
		
		txtAdSoyad = new JTextField();
		txtAdSoyad.setColumns(10);
		txtAdSoyad.setBounds(118, 22, 182, 20);
		panel.add(txtAdSoyad);
		
		txtTelNo = new JTextField();
		txtTelNo.setColumns(10);
		txtTelNo.setBounds(118, 53, 182, 20);
		panel.add(txtTelNo);
		
		txtAdres = new JTextField();
		txtAdres.setColumns(10);
		txtAdres.setBounds(118, 84, 182, 47);
		panel.add(txtAdres);
		
		JComboBox cmbAracTuru = new JComboBox();
		cmbAracTuru.setModel(new DefaultComboBoxModel(new String[] {"Kamyonet", "Otomobil","SUV","Motorsiklet"}));
		cmbAracTuru.setBounds(118, 142, 182, 20);
		panel.add(cmbAracTuru);
		
		txtAracModeli = new JTextField();
		txtAracModeli.setColumns(10);
		txtAracModeli.setBounds(118, 179, 182, 20);
		panel.add(txtAracModeli);
		
		txtAracMarkasi = new JTextField();
		txtAracMarkasi.setColumns(10);
		txtAracMarkasi.setBounds(118, 210, 182, 20);
		panel.add(txtAracMarkasi);
		
		txtAracRengi = new JTextField();
		txtAracRengi.setColumns(10);
		txtAracRengi.setBounds(118, 241, 182, 20);
		panel.add(txtAracRengi);
		
		txtAracPlakasi = new JTextField();
		txtAracPlakasi.setColumns(10);
		txtAracPlakasi.setBounds(118, 273, 182, 20);
		panel.add(txtAracPlakasi);
		
		JRadioButton rdoLPG = new JRadioButton("LPG'li Ara\u00E7");

		rdoLPG.setBounds(118, 303, 182, 23);
		panel.add(rdoLPG);
		
		JButton btnUyeyiKaydet = new JButton("\u00DCYEY\u0130 KAYDET");
		btnUyeyiKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean uyevarmi=false;
				boolean plakavarmi=false;
				try
				{
					Long.parseLong(txtTelNo.getText());
					if(!(txtAdSoyad.getText().isEmpty()) && !(txtTelNo.getText().isEmpty()) && !(txtAdres.getText().isEmpty()) &&  !(txtAracModeli.getText().isEmpty()) &&  !(txtAracMarkasi.getText().isEmpty()) && !(txtAracRengi.getText().isEmpty()) && !(txtAracPlakasi.getText().isEmpty()) )
					{
						for(Uye u : otopark.Uyeler)
						{
							if(txtAracPlakasi.getText().compareToIgnoreCase(u.arac.Plaka)==0)
							{
								plakavarmi=true;
							}
							if(u.AdSoyad.compareTo(txtAdSoyad.getText())==0 && u.Adres.compareTo(txtAdres.getText())==0)
							{
								uyevarmi=true;
							}
						}
						if(uyevarmi==false && plakavarmi==false)
						{
							if(rdoLPG.isSelected() && otopark.AcikOtopark<2)
							{
								otopark.AcikOtopark++;
								Uye u = new Uye();
								u.AdSoyad= txtAdSoyad.getText();
								u.TelNo = Long.parseLong(txtTelNo.getText());
								u.Adres = txtAdres.getText();
								u.arac.Tur = (String) cmbAracTuru.getSelectedItem();
								u.arac.Model = txtAracModeli.getText();
								u.arac.Marka = txtAracMarkasi.getText();
								u.arac.Renk = txtAracRengi.getText();
								u.arac.Plaka = txtAracPlakasi.getText();
								u.arac.LPGVarmi = rdoLPG.isSelected();
								otopark.Uyeler.add(u);
								JOptionPane.showMessageDialog(null, "Üye kaydý tamamlandý.", "Onay", -1);
							}
							else if(rdoLPG.isSelected())
							{
								JOptionPane.showMessageDialog(null, "Açýk otoparkta yer dolduðu için LPG li araç alýnamamaktadýr.", "Hata", -1);
							}
						  if(!(rdoLPG.isSelected()) && otopark.BirveIkiKapaliOtopark<4)
							{
								otopark.BirveIkiKapaliOtopark++;
								Uye u = new Uye();
								u.AdSoyad= txtAdSoyad.getText();
								u.TelNo = Long.parseLong(txtTelNo.getText());
								u.Adres = txtAdres.getText();
								u.arac.Tur = (String) cmbAracTuru.getSelectedItem();
								u.arac.Model = txtAracModeli.getText();
								u.arac.Marka = txtAracMarkasi.getText();
								u.arac.Renk = txtAracRengi.getText();
								u.arac.Plaka = txtAracPlakasi.getText();
								u.arac.LPGVarmi = rdoLPG.isSelected();	
								otopark.Uyeler.add(u);
								JOptionPane.showMessageDialog(null, "Üye kaydý tamamlandý.", "Onay", -1);
							}
						  else if(!(rdoLPG.isSelected()))
						  {
							  JOptionPane.showMessageDialog(null, "Üyeler için açýlmýþ olan kapalý otoparklar dolu olduðu için üye kaydý alýnamýyor", "Hata", -1);
						  }
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Bu üye veya araç daha önceden kaydedilmiþ", "Hata", -1);
						}
					}
			else
			{
				JOptionPane.showMessageDialog(null, "Herhangi bir bölümü boþ geçtiniz", "Hata", -1);
			}
				}
				catch(Exception d)
				{
					JOptionPane.showMessageDialog(null, "Telefon numarasý bölümünde geçersiz karakter kullandýnýz", "Hata", -1);
				}
				txtAdSoyad.setText("");
				txtTelNo.setText("");
				txtAdres.setText("");
				txtAracModeli.setText("");
				txtAracMarkasi.setText("");
				txtAracRengi.setText("");
				txtAracPlakasi.setText("");
			}
		});
		btnUyeyiKaydet.setBounds(118, 342, 182, 47);
		panel.add(btnUyeyiKaydet);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlight);
		tabbedPane.addTab("ARAÇ GÝRÝÞÝ", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblPlakaNo = new JLabel("Plaka No       :");
		lblPlakaNo.setBounds(24, 41, 112, 20);
		panel_1.add(lblPlakaNo);
		
		txtGirisPlaka = new JTextField();
		txtGirisPlaka.setColumns(10);
		txtGirisPlaka.setBounds(98, 41, 182, 20);
		panel_1.add(txtGirisPlaka);
		
		JButton btnAraGirisYap = new JButton("ARA\u00C7 G\u0130R\u0130\u015E\u0130 YAP");
		btnAraGirisYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean uyeligivarmi=false;
				boolean plakamevcutmu=false;
				boolean zatenotoparktami=false;
				if(txtAracPlakasi.getText() == null) {
					System.out.println("Plaka bilgisi boþ býrakýlamaz");
				}
				else {
					
				
				for(Arac a2 : otopark.BirinciKatAcikOtopark )
				{
					if(a2.Plaka.compareToIgnoreCase(txtGirisPlaka.getText())==0)
					{
						zatenotoparktami=true;
					}
				}
				for(Arac a3 : otopark.BirinciKatKapaliOtopark )
				{
					if(a3.Plaka.compareToIgnoreCase(txtGirisPlaka.getText())==0)
					{
						zatenotoparktami=true;
					}
				}
				for(Arac a4 : otopark.ÝkinciKatKapaliOtopark )
				{
					if(a4.Plaka.compareToIgnoreCase(txtGirisPlaka.getText())==0)
					{
						zatenotoparktami=true;
					}
				}
				for(Arac a5 : otopark.UcuncuKatKapaliOtopark )
				{
					if(a5.Plaka.compareToIgnoreCase(txtGirisPlaka.getText())==0)
					{
						zatenotoparktami=true;
					}
				}
				if(zatenotoparktami==false)
				{
					for(Uye uye:otopark.Uyeler)
					{
						if (txtGirisPlaka.getText().compareToIgnoreCase(uye.arac.Plaka)==0)
						{
							uyeligivarmi=true;
							uye.arac.GirisSaati=LocalDateTime.now();
							if(uye.arac.LPGVarmi==true)
							{
								otopark.BirinciKatAcikOtopark.add(uye.arac);
								JOptionPane.showMessageDialog(null, "Araç birinci kat açýk otoparka baþarýyla eklendi.", "Onay", -1);
							}
							else if(otopark.BirinciKatKapaliOtopark.size()<50)
							{
								otopark.BirinciKatKapaliOtopark.add(uye.arac);
								JOptionPane.showMessageDialog(null, "Araç birinci kat kapalý otoparka baþarýyla eklendi.", "Onay", -1);
							}
							else
							{
								otopark.ÝkinciKatKapaliOtopark.add(uye.arac);
								JOptionPane.showMessageDialog(null, "Araç ikinci kat kapalý otoparka baþarýyla eklendi.", "Onay", -1);
							}

						}
					}
					for(Arac a : otopark.UcuncuKatKapaliOtopark)
					{
						if(a.Plaka.compareToIgnoreCase(txtGirisPlaka.getText())==0)
						{
						   plakamevcutmu=true;
						}
					}
					if(plakamevcutmu==false && uyeligivarmi==false)
					{
						if(otopark.UcuncuKatKapaliOtopark.size()<50)
						{
							Arac arac = new Arac();
							arac.Plaka = txtGirisPlaka.getText();
							arac.GirisSaati = LocalDateTime.now();
							otopark.UcuncuKatKapaliOtopark.add(arac);
							JOptionPane.showMessageDialog(null, "Sayýn misafirimiz Araç üçüncü kat kapalý otoparka baþarýyla eklendi.", "Onay", -1);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Misafir için olan yerlerimiz doludur...", "Hata", -1);
						}
						
					}
					if(plakamevcutmu==true)
					{
						JOptionPane.showMessageDialog(null, "Bu plaka ile misafir giriþi zaten yapýldý..", "Hata", -1);
					}
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Bu plakalý araç zaten otoparkta", "Hata", -1);
				}
				txtGirisPlaka.setText("");
				
			}
			}
		});
		btnAraGirisYap.setBounds(98, 84, 182, 47);
		panel_1.add(btnAraGirisYap);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlight);
		tabbedPane.addTab("ARAÇ ÇIKIÞI", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("Plaka No       :");
		label.setBounds(22, 47, 112, 20);
		panel_2.add(label);
		
		txtCikisPlaka = new JTextField();
		txtCikisPlaka.setColumns(10);
		txtCikisPlaka.setBounds(99, 47, 182, 20);
		panel_2.add(txtCikisPlaka);
		
		JButton btnCikisYap = new JButton("ARA\u00C7 \u00C7IKI\u015EI YAP");
		btnCikisYap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean uyemi=false;
				boolean varmi=false;
				try
				{
					for(Arac a: otopark.BirinciKatAcikOtopark)
					{
						if(a.Plaka.compareToIgnoreCase(txtCikisPlaka.getText())==0)
						{
							a.CikisSaati= LocalDateTime.now();
							uyemi=true;
							varmi=true;
							otopark.BirinciKatAcikOtopark.remove(a);
							break;
							
						}
					}
					if(uyemi==false)
					{
						for(Arac a2: otopark.BirinciKatKapaliOtopark)
						{
							if(a2.Plaka.compareToIgnoreCase(txtCikisPlaka.getText())==0)
							{
								a2.CikisSaati= LocalDateTime.now();
								uyemi=true;
								varmi=true;
								otopark.BirinciKatKapaliOtopark.remove(a2);
								break;
								
							}
						}
					}
					if(uyemi==false)
					{
						for(Arac a3: otopark.ÝkinciKatKapaliOtopark)
						{
							if(a3.Plaka.compareToIgnoreCase(txtCikisPlaka.getText())==0)
							{
								varmi=true;
								a3.CikisSaati= LocalDateTime.now();
								uyemi=true;
								otopark.ÝkinciKatKapaliOtopark.remove(a3);
								break;
							
							}
						}
					}
					if(uyemi==false)
					{
						for(Arac a4: otopark.UcuncuKatKapaliOtopark)
						{
							if(a4.Plaka.compareToIgnoreCase(txtCikisPlaka.getText())==0)
							{
								a4.CikisSaati= LocalDateTime.now();
								int kalinansure = 1 + (a4.CikisSaati.getYear()*8762 + a4.CikisSaati.getMonthValue()*720 + a4.CikisSaati.getHour())- (a4.GirisSaati.getYear()*8762 + a4.GirisSaati.getMonthValue()*720 + a4.GirisSaati.getHour());
								otopark.Bakiye += 15*kalinansure ;
								JOptionPane.showMessageDialog(null, "Araç Çýkýþý Baþarýlý \n Alýnacak Ücret " + 15*kalinansure , "Onay", -1);
								varmi=true;
								otopark.UcuncuKatKapaliOtopark.remove(a4);
								break;
							
							}
						}
					}
					if(varmi==true)
					{
						if(uyemi==true)
						{
							for(Uye u : otopark.Uyeler)
							{
								if(u.arac.Plaka.compareToIgnoreCase(txtCikisPlaka.getText())==0) {
									int kalinansure = 1 + (u.arac.CikisSaati.getYear()*8762 + u.arac.CikisSaati.getMonthValue()*720 + u.arac.CikisSaati.getHour())- (u.arac.GirisSaati.getYear()*8762 + u.arac.GirisSaati.getMonthValue()*720 + u.arac.GirisSaati.getHour());
									if(u.arac.Tur=="SUV")
									{
										JOptionPane.showMessageDialog(null, "Araç Çýkýþý Baþarýlý \n Alýnacak Ücret " + 8*kalinansure , "Onay", -1);
										 otopark.Bakiye += 8*kalinansure ;
									}
									else if(u.arac.Tur=="Motorsiklet")
									{
										JOptionPane.showMessageDialog(null, "Araç Çýkýþý Baþarýlý \n Alýnacak Ücret " + 5*kalinansure , "Onay", -1);
										 otopark.Bakiye += 5*kalinansure ;
									}
									else if(u.arac.Tur=="Otomobil")
									{
										JOptionPane.showMessageDialog(null, "Araç Çýkýþý Baþarýlý \n Alýnacak Ücret " + 6*kalinansure , "Onay", -1);
										 otopark.Bakiye += 6*kalinansure ;
									}
									else if(u.arac.Tur=="Kamyonet")
									{
										JOptionPane.showMessageDialog(null, "Araç Çýkýþý Baþarýlý \n Alýnacak Ücret " + 10*kalinansure , "Onay", -1);
										 otopark.Bakiye += 10*kalinansure ;
									}
								}
							}
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Otoparkta bu plakada araç bulunmuyor", "Hata", -1);
					}
				}
				catch(Exception d)
				{
					
				}
			 txtCikisPlaka.setText("");
				
			}
		});
		btnCikisYap.setBounds(99, 90, 182, 47);
		panel_2.add(btnCikisYap);
	}
}
