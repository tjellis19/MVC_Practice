/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.TemperatureModel;
import java.util.Observer;
import javax.swing.*;
import java.awt.*;
import java.util.Observable;


/**
 *
 * @author tme5209
 */
public class GraphGUI extends Frame implements Observer
{	public GraphGUI(TemperatureModel model, int h, int v)
	{ 	super("Temperature Gauge");
		this.model = model;
		_farenheit = new TemperatureGauge(-200, 300);
		Panel Top = new Panel();
		add("North", Top);
		gauges = new TemperatureCanvas(_farenheit);
		gauges.setSize(500,280);
		add("Center", gauges);		setSize(280, 280);
		setLocation(h,v);
		setVisible(true);
		model.addObserver(this); // Connect to the model
	}
	
        @Override
	public void update(Observable obs, Object o) // Respond to changes
	{	repaint();
	}
		
	public void paint(Graphics g)
	{	int farenheit = (int)model.getF(); // Use the current data to paint
		_farenheit.set(farenheit);
		gauges.repaint();
		super.paint(g);
	}
	
	private TemperatureModel model;
	private Canvas gauges;
	private TemperatureGauge _farenheit;

}