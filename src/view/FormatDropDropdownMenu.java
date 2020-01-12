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

public class FormatDropDropdownMenu extends JMenu
{
    private static final long serialVersionUID = 1L;

    public FormatDropDropdownMenu()
    {
	super("Format");
	setMnemonic('F');

	JMenu textEditor = new JMenu("Text editor");
	JMenuItem ltr = new JMenuItem("Left to right");
	JMenuItem rtl = new JMenuItem("Right to left");
	JMenuItem bold = new JMenuItem("Bold");
	JMenuItem italic = new JMenuItem("Italic");
	JMenuItem under = new JMenuItem("Underline");
	JMenuItem blists = new JMenuItem("Bulleted list");

	JMenu imageEditor = new JMenu("Image editor");
	JMenuItem flip = new JMenuItem("Flip");
	JMenuItem rotate = new JMenuItem("Rotate");
	JMenuItem cmanagment = new JMenuItem("Color Managment");

	JMenu audioEditor = new JMenu("Audio editor");
	JMenuItem reverse = new JMenuItem("Reverse");
	JMenuItem fast = new JMenuItem("Fast");
	JMenuItem slow = new JMenuItem("Slow");

	JMenuItem clearFormating = new JMenuItem("Clear Formating");

	textEditor.add(ltr);
	textEditor.add(rtl);
	textEditor.add(bold);
	textEditor.add(italic);
	textEditor.add(under);
	textEditor.add(blists);
	add(textEditor);
	addSeparator();

	imageEditor.add(flip);
	imageEditor.add(rotate);
	imageEditor.add(cmanagment);
	add(imageEditor);
	addSeparator();

	audioEditor.add(reverse);
	audioEditor.add(fast);
	audioEditor.add(slow);
	add(audioEditor);
	addSeparator();

	add(clearFormating);

	/**
	 * Implementacija ActionListener - a za svaku pojedinacnu opciju.
	 */

	clearFormating.addActionListener(new UnderConstrustion());
	ltr.addActionListener(new UnderConstrustion());
	rtl.addActionListener(new UnderConstrustion());
	bold.addActionListener(new UnderConstrustion());
	italic.addActionListener(new UnderConstrustion());
	under.addActionListener(new UnderConstrustion());
	blists.addActionListener(new UnderConstrustion());
	flip.addActionListener(new UnderConstrustion());
	rotate.addActionListener(new UnderConstrustion());
	cmanagment.addActionListener(new UnderConstrustion());
	reverse.addActionListener(new UnderConstrustion());
	fast.addActionListener(new UnderConstrustion());
	slow.addActionListener(new UnderConstrustion());
    }
}
