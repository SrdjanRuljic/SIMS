package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.DocumentExplorer;
import view.DropDownMenuBar;
import view.EditorTools;
import view.MyCanvas;
import view.Toolbar;
import controller.ExitActionListener;

/**
 * Klasa kojom se uredjuje prikaz glavnog prozora pocev od izbora LookAndFeel- a
 * dodavanja i podesavanja izgleda svih elemenata glavnog prozora. Klasa
 * posjeduje i {@link WindowListener} koji kontrolise zatvaranje aplikacije.
 * 
 *  
 * @author Srdjan Ruljic
 * 
 */

public class MainFrame extends JFrame
{
    private static final long serialVersionUID = 1L;
    public static DropDownMenuBar menuBar;
    public static Toolbar mToolbar;
    public static view.StatusBar statusBar;
    public static EditorTools editorTools;
    public static DocumentExplorer documentExplorer;
    public static MyCanvas mCanvas;

    public MainFrame() throws InstantiationException, IllegalAccessException,
	    ClassNotFoundException, UnsupportedLookAndFeelException
    {
	initCoponent();
	UIManager
		.setLookAndFeel((LookAndFeel) Class.forName(
			UIManager.getCrossPlatformLookAndFeelClassName())
			.newInstance());
    }

    public void initCoponent()
    {
	this.menuBar = new DropDownMenuBar();
	setLayout(new BorderLayout());
	JPanel top = new JPanel();
	top.setLayout(new GridLayout(2, 1));
	top.add(menuBar);

	this.mToolbar = new Toolbar();
	mToolbar.setFloatable(false);
	top.add(mToolbar);
	add(top, "North");

	this.editorTools = new EditorTools();
	add(this.editorTools, "East");

	this.documentExplorer = new DocumentExplorer();
	add(this.documentExplorer, "West");

	this.mCanvas = new MyCanvas();
	mCanvas.setBackground(Color.WHITE);
	add(this.mCanvas, "Center");

	this.statusBar = new view.StatusBar();
	add(this.statusBar, "South");

	WindowListener exitListener = new ExitActionListener();
	addWindowListener(exitListener);
    }
}
