package view;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import controller.UnderConstrustion;

/**
 * Klasa koja inicijalizuje alatke Editora, prosirena je sa {@link JToolBar}
 * kojim se uredjuje izgled i raspored pojedinih alatki. Takodje ovdje
 * suukljucene i specijalno dizajnirane ikonice za svako dugme tj. alatku.
 * 
 * @author Srdjan Ruljic
 * 
 */

public class EditorTools extends JToolBar
{
    private static final long serialVersionUID = 1L;

    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11,
	    btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20;

    public EditorTools()
    {
	btn1 = new JButton(new ImageIcon("ico/imagesforeditor/2440.png"));
	btn2 = new JButton(new ImageIcon("ico/imagesforeditor/boat17.png"));

	btn3 = new JButton(new ImageIcon("ico/imagesforeditor/black330.png"));
	btn4 = new JButton(new ImageIcon("ico/imagesforeditor/air6.png"));

	btn5 = new JButton(new ImageIcon("ico/imagesforeditor/clipboard52.png"));
	btn6 = new JButton(new ImageIcon("ico/imagesforeditor/barscode.png"));

	btn7 = new JButton(new ImageIcon("ico/imagesforeditor/airplane67.png"));
	btn8 = new JButton(new ImageIcon(
		"ico/imagesforeditor/chronometer10.png"));

	btn9 = new JButton(new ImageIcon("ico/imagesforeditor/call37.png"));
	btn10 = new JButton(new ImageIcon("ico/imagesforeditor/container5.png"));

	btn11 = new JButton(new ImageIcon("ico/imagesforeditor/fragile.png"));
	btn12 = new JButton(new ImageIcon("ico/imagesforeditor/delivery17.png"));

	btn13 = new JButton(new ImageIcon(
		"ico/imagesforeditor/identification4.png"));
	btn14 = new JButton(new ImageIcon("ico/imagesforeditor/locked14.png"));

	btn15 = new JButton(new ImageIcon("ico/imagesforeditor/logistics.png"));
	btn16 = new JButton(new ImageIcon("ico/imagesforeditor/sea8.png"));

	btn17 = new JButton(new ImageIcon("ico/imagesforeditor/storage17.png"));
	btn18 = new JButton(new ImageIcon("ico/imagesforeditor/up72.png"));

	btn19 = new JButton(new ImageIcon("ico/imagesforeditor/woman93.png"));
	btn20 = new JButton(new ImageIcon("ico/imagesforeditor/train20.png"));

	add(btn1);
	add(btn2);

	add(btn3);
	add(btn4);

	add(btn5);
	add(btn6);

	add(btn7);
	add(btn8);

	add(btn9);
	add(btn10);

	add(btn11);
	add(btn12);

	add(btn13);
	add(btn14);

	add(btn15);
	add(btn16);

	add(btn17);
	add(btn18);

	add(btn19);
	add(btn20);

	setLayout(new GridLayout(10, 2));

	/**
	 * Implementacija ActionListener - a za svaku pojedinacnu opciju.
	 */

	btn1.addActionListener(new UnderConstrustion());
	btn2.addActionListener(new UnderConstrustion());
	btn3.addActionListener(new UnderConstrustion());
	btn4.addActionListener(new UnderConstrustion());
	btn5.addActionListener(new UnderConstrustion());
	btn6.addActionListener(new UnderConstrustion());
	btn7.addActionListener(new UnderConstrustion());
	btn8.addActionListener(new UnderConstrustion());
	btn9.addActionListener(new UnderConstrustion());
	btn10.addActionListener(new UnderConstrustion());
	btn12.addActionListener(new UnderConstrustion());
	btn13.addActionListener(new UnderConstrustion());
	btn14.addActionListener(new UnderConstrustion());
	btn15.addActionListener(new UnderConstrustion());
	btn16.addActionListener(new UnderConstrustion());
	btn17.addActionListener(new UnderConstrustion());
	btn18.addActionListener(new UnderConstrustion());
	btn19.addActionListener(new UnderConstrustion());
	btn20.addActionListener(new UnderConstrustion());
    }
}
