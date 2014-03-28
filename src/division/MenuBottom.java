package division;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuBottom extends JPanel {
	
	private GridBagConstraints gbc;
	private JButton jbDivide;
	
	public MenuBottom() {
		super(new GridBagLayout());
		gbc = new GridBagConstraints();
		setGBC(0,0,0,0,100,100,gbc.CENTER,0);
		add(jbDivide = new JButton("Divide"), gbc);
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
