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
	
	public void interactWithChatBot(String userInput)
	{
		
	}
	public void start()
	{
		String userInput = "";
		
		while(!userInput.equals("quit"))
		{
			userInput = JOptionPane.showInputDialog(null, "Type quit to leave.");
		}
	}
}
