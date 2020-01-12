package view;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Klasa koja implementira statusnu liniju.
 * 
 * @author Srdjn Ruljic
 *
 */

public class StatusBar extends JPanel
{
    private static final long serialVersionUID = 1L;

    public StatusBar()
    {
	JLabel info = new JLabel("Ovo je statusna linija, izrada u toku.");
	add(info);
    }
}
