/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author tme5209
 */
class TemperatureGauge
{	public TemperatureGauge(int min, int max){ Min = min; Max = max; }
	
	public void set(int level) { current = level; }	
	public int get(){return current;}
	public int getMax(){return Max;}
	public int getMin(){return Min;}
	
	private int Max, Min, current;
}