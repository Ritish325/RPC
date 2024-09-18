package org.example.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SimpleMethod extends Remote {
    int add(int x, int y) throws RemoteException;
}
