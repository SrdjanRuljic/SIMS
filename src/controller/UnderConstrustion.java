package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 * Ovo je kalasa odgovar na poziv ocije bilo koje opcije u alikaiji, ona
 * implementira {@link ActionListener} koji obezbjedjuje sinhronizaciju izmedju
 * same opcije i pogleda.
 * 
 * @author Srdjan Ruljic
 * 
 */

public class UnderConstrustion implements ActionListener
{

    /**
     * Akcija u prozoru za dijalog ispisuje poruku da je opcija u izradi.
     * 
     */

    public void actionPerformed(ActionEvent e)
    {
	JOptionPane.showMessageDialog(null, "Izrada utoku.", "Informacija", 1);

    }

}
