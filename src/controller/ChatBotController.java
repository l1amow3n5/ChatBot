package controller;

import model.ChatBot;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ChatBotController
{
	private ChatBot simpleBot;
	
	public ChatBotController()
	{
		simpleBot = new ChatBot();
	}
	
	public String interactWithChatBot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(null, "Hi whats up??");
		output = simpleBot.processText(userResponse);	
		return output;
	}
	
	public void start()
	{
		String userInput = "";
		
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatBot(userInput);
		}
	}
}
