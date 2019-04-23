package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;

public class ChatFrame extends JFrame
{
	private ChatController appController;
	private ChatPanel appPanel;
	
	public ChatFrame (ChatController app)
	{
		super();
		
		this.appController = app;
		this.appPanel = new ChatPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("ChatBot and Twitter 3.0");
		this.setSize(1024, 768);
		this.setResizable(false);
		this.setVisible(true);
	}
}
