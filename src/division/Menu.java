package division;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.MenuComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Menu extends JPanel {
	
	JMenuBar jmb;
	JMenu jmFile, jmAbout;
	MainComponent maincomp;
	public ArrayList<JMenuItem> jmi = new ArrayList<JMenuItem>();
	ArrayList<JMenu> jm = new ArrayList<JMenu>();
	public JFileChooser jfc = new JFileChooser();
	public File filePath;
	private FileInputStream file;
	
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
		jm.get(0).add(jmi.get(1));
		jm.get(1).add(jmi.get(2));
		setFilePath();
	}
	
	public void build() {
		jm.add(new JMenu("File"));
		jm.add(new JMenu("About"));
		jmi.add(new JMenuItem("Set database file..."));
		jmi.add(new JMenuItem("Save results as..."));
		jmi.add(new JMenuItem("About"));
	}
	public void setFilePath() {
		jmi.get(0).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel xlsx", "xlsx");
				jfc.setFileFilter(filter);
				int returnVal = jfc.showOpenDialog(Menu.this);
				
				if(returnVal == JFileChooser.APPROVE_OPTION){
					
					Main.filePath = jfc.getSelectedFile();

				}
			}
		});
	}
	
	public File getFilePath() {
		return filePath;
	}
	
}
