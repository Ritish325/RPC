package org.example.service.impl;

import org.example.service.SimpleMethod;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SimpleMethodImpl extends UnicastRemoteObject implements SimpleMethod {
    public SimpleMethodImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int x, int y) throws RemoteException {
        return x+y;
    }
}
