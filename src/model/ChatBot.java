package model;

import java.util.ArrayList;

public class ChatBot
{
	private String userName, botName, content, joke, currentUser;
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList;
	
	public ChatBot()
	{
		this.userName = "unnamed user";
		this.botName = "c-bot";
		this.joke = "Why did the chicken cross the road?";
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList <String>();
		
		buildTheLists();
	}
	
	private void buildTheLists()
	{
		responseList.add("Hello! How are you?");
		responseList.add("Goodbye - no more talking!");
		responseList.add("I dont understand what you said.");
		responseList.add("I only serve Mother Russia!!");
		responseList.add("Why do you insult me??");
		
		spookyList.add("Halloween is better than Cashmas!");
		spookyList.add("Jack Skellington!!!");
		spookyList.add("Do you like scary movies?");
		
	
	}
	
	public String processText(String userText)
	{
		String answer = "";
		
		answer += "You said: " + userText;
		
		return answer; 
	}
	
	public String getContent()
	{
		return content;
	}
	
	public String getJoke()
	{
		return joke;
	}
	
	public String getCurrentUser()
	{
		return currentUser;
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public String getBotName()
	{
		return botName;
	}
	
	public void setContent()
	{
		this.content = content;
	}
	
	public void setJoke()
	{
		this.joke = joke; 
	}
	
	public void setCurrentUser()
	{
		this.currentUser = currentUser;
	}
	
	public void setUserName()
	{
		this.userName = userName;
	}
	
	public void setBotName()
	{
		this.botName = botName; 
	}
}
