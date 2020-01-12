package view;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import controller.ExitActionListener;
import controller.UnderConstrustion;

/**
 * Klasa obezbjedjuje implementaciju ToolBar - a, prosirena je sa
 * {@link JToolBar} pomocukojeg je uredjena izgled alatki. Dodate su i ikonice
 * za pojedinacne alatke kao i {@link ActionListener} za svaku.
 * 
 * @author Srdjan Ruljic
 * 
 */

public class Toolbar extends JToolBar
{
    private static final long serialVersionUID = 1L;

    public Toolbar()
    {
	JButton openFile = new JButton(new ImageIcon("ico/open-48.png"));
	JButton newFile = new JButton(new ImageIcon("ico/new-48.png"));

	add(newFile);
	add(openFile);
	openFile.addActionListener(new UnderConstrustion());
	newFile.addActionListener(new UnderConstrustion());
	addSeparator();

	JButton save = new JButton(new ImageIcon("ico/save-48.png"));
	JButton saveAs = new JButton(new ImageIcon("ico/saveAs-48.png"));

	add(save);
	add(saveAs);
	save.addActionListener(new UnderConstrustion());
	saveAs.addActionListener(new UnderConstrustion());
	addSeparator();

	JButton undo = new JButton(new ImageIcon("ico/undo-48.png"));
	undo.setEnabled(false);
	JButton redo = new JButton(new ImageIcon("ico/redo-48.png"));
	redo.setEnabled(false);
	add(undo);
	add(redo);

	redo.addActionListener(new UnderConstrustion());
	undo.addActionListener(new UnderConstrustion());
	addSeparator();

	JButton cut = new JButton(new ImageIcon("ico/cut-48.png"));
	JButton copy = new JButton(new ImageIcon("ico/copy-48.png"));
	JButton paste = new JButton(new ImageIcon("ico/paste-48.png"));

	cut.addActionListener(new UnderConstrustion());
	copy.addActionListener(new UnderConstrustion());
	paste.addActionListener(new UnderConstrustion());
	add(cut);
	add(copy);
	add(paste);
	addSeparator();

	JButton zoomIn = new JButton(new ImageIcon("ico/zoomIn-48.png"));
	JButton zoomOut = new JButton(new ImageIcon("ico/zoomOut-48.png"));

	zoomIn.addActionListener(new UnderConstrustion());
	zoomOut.addActionListener(new UnderConstrustion());
	add(zoomIn);
	add(zoomOut);
	addSeparator();

	JButton exit = new JButton(new ImageIcon("ico/eexit-48.png"));
	add(exit);

	exit.addActionListener(new ExitActionListener());
    }
}
