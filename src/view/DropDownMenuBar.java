package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 * Ova klasa implementira se padajuce menije. Klasa prosiruje {@link JMenuBar}
 * kojim se uredjuje izgled linije menia.
 * 
 * @author Srdjan Ruljic
 * 
 */

public class DropDownMenuBar extends JMenuBar
{
    private static final long serialVersionUID = 1L;

    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");
    JMenu view = new JMenu("View");
    JMenu insert = new JMenu("Insert");
    JMenu format = new JMenu("Format");
    JMenu help = new JMenu("Help");

    /**
     * U konstruktoru se vrsi mplementacija svih elemenata linije menia.
     */

    public DropDownMenuBar()
    {
	setName("DropDownMenu");

	this.file = new FileDropdownMenu();
	add(this.file);

	this.edit = new EditDropdownMenu();
	add(this.edit);

	this.view = new ViewDropDropdownMenu();
	add(this.view);

	this.insert = new InsertDropDropdownMenu();
	add(this.insert);

	this.format = new FormatDropDropdownMenu();
	add(this.format);

	this.help = new HelpDropdownMenu();
	add(this.help);
    }

}
