/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author tme5209
 */
public class TemperatureModel extends java.util.Observable
{	public double getF(){return temperatureF;}
	
	public double getC(){return (temperatureF - 32.0) * 5.0 / 9.0;}
	
	public void setF(double tempF)
	{	temperatureF = tempF;
		setChanged();
		notifyObservers();
	}
	
	public void setC(double tempC)
	{	temperatureF = tempC*9.0/5.0 + 32.0;
		setChanged();
		notifyObservers();
	}

	private double temperatureF = 32.0;
}
