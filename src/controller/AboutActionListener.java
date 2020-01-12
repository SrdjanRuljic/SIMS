package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * Ovo je kalasa odgovar na poziv ocije {@link About}, ona implementira
 * {@link ActionListener} koji obezbjedjuje sinhronizaciju izmedju same opcije i
 * pogleda.
 * 
 * @author Srdjan Ruljic
 * 
 */

public class AboutActionListener implements ActionListener
{
    /**
     * Akcija koja se dogadja pozivom opcije {@link About}. Osigurava prikaz
     * poruke koja sadrzi neke detalje o aplikaciji.
     */

    public void actionPerformed(ActionEvent arg0)
    {
	JOptionPane
		.showMessageDialog(
			null,
			"Editor\nSIMS, JUN 2015.\nProfesor: Branko Perisic\nVisi Asistent: Vladimir Vujovic\nStudenti: Srdjan Ruljic",
			"Iformacie", JOptionPane.INFORMATION_MESSAGE);

    }

}
