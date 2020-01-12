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

public class ViewDropDropdownMenu extends JMenu
{
    private static final long serialVersionUID = 1L;

    public ViewDropDropdownMenu()
    {
	super("View");
	setMnemonic('V');
	JMenuItem showRuler = new JMenuItem("Show ruler");
	JMenuItem toolbar = new JMenuItem("Toolbar");
	JMenuItem zoom = new JMenuItem("Zoom +/-");

	add(showRuler);
	add(toolbar);
	add(zoom);

	/**
	 * Implementacija ActionListener - a za svaku pojedinacnu opciju.
	 */

	showRuler.addActionListener(new UnderConstrustion());
	toolbar.addActionListener(new UnderConstrustion());
	zoom.addActionListener(new UnderConstrustion());
    }
}
