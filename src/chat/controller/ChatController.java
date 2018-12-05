
package chat.controller;

import javax.swing.JOptionPane;

import chat.model.Chatbot;

import java.util.ArrayList;

import chat.view.ChatFrame;

public class ChatController
{
	private Chatbot simpleBot;
	private ChatFrame appFrame;
	
	
	public ChatController()
	{
		
		simpleBot = new Chatbot();
		appFrame = new ChatFrame(this);
	}
	
	public String interactWithChatbot(String text)
	{
		String output = "";
		output += simpleBot.processText(text);
		return output;
		
		/*
		if (userInput == null)
		{
			output += "You supplied null";
		}
		else
		{
			//output = JOptionPane.showInputDialog(null, "Hi whats up??");
			//output += simpleBot.processText(userInput);
		}
		return output;
		*/
	}
	
	public Chatbot getChatbot()
	{
		return simpleBot;
	}
	
	public String useChatbotCheckers(String text)
	{
		String testedValues = "The following checkers passed:";
		if (simpleBot.contentChecker(text))
		{
			testedValues += "\nContent Checker";
		}
		if (simpleBot.spookyChecker(text))
		{
			testedValues += "\nSpooky Checker Happ Halloween" ;
		}
		if (simpleBot.legitimacyChecker(text))
		{
			testedValues += "\nLegitimacy Checker";
		}
		return testedValues; 
		
	}
	
	public void start()
	{
		/*
		String userInput = "";
		
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}
		*/
	}
	
	
}
