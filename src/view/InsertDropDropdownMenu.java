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

public class InsertDropDropdownMenu extends JMenu
{
    private static final long serialVersionUID = 1L;

    public InsertDropDropdownMenu()
    {
	super("Insert");
	setMnemonic('I');
	JMenuItem insert = new JMenuItem("Image/Audio/Video");
	JMenuItem link = new JMenuItem("Link");
	JMenuItem formula = new JMenuItem("Equation and Character");
	JMenuItem table = new JMenuItem("Tabele");
	JMenuItem comment = new JMenuItem("Comment");

	add(insert);
	add(link);
	addSeparator();
	add(formula);
	add(table);
	addSeparator();
	add(comment);

	/**
	 * Implementacija ActionListener - a za svaku pojedinacnu opciju.
	 */

	insert.addActionListener(new UnderConstrustion());
	link.addActionListener(new UnderConstrustion());
	formula.addActionListener(new UnderConstrustion());
	table.addActionListener(new UnderConstrustion());
	comment.addActionListener(new UnderConstrustion());
    }
}
