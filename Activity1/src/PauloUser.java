import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PauloUser {

	private JFrame frmTweetyUserInformation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PauloUser window = new PauloUser();
					window.frmTweetyUserInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PauloUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		String name = "Juan Paulo A. David";
		String birthdate = "April 27, 2003";
		String hobbies = "Playing basketball and weightlifting";
		String Talent = "";
		String bsit =	"I've always loved technology and video games, and as the world becomes more technologically\nadvanced each day, I see opportunity in it.";		
		String strength = "For my strengths as a student is that I am eager to learn new things\nspecially in my course andbeing able to adapt to changes that surrounds me.My weakness is procastination.";
			
	
		frmTweetyUserInformation = new JFrame();
		frmTweetyUserInformation.getContentPane().setEnabled(false);
		frmTweetyUserInformation.getContentPane().setBackground(new Color(255, 255, 255));
		frmTweetyUserInformation.setTitle("Tweety User Information");
		frmTweetyUserInformation.setIconImage(Toolkit.getDefaultToolkit().getImage(HowellUser.class.getResource("/images/twitter (2).png")));
		frmTweetyUserInformation.setBounds(100, 100, 1024, 660);
		frmTweetyUserInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTweetyUserInformation.getContentPane().setLayout(null);
		
		JButton LogOut = new JButton("");
		LogOut.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\logout.png"));
		LogOut.setBorderPainted(false);
		LogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 login.main(null);
				 frmTweetyUserInformation.setVisible(false);
			}
		});
		
		JLabel Profile = new JLabel("");
		Profile.setBounds(-102, 93, 399, 258);
		frmTweetyUserInformation.getContentPane().add(Profile);
		Profile.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\Untitled design (9).png"));
		LogOut.setBackground(new Color(255, 255, 255));
		LogOut.setBounds(959, 573, 39, 38);
		frmTweetyUserInformation.getContentPane().add(LogOut);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1010, 246);
		frmTweetyUserInformation.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel profile = new JLabel("");
		profile.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\My project.jpg"));
		profile.setBounds(0, 0, 1010, 246);
		panel.add(profile);
		
		JLabel Name = new JLabel(name);
		Name.setFont(new Font("Segoe UI Black", Font.BOLD, 19));
		Name.setBounds(38, 345, 259, 53);
		frmTweetyUserInformation.getContentPane().add(Name);
		
		JLabel verified = new JLabel("");
		verified.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\verified (2).png"));
		verified.setBounds(237, 355, 28, 31);
		frmTweetyUserInformation.getContentPane().add(verified);
		
		JLabel username = new JLabel("@OfficialPaulo");
		username.setForeground(new Color(128, 128, 128));
		username.setFont(new Font("Segoe UI", Font.BOLD, 13));
		username.setBounds(38, 384, 154, 14);
		frmTweetyUserInformation.getContentPane().add(username);
		
		JTextArea Information = new JTextArea(birthdate + " | " + hobbies+ " | " + Talent+" | " +bsit+ " | "+ strength);
		Information.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		Information.setBounds(38, 409, 910, 122);
		frmTweetyUserInformation.getContentPane().add(Information);
		
		JLabel place = new JLabel("Caloocan");
		place.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		place.setForeground(new Color(131, 150, 165));
		place.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\location.png"));
		place.setBounds(38, 531, 89, 31);
		frmTweetyUserInformation.getContentPane().add(place);
		
		JLabel link = new JLabel("www.facebook.com/pauxloo");
		link.setForeground(new Color(0, 172, 238));
		link.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		link.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\link.png"));
		link.setBounds(132, 531, 191, 31);
		frmTweetyUserInformation.getContentPane().add(link);
		
		JLabel bday = new JLabel("Born April 27");
		bday.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		bday.setForeground(new Color(131, 150, 165));
		bday.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\balloon.png"));
		bday.setBounds(333, 531, 113, 31);
		frmTweetyUserInformation.getContentPane().add(bday);
		
		JLabel joined = new JLabel(" Joined May 2023");
		joined.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		joined.setForeground(new Color(131, 150, 165));
		joined.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\calendar.png"));
		joined.setBounds(440, 531, 170, 31);
		frmTweetyUserInformation.getContentPane().add(joined);
		
		JLabel NoFollowing = new JLabel("1");
		NoFollowing.setFont(new Font("Segoe UI", Font.BOLD, 16));
		NoFollowing.setBounds(38, 573, 28, 38);
		frmTweetyUserInformation.getContentPane().add(NoFollowing);
		
		JLabel NoFollowers = new JLabel("999.9K");
		NoFollowers.setFont(new Font("Segoe UI", Font.BOLD, 16));
		NoFollowers.setBounds(248, 573, 65, 38);
		frmTweetyUserInformation.getContentPane().add(NoFollowers);
		
		JLabel following = new JLabel("Following");
		following.setForeground(new Color(131, 150, 165));
		following.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		following.setBounds(52, 581, 65, 24);
		frmTweetyUserInformation.getContentPane().add(following);
		
		JLabel followers = new JLabel("Followers");
		followers.setForeground(new Color(131, 150, 165));
		followers.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		followers.setBounds(301, 581, 65, 24);
		frmTweetyUserInformation.getContentPane().add(followers);
		
		JButton follow = new JButton("");
		follow.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\add.png"));
		follow.setBounds(481, 257, 120, 71);
		frmTweetyUserInformation.getContentPane().add(follow);
		follow.setBorderPainted(false);
		follow.addActionListener(new ActionListener() 
			{
			public void actionPerformed(ActionEvent e) {
				Icon currentIcon = follow.getIcon();
			    Icon initialIcon = new javax.swing.ImageIcon(getClass().getResource("images/add-friend.png"));
			    Icon newIcon = new javax.swing.ImageIcon(getClass().getResource("images/add.png"));
			    
			    // Compare the current icon with the initial icon
			    if (currentIcon == initialIcon) {
			        // If the current icon is the initial icon, set the new icon
			    	follow.setIcon(newIcon);
			    } else {
			        // If the current icon is not the initial icon, set the initial icon back
			    	follow.setIcon(initialIcon);
			    }
			
			}

		});
		follow.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\add.png"));
		follow.setBackground(new Color(255, 255, 255));
		follow.setForeground(new Color(255, 255, 255));
		follow.setBounds(916, 257, 48, 53);
		frmTweetyUserInformation.getContentPane().add(follow);

	}
}
