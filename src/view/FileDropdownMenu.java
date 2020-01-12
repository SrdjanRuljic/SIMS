package view;

import java.awt.event.ActionListener;

import javafx.scene.input.Mnemonic;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import controller.ExitActionListener;
import controller.UnderConstrustion;

/**
 * Klasa implementira sve elemente meia {@link EditDropdownMenu}. Ovdje se
 * podesava ime, {@link Mnemonic}, {@link ActionListener} i ikonica za svaku opciju u
 * ovom meniu.
 * 
 * @author Srdjan Ruljic
 * 
 */

public class FileDropdownMenu extends JMenu
{
    private static final long serialVersionUID = 1L;

    public FileDropdownMenu()
    {
	super("File");
	setMnemonic('F');
	JMenuItem newDoc = new JMenuItem("New", new ImageIcon("ico/new-48.png"));
	JMenuItem openDoc = new JMenuItem("Open", new ImageIcon(
		"ico/open-48.png"));
	JMenuItem save = new JMenuItem("Save", new ImageIcon("ico/save-48.png"));
	JMenuItem saveAs = new JMenuItem("Save As", new ImageIcon(
		"ico/saveAs-48.png"));
	JMenuItem print = new JMenuItem("Print", 80);
	JMenuItem exit = new JMenuItem("Exit",
		new ImageIcon("ico/eexit-48.png"));

	add(newDoc);
	add(openDoc);
	add(save);
	add(saveAs);
	addSeparator();
	add(print);
	addSeparator();
	add(exit);

	/**
	 * Implementacija ActionListener - a za svaku pojedinacnu opciju.
	 */

	newDoc.addActionListener(new UnderConstrustion());
	openDoc.addActionListener(new UnderConstrustion());
	save.addActionListener(new UnderConstrustion());
	saveAs.addActionListener(new UnderConstrustion());
	print.addActionListener(new UnderConstrustion());
	exit.addActionListener(new ExitActionListener());

    }

}
