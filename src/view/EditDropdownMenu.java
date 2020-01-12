package view;

import java.awt.event.ActionListener;

import javafx.scene.input.Mnemonic;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import controller.UnderConstrustion;

/**
 * Klasa implementira sve elemente meia {@link EditDropdownMenu}. Ovdje se
 * podesava ime, {@link Mnemonic} i {@link ActionListener} za svaku opciju u
 * ovom meniu.
 * 
 * @author Srdjan Ruljic
 * 
 */

public class EditDropdownMenu extends JMenu
{
    private static final long serialVersionUID = 1L;

    public EditDropdownMenu()
    {
	super("Edit");
	setMnemonic('E');
	JMenuItem undo = new JMenuItem("Undo", 85);
	JMenuItem redo = new JMenuItem("Redo", 82);
	JMenuItem cut = new JMenuItem("Cut", 84);
	JMenuItem copy = new JMenuItem("Copy", 67);
	JMenuItem paste = new JMenuItem("Paste", 80);
	JMenuItem select = new JMenuItem("Select");
	JMenuItem selectAll = new JMenuItem("Select All", 65);
	JMenuItem findAndReplace = new JMenuItem("Find", 70);

	add(undo);
	add(redo);
	addSeparator();
	add(cut);
	add(copy);
	add(paste);
	addSeparator();
	add(select);
	add(selectAll);
	addSeparator();
	add(findAndReplace);

	/**
	 * Implementacija ActionListener - a za svaku pojedinacnu opciju.
	 */

	undo.addActionListener(new UnderConstrustion());
	redo.addActionListener(new UnderConstrustion());
	cut.addActionListener(new UnderConstrustion());
	copy.addActionListener(new UnderConstrustion());
	paste.addActionListener(new UnderConstrustion());
	select.addActionListener(new UnderConstrustion());
	selectAll.addActionListener(new UnderConstrustion());
	findAndReplace.addActionListener(new UnderConstrustion());
    }
}
