import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Server extends JFrame implements ActionListener {
	Server(){
		setLayout(null);
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(100, 94, 84));
		p1.setBounds(0,0,600,700);
		p1.setLayout(null);
		add(p1);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
		Image i2 = i1.getImage().getScaledInstance(25 , 25 ,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel back = new JLabel(i3);
		back.setBounds(5, 20 ,25 ,25);
		p1.add(back);
		back.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent ae) {
				System.exit(0);
			}
		});
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/Myself.jpeg"));
		Image i5 = i4.getImage().getScaledInstance(50 , 50 ,Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel profile = new JLabel(i6);
		profile.setBounds(40, 10 , 50 ,50);
		p1.add(profile);
		
		ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
		Image i8 = i7.getImage().getScaledInstance(30 , 30,Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);
		JLabel video = new JLabel(i9);
		video.setBounds(300, 20 , 30 , 30);
		p1.add(video);
		
		ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
		Image i11 = i10.getImage().getScaledInstance(35,30,Image.SCALE_DEFAULT);
		ImageIcon i12 = new ImageIcon(i11);
		JLabel phone = new JLabel(i12);
		phone.setBounds(360, 20 , 40, 30);
		p1.add(phone);
		
		JLabel name = new JLabel("The Ziprya");
		name.setBounds(110, 15, 100,18);
		name.setForeground(Color.ORANGE);
		name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		p1.add(name);
		
		JLabel status = new JLabel("Online..");
		status.setBounds(110, 15, 100,100);
		status.setForeground(Color.ORANGE);
		status.setFont(new Font("SAN_SERIF",Font.BOLD,18));
		p1.add(status);
		
		JTextField text = new JTextField();
		text.setBounds(5,600,800,40);
		text.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
		p1.add(text);
		
		JButton send = new JButton("Send");
		send.setBounds(320,600,123,700);
		send.setBackground(new Color(7,94,84));
		send.setForeground(Color.WHITE);
		send.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
		p1.add(send);
		
		setSize(600, 700);
		setLocation(500, 150);
		setVisible(true);
		//To set the position of the app
		getContentPane().setBackground(Color.DARK_GRAY);
	}
	public static void main(String[] args) {
		new Server();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
