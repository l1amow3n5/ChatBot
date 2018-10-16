package model;

public class ChatBot
{
	private String userName, botName;
	public ChatBot()
	{
		this.userName = "unnamed user";
		this.botName = "c-bot";
	}
	public String getUserName()
	{
		return userName;
	}
	
	public String getBotName()
	{
		return botName;
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
