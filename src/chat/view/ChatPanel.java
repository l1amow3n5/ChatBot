package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
//import java.awt.Font;
//import java.awt.SystemColor;
import java.awt.Dimension;

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
		this.chatArea = new JTextArea("Chat Area", 20, 50);
		this.chatPane = new JScrollPane();
		this.chatField = new JTextField("Talk to the bot here", 50);
				
		setupScrollPane();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	private void setupPanel()
	{	
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.BLUE);
		this.add(chatPane);
		this.add(chatButton);
		this.add(saveButton);
		this.add(loadButton);
		this.add(checkerButton);
		this.add(chatField);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, 0, SpringLayout.SOUTH, saveButton);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, -92, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, 0, SpringLayout.SOUTH, loadButton);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -259, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, loadButton, 0, SpringLayout.SOUTH, checkerButton);
		appLayout.putConstraint(SpringLayout.EAST, loadButton, -426, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, checkerButton, -593, SpringLayout.EAST, this);	
		appLayout.putConstraint(SpringLayout.SOUTH, checkerButton, 122, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 40, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 40, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, loadButton, 40, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 40, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, chatPane, 50, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatPane, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatPane, -50, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatField, 30, SpringLayout.SOUTH, chatPane);
		appLayout.putConstraint(SpringLayout.WEST, chatField, 0, SpringLayout.WEST, chatPane);
		appLayout.putConstraint(SpringLayout.EAST, chatField, 0, SpringLayout.EAST, chatPane);
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String input = chatField.getText();
				String output = "";
				output = appController.interactWithChatbot(input);
				chatField.setText("");
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
			}
		});
	}

}
