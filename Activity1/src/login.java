import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.Point;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class login {

	private JFrame frmTweety;
	private JTextField Username;
	private JPasswordField password;
	private JPanel panel;
	private JLabel TwitterLogo;
	private JLabel LOGO1;
	private JLabel UsernameLogo;
	private JLabel PasswordLogo;
	private JLabel peopleIcon;
	private JLabel messageIcon;
	private JLabel people;
	private JLabel conversation;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frmTweety.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTweety = new JFrame();
		frmTweety.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTweety.setAlwaysOnTop(true);
		frmTweety.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frmTweety.setResizable(false);
		frmTweety.setMinimumSize(new Dimension(708, 477));
		frmTweety.getContentPane().setForeground(new Color(255, 255, 255));
		frmTweety.setVisible(true);
		frmTweety.getContentPane().setBackground(new Color(255, 255, 255));
		frmTweety.setForeground(new Color(128, 255, 255));
		frmTweety.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Downloads\\Icon.png"));
		frmTweety.setTitle("Tweety ");
		frmTweety.getContentPane().setLayout(null);
		
		Username = new JTextField();
		Username.setBounds(454, 236, 140, 20);
		Username.setText("Phone, email, or username");
		frmTweety.getContentPane().add(Username);
		Username.setColumns(10);
		Username.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                // Clear the text when the field is focused
            	Username.setText("");
            	Username.setForeground(Color.BLACK);
            }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if (Username.getText().length() == 0) {
                   Username.setText("Username");
			}
          	
			} });
		
		password = new JPasswordField();
		password.setToolTipText("Password");
		password.setText("Password");
		password.setBounds(454, 288, 140, 20);
		password.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                // Clear the text when the field is focused
                password.setText("");
                password.setForeground(Color.BLACK);
            }

            public void focusLost(FocusEvent e) {
                // Restore the prompt when the field loses focus and is empty
                if (password.getPassword().length == 0) {
                    password.setText("Enter password...");
                    password.setForeground(Color.GRAY);
                }
            } });
		frmTweety.getContentPane().add(password);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.setForeground(new Color(255, 255, 255));
		LoginButton.setBackground(new Color(29, 161, 242));
		LoginButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				String user = Username.getText();
				String pass = password.getText();
				
				String[] users = {"howell", "paulo"};
				String[] passwords = {"howell", "paulo"};
				
				   if (user.contains(users[0]) && pass.contains(passwords[0])){
					   Username.setText(null);
					   password.setText(null);
					   	  HowellUser.main(null);
					 	  frmTweety.setVisible(false);
					}
					   else if (user.contains(users[1])& pass.contains(passwords[1])) {
						   Username.setText(null);
						   password.setText(null);
						   PauloUser.main(null);  
						   frmTweety.setVisible(false);
				   }			       
				   else 
				   {
					  JOptionPane.showMessageDialog(null, "Invalid Login Details", "Erorr Logging In", JOptionPane.ERROR_MESSAGE);
					  Username.setText(null);
					  password.setText(null);
				   }			
				  }
		});
	
		LoginButton.setBounds(410, 345, 184, 31);
		frmTweety.getContentPane().add(LoginButton);
		
		panel = new JPanel();
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.setBackground(new Color(29, 161, 242));
		panel.setBounds(0, 0, 329, 447);
		frmTweety.getContentPane().add(panel);
		panel.setLayout(null);
		
		conversation = new JLabel("Join the conversation.");
		conversation.setForeground(Color.WHITE);
		conversation.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		conversation.setBounds(106, 244, 137, 14);
		panel.add(conversation);
		
		people = new JLabel("Here what people are talking about.");
		people.setForeground(Color.WHITE);
		people.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		people.setBounds(105, 219, 194, 14);
		panel.add(people);
		
		JLabel follow = new JLabel("Follow your interests.");
		follow.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 11));
		follow.setForeground(new Color(255, 255, 255));
		follow.setBounds(105, 193, 137, 14);
		panel.add(follow);
		
		messageIcon = new JLabel("");
		messageIcon.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\chat.png"));
		messageIcon.setBounds(79, 244, 16, 14);
		panel.add(messageIcon);
		
		peopleIcon = new JLabel("");
		peopleIcon.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\user (4).png"));
		peopleIcon.setBounds(79, 219, 16, 14);
		panel.add(peopleIcon);
		
		JLabel magnifyingIcon = new JLabel("");
		magnifyingIcon.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\magnifying-glass.png"));
		magnifyingIcon.setBounds(73, 193, 22, 14);
		panel.add(magnifyingIcon);
		
		TwitterLogo = new JLabel("");
		TwitterLogo.setBounds(10, -78, 733, 609);
		panel.add(TwitterLogo);
		TwitterLogo.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\twitter (7).png"));
		
		LOGO1 = new JLabel("");
		LOGO1.setIcon(new ImageIcon("C:\\Users\\user\\Downloads\\twitter (8).png"));
		LOGO1.setBounds(481, 89, 64, 78);
		frmTweety.getContentPane().add(LOGO1);
		
		UsernameLogo = new JLabel("");
		UsernameLogo.setIcon(new ImageIcon(login.class.getResource("/images/user (3).png")));
		UsernameLogo.setBounds(410, 226, 24, 40);
		frmTweety.getContentPane().add(UsernameLogo);
		
		PasswordLogo = new JLabel("");
		PasswordLogo.setIcon(new ImageIcon(login.class.getResource("/images/padlock (1).png")));
		PasswordLogo.setBounds(410, 277, 49, 40);
		frmTweety.getContentPane().add(PasswordLogo);
		
		lblNewLabel = new JLabel("Log in to Tweety ");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel.setBounds(452, 178, 142, 25);
		frmTweety.getContentPane().add(lblNewLabel);
		
	}
}
