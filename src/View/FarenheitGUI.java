/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.TemperatureModel;
import java.awt.event.*;
import java.util.Observable;

/**
 *
 * @author tme5209
 */
public class FarenheitGUI extends TemperatureGUI
{	public FarenheitGUI(TemperatureModel model, int h, int v)
	{	super("Farenheit Temperature", model, h, v);
		setDisplay(""+model.getF());
		addUpListener(new UpListener());
		addDownListener(new DownListener());
		addDisplayListener(new DisplayListener());
	}
	
	public void update(Observable t, Object o) // Called from the Model
	{	setDisplay("" + model().getF());
	}
	
	class UpListener implements ActionListener
	{	public void actionPerformed(ActionEvent e)
		{	model().setF(model().getF() + 1.0);
		}
	}
	
	class DownListener implements ActionListener
	{	public void actionPerformed(ActionEvent e)
		{	model().setF(model().getF() - 1.0);
		}
	}
	
	class DisplayListener implements ActionListener
	{	public void actionPerformed(ActionEvent e)
		{	double value = getDisplay();
			model().setF(value);
		}
	}
}
