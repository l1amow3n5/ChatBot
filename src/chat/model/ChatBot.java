package chat.model;

import java.util.ArrayList;

public class Chatbot
{
	private String botName, content, joke, currentUser;
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList;
	
	public Chatbot()
	{
		this.currentUser = "unnamed user";
		this.botName = "c-bot";
		this.joke = "Why did the chicken cross the road?";
		this.content = "sample content";
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList <String>();
		
		buildTheLists();
	}
	
	public boolean contentChecker(String input)
	{
		boolean legit = false;
		
		if(input.contains(content + "text"))
		{
			legit = false;
		}
		else if (input.contains("text" + content + "text"))
		{
			legit = false;
		}
		else if (input.contains("text" + content))
		{
			legit = false; 
		}
		else if (input.contains(content)) 
		{
			legit = true;
		}
		
		return legit; 
	}
	
	public boolean legitimacyChecker(String input)
	{
		boolean isValid = true;
		if ( input == null)
		{
			isValid = false;
		}
		else if (input.length() < 2) 
		{
			isValid = false;
		}
		else if (input.contains("sdf") || input.contains("cvb"))
		{
			isValid = false;
		}
		return isValid;
	}
	
	public boolean spookyChecker(String input)
	{
		boolean isValid = false;
		if (input.contains("Halloween"))
		{
			isValid = true;
		}
		else if (input.contains("Easter"))
		{
			isValid = false;
		}
		else 
		{
			isValid = true;
		}
		return isValid;
	}
	
	private void buildTheLists()
	{
		responseList.add("Hello! How are you?");
		responseList.add("Goodbye - no more talking!");
		responseList.add("I dont understand what you said.");
		responseList.add("I only serve Mother Russia!!");
		responseList.add("Why do you insult me??");
		responseList.add("I am having a great day");
		responseList.add("Do you like fortnite");
		responseList.add("What did you say?");
		responseList.add("I think I should go now");
		responseList.add("Goodbye");
		responseList.add("Do you know Josh?");
		responseList.add("It is a nice day");
		responseList.add("It is not a good day");
		responseList.add("I have a lot of things to do today");
		responseList.add("No time to talk I have to finish saving the world");
		responseList.add("We will win"); 
		
		
		spookyList.add("Halloween is better than Cashmas!");
		spookyList.add("Jack Skellington!!!");
		spookyList.add("Do you like scary movies?");
		spookyList.add("Trick or Treat");
		spookyList.add("graveyard");
		spookyList.add("reaper");
		spookyList.add("Scoop");
		spookyList.add("Scooby Doo");
		spookyList.add("Like run Scoob!!!!");
		
		
	
	}
	
	public Chatbot(String botName, String content, String joke, String currentUser)
	{
		this.botName = botName;
		this.content = content;
		this.joke = joke;
		this.currentUser = currentUser;
			
	}
	
	public Chatbot(String string)
	{
		content = "sample content";
	}
	
	public String processText(String userText)
	{
		
		int randomIndex = (int) (Math.random() * responseList.size());
		
		String answer = "";
		
		answer += "You said: " + userText + ". Chatbot says: " + responseList.get(randomIndex); 
		
		if(userText != null && userText.contains(content))
		{
			answer = answer + " You said the special words";
		}		
			return answer; 
	}
	public boolean testChatbotString(String input)
	{
		boolean isValid = true;
		
		return isValid;
			
	}
	
	public ArrayList<String> getResponseList()
	{
		return responseList;
	}
	
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
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
	
	public String getBotName()
	{
		return botName;
	}
	/*public void setSpookylist()
	{
		this.spookyList = spookyList;
	}*/
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
	
	
	public void setBotName()
	{
		this.botName = botName; 
	}
}
