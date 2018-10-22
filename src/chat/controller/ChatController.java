package chat.controller;

import javax.swing.JOptionPane;

import chat.model.ChatBot;

import java.util.ArrayList;

public class ChatController
{
	private ChatBot simpleBot;
	
	public ChatController()
	{
		simpleBot = new ChatBot();
	}
	
	public String interactWithChatbot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(null, "Hi whats up??");
		output = simpleBot.processText(userResponse);	
		return output;
	}
	
	public ChatBot getChatbot()
	{
		return simpleBot;
	}
	
	public void start()
	{
		String userInput = "";
		
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}
	}
}
