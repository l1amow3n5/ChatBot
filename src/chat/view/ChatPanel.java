package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
//import java.awt.Font;
//import java.awt.SystemColor;
import java.awt.Dimension;
import chat.controller.IOController;
import java.awt.GridLayout;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	//private JLabel responseLabel;
	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;
	private JButton resetButton;
	private JButton tweetButton;
	private JButton searchTwitterButton;
	private SpringLayout appLayout;
	private JTextField chatField;
	//private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	private JPanel buttonPanel;
	
	public ChatPanel(ChatController app)
	{
		super();
		
		this.appController = app;
		this.chatButton = new JButton("Chat");
		this.checkerButton = new JButton("Check Text");
		this.loadButton = new JButton("Load");
		this.resetButton = new JButton("Reset");
		this.saveButton = new JButton("Save");
		this.appLayout = new SpringLayout();		
		this.chatArea = new JTextArea("Chat Area", 20, 50);
		this.chatPane = new JScrollPane();		
		this.chatField = new JTextField("Talk to the bot here", 50);
		tweetButton = new JButton("Send tweet");
		searchTwitterButton = new JButton("Send tweet");
		
		buttonPanel = new JPanel(new GridLayout(1,0));
				
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
		this.setPreferredSize(new Dimension(1024, 768));
		this.setBackground(Color.BLUE);
		this.add(chatPane);
		this.add(chatField);
		
	}
	
	private String getPath(String choice)
	{
		String path = ".";
		int result = -99;
		JFileChooser fileChooser = new JFileChooser();
		if (choice.equals("save"))
		{
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			result = fileChooser.showSaveDialog(this);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getCurrentDirectory().getAbsolutePath();
			}
		}
		else
		{
			result = fileChooser.showOpenDialog(this);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getSelectedFile().getAbsolutePath();
			}
		}
		return path;
	}
	
	private void setupLayout()
	{
		
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
				chatArea.append(output);
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
			}
		});
		
		resetButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click)
				{
					chatArea.setText("");
					
				}
				
			});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String chatText = chatArea.getText();
				String path = getPath("save");
				IOController.saveText(appController, path, chatText);
				chatArea.setText("chat saved!");
			}
			
		});
		
		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String path = getPath("load");
				String chatText = IOController.loadFile(appController, path);
				chatArea.setText(chatText);
				
			}
			
		});
		
		checkerButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
				
			}
			
		});
	}
	

}
