package My2DCreation.view;

import javax.swing.JFrame;

import My2DCreation.controller.BoardGameController;

public class BoardGameFrame extends JFrame
{
	private BoardGameController baseController;
	private BoardGamePanel basePanel;
	
	public BoardGameFrame()
	{
		this.baseController = baseController;
		basePanel = new BoardGamePanel(baseController);
		
		
		setUpFrame();
	}
	
	private void setUpFrame()
	{
		this.setSize(750, 300);
		this.setContentPane(basePanel);
		this.setTitle("Array of different board games!");
		this.setVisible(true);
		
	}
}
