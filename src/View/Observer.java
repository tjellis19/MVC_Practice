/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Observable;

/**
 *
 * @author tme5209
 */
public interface Observer
{	
    void update(Observable t, Object o);	
}