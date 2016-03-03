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
		baseLayout.putConstraint(SpringLayout.NORTH, gameBoardTable, 50, SpringLayout.SOUTH, changeButton);
		baseLayout.putConstraint(SpringLayout.WEST, gameBoardTable, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, gameBoardTable, -50, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, col, 0, SpringLayout.WEST, displayButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayButton, -6, SpringLayout.NORTH, changeButton);
		baseLayout.putConstraint(SpringLayout.EAST, displayButton, 0, SpringLayout.EAST, changeButton);
		baseLayout.putConstraint(SpringLayout.WEST, changeButton, 126, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, changeButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, changeTable, 0, SpringLayout.NORTH, row);
		baseLayout.putConstraint(SpringLayout.WEST, changeTable, 17, SpringLayout.EAST, col);
		baseLayout.putConstraint(SpringLayout.NORTH, row, 55, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, col, 0, SpringLayout.NORTH, row);
		baseLayout.putConstraint(SpringLayout.NORTH, boardGame, 3, SpringLayout.NORTH, changeTable);
		baseLayout.putConstraint(SpringLayout.WEST, boardGame, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, row, 68, SpringLayout.WEST, this);
	}
	
	private void setUpListeners()
	{
		
	}
}
