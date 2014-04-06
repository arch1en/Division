package division;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class MainComponent extends JPanel {
	
	private String[] testersAmount = {  "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" };
	
	GridBagConstraints gbc;
	private JButton bDivide, bAdd, bRemove, bLock;
	private String database = "database.xlsx";
	private JLabel databaseFileName, jlTesters, jlParts, jlDivision;
	private JSeparator jsMidToBot, jsUpperLeftToUpperRight;
	private TitledBorder bfTitled;
	private JComboBox jcbTestersAmount;
	private JCheckBox[] jcbUIT = new JCheckBox[3];
	public File filePath;
	
	public MainComponent() {
		super(new GridBagLayout());
		gbc = new GridBagConstraints();
		this.setBorder(BorderFactory.createTitledBorder("Divided"));

		build();
	}
	
	public void build() {
		gbc.insets = new Insets(5,10,5,5);
		
		/** file name label */
		//setGBC(0, 0, 0, 0, 0, 0, 0);
		gbc.gridx = 0;
		databaseFileName = new JLabel(database);
		this.add(databaseFileName, gbc);
		
		/** separator horizontal */
		gbc.gridx = 1;
		gbc.fill = gbc.VERTICAL;
		jsMidToBot = new JSeparator(SwingConstants.VERTICAL);
		this.add(jsMidToBot, gbc);
		
		
		/** testers label */
		gbc.gridx = 2;
		//setGBC(0,2,0,0,0,0,0);
		this.add(jlTesters = new JLabel("Testers: "), gbc);
		
		/** testers amount combo box */
		gbc.gridx = 3;
		this.add(jcbTestersAmount = new JComboBox(testersAmount), gbc);
		
		/** parts label */
		gbc.gridy = 1;
		gbc.gridx = 2;
		this.add(jlParts = new JLabel("Parts: "), gbc);
		
		/** parts check boxes */
		gbc.gridx = 3;
		this.add(jcbUIT[0] = new JCheckBox("UIT 1"), gbc);
		gbc.gridy = 2;
		gbc.gridx = 3;
		this.add(jcbUIT[1] = new JCheckBox("UIT 2"), gbc);
		gbc.gridy = 3;
		gbc.gridx = 3;
		this.add(jcbUIT[2] = new JCheckBox("UIT 3"), gbc);
		
		/** division label */
		gbc.gridy = 4;
		gbc.gridx = 2;
		this.add(jlDivision = new JLabel("Division: "), gbc);
	}
	
	public void setGBC(int gridx, int gridy, int gridwidth, int gridheight, int weightx, int weighty, int fill) {
		gbc.gridx = gridx;
		gbc.gridy = gridy;
		gbc.gridwidth = gridwidth;
		gbc.gridheight = gridheight;
		gbc.weightx =  weightx;
		gbc.weighty =  weighty;
		//gbc.anchor = anchor;
		gbc.fill = fill;
	}
	
	public void waitForFile() {
		
		
	}
	
}
