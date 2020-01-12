package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

/**
 * Ovo je kalasa odgovar na poziv ocije {@link Exit}, ona implementira
 * {@link ActionListener} koji obezbjedjuje sinhronizaciju izmedju same opcije i
 * pogleda.
 * 
 * @author Srdjan Ruljic
 * 
 */

public class ExitActionListener implements ActionListener, WindowListener
{
    /**
     * Ova procedura obezbedjuje bezbijedno zatvaranje aplikace. Korisniku se
     * ponudi da sacuva izmjene pa se tek posle toga aplikacije bezbijedno
     * zatvori. O svemu ovome se korisnik obavjestava putem prozora za dijalog.
     * Procedura se korisi pri bijo kojem nacinu izlaska iz aplikacije
     * 
     */

    private void close()
    {
	Object[] opt = { "Da", "Ne" };

	int save = JOptionPane.showOptionDialog(null,
		"Da li zelite sacuvati izmjene?", "Upozorenje", 0, 3, null,
		opt, opt[0]);

	if (save == 0 || save == 1)
	{
	    int exit = JOptionPane.showOptionDialog(null,
		    "Da li ste sigurni da zelite zatvoriti aplikaciju?",
		    "Upozorenje", 0, 3, null, opt, opt[0]);

	    if (exit == 0)
	    {
		System.exit(exit);
	    }
	}
    }

    public void actionPerformed(ActionEvent e)
    {
	close();
    }

    public void windowOpened(WindowEvent e)
    {

	// TODO Auto-generated method stub

    }

    public void windowClosing(WindowEvent e)
    {
	close();

    }

    public void windowClosed(WindowEvent e)
    {
	// TODO Auto-generated method stub

    }

    public void windowIconified(WindowEvent e)
    {
	// TODO Auto-generated method stub

    }

    public void windowDeiconified(WindowEvent e)
    {
	// TODO Auto-generated method stub

    }

    public void windowActivated(WindowEvent e)
    {
	// TODO Auto-generated method stub

    }

    public void windowDeactivated(WindowEvent e)
    {
	// TODO Auto-generated method stub

    }

}
