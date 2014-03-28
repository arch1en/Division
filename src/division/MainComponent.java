package division;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class MainComponent extends JPanel {
	
	GridBagConstraints gbc;
	private JButton bDivide, bAdd, bRemove, bLock;
	private String database = "database.xlsx";
	private JLabel databaseFileName, jlTesters, jlGroup;
	private JSeparator jsMidToBot, jsUpperLeftToUpperRight;
	private TitledBorder bfTitled;
	
	public MainComponent() {
		super(new GridBagLayout());
		gbc = new GridBagConstraints();
		this.setBorder(BorderFactory.createTitledBorder("Divided"));

		build();
	}
	
	public void build() {
		/** database file name label */
		setGBC(0, 0, 0, 0, 100, 100, gbc.FIRST_LINE_START, 0);
		databaseFileName = new JLabel(database);
		this.add(databaseFileName, gbc);
		
		/** separator horizontal */
		setGBC(0, 1, 0, 0, 100, 100, gbc.PAGE_START, gbc.VERTICAL);
		jsMidToBot = new JSeparator(SwingConstants.VERTICAL);
		this.add(jsMidToBot, gbc);
		
		
		/** testers label */
		setGBC(0,0,0,0,100,100,gbc.FIRST_LINE_END,0);
		this.add(jlTesters = new JLabel("Testers: "),gbc);
		
	}
	
	public void setGBC(int gridx, int gridy, int gridwidth, int gridheight, int weightx, int weighty, int anchor, int fill) {
		gbc.gridx = gridx;
		gbc.gridy = gridy;
		gbc.gridwidth = gridwidth;
		gbc.gridheight = gridheight;
		gbc.weightx =  weightx;
		gbc.weighty =  weighty;
		gbc.anchor = anchor;
		gbc.fill = fill;
	}
	
}
