package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	//private JLabel responseLabel;
	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;
	private SpringLayout appLayout;
	private JTextField chatField;
	//private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatPanel(ChatController app)
	{
		super();
		
		this.appController = app;
		this.chatButton = new JButton("Chat");
		this.checkerButton = new JButton("Check Text");
		this.loadButton = new JButton("Load");
		this.saveButton = new JButton("Save");
		this.appLayout = new SpringLayout();
		this.chatField = new JTextField("Talk to the bot here", 50);
		this.chatArea = new JTextArea("Chat Area", 20, 50);
		this.chatPane = new JScrollPane();
		
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupScrollPane()
	{
		
	}
	
	private void setupPanel()
	{	/*
		this.setBackground(Color.MAGENTA);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, chatButton, 246, SpringLayout.SOUTH, responseLabel);
		springLayout.putConstraint(SpringLayout.WEST, chatButton, 0, SpringLayout.WEST, responseLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, chatButton, 419, SpringLayout.SOUTH, responseLabel);
		springLayout.putConstraint(SpringLayout.EAST, chatButton, 598, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.WEST, responseLabel, 314, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.EAST, responseLabel, -408, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, responseLabel, 10, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.SOUTH, responseLabel, 51, SpringLayout.NORTH, this);
		setLayout(springLayout);
		this.add(responseLabel);
		this.add(chatButton);
		*/
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		/*
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				//changeBackgroundColor();
			}
		}); */
	}

}
