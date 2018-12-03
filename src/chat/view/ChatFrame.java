package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;

public class ChatFrame extends JFrame
{
	private ChatController appController;
	private ChatPanel appPanel;
	
	public ChatFrame (ChatController appController)
	{
		super();
		
		this.appController = appController;
		this.appPanel = new ChatPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("ChatBot");
		this.setSize(1000, 500);
		this.setResizable(false);
		
	}
}
