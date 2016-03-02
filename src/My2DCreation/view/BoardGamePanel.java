package My2DCreation.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import My2DCreation.controller.BoardGameController;

public class BoardGamePanel extends JPanel
{

	private BoardGameController baseController;
	private SpringLayout baseLayout;
	private JTextField row;
	private JTextField col;
	private JLabel boardGame;
	private JTextField changeTable;
	private JButton changeButton;
	private JButton displayButton;
	private JTable gameBoardTable;
	
	public BoardGamePanel(BoardGameController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		row = new JTextField(5);
		col = new JTextField(5);
		changeTable = new JTextField(20);
		boardGame = new JLabel("BoardGame: ");
		changeButton = new JButton("Change the current BoardGame");
		displayButton = new JButton("Show the current BaordGame");
		
		//Calling helper method
		setUpPanel();
		setUpTable();
		setUpLayout();
		setUpListeners();
		
	}
	
	private void setUpPanel()
	{
		this.setLayout(baseLayout);
		this.add(changeTable);
		this.add(changeButton);
		this.add(row);
		this.add(col);
		this.add(changeTable);
		this.add(boardGame);
		this.add(displayButton);
		this.setBackground(Color.BLUE);
	}
	/**
	 * Setting up and making the table.
	 */
	private void setUpTable()
	{
		String [] colHeader = {"Col 0", "Col 1", "Col 2"};
		DefaultTableModel table = new DefaultTableModel(); //Change for arguments
		gameBoardTable = new JTable(table);
		
	}
	
	private void setUpLayout()
	{
		
	}
	
	private void setUpListeners()
	{
		
	}
}
