/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author disponible
 */
public interface transac_auto extends Remote{
 public String mensaje(String prmValor) throws RemoteException;
}
