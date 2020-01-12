package view;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;

/**
 * Klasa kojom se implementira Canvas, prosirena je sa {@link JTabbedPane} kojim
 * se podesava izgled {@link MyCanvas}.
 * 
 * 
 * @author SRdjan Rulic
 * 
 */

public class MyCanvas extends JTabbedPane
{
    private static final long serialVersionUID = 1L;

    public MyCanvas()
    {
	JLabel first = new JLabel("1");
	JLabel second = new JLabel("2");
	JLabel third = new JLabel("3");

	first.setHorizontalAlignment(0);
	second.setHorizontalAlignment(0);
	third.setHorizontalAlignment(0);

	addTab("Tab 1", first);
	addTab("Tab 2", second);
	addTab("Tab 3", third);
    }
}
