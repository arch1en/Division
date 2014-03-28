package division;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Menu extends JPanel {
	
	JMenuBar jmb;
	JMenu jmFile, jmAbout;
	public ArrayList<JMenuItem> jmi = new ArrayList<JMenuItem>();
	ArrayList<JMenu> jm = new ArrayList<JMenu>();
	private JFileChooser jfc = new JFileChooser();
	public File openedFile;
	
	public Menu() {
		super(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		gbc.weightx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		jmb = new JMenuBar();
		this.add(jmb, gbc);
		build();
		for(int i = 0; i < jm.size(); i++) {
			jmb.add(jm.get(i));
		}
		jm.get(0).add(jmi.get(0));
		
		/*jmi.get(0).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
				int option = jfc.showOpenDialog(Menu.this);
				openedFile = jfc.getSelectedFile();
			}
		});*/
		jm.get(0).add(jmi.get(1));
		jm.get(1).add(jmi.get(2));
		
		
	}
	
	public void build() {
		jm.add(new JMenu("File"));
		jm.add(new JMenu("About"));
		jmi.add(new JMenuItem("Set database file..."));
		jmi.add(new JMenuItem("Save results as..."));
		jmi.add(new JMenuItem("About"));
	}
	
}
