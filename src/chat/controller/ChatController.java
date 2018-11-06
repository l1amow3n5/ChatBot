package chat.controller;

import javax.swing.JOptionPane;

import chat.model.Chatbot;

import java.util.ArrayList;

public class ChatController
{
	private Chatbot simpleBot;
	
	public ChatController()
	{
		simpleBot = new Chatbot();
	}
	
	public String interactWithChatbot(String userInput)
	{
		String output = "";
			
		
		
		if (userInput == null)
		{
			output += "You supplied null";
		}
		else
		{
			output = JOptionPane.showInputDialog(null, "Hi whats up??");
			output += simpleBot.processText(userInput);
		}
		return output;
	}
	
	public Chatbot getChatbot()
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
	public String useChatbotCheckers(String input)
	{
		return input;
	}
	
}
