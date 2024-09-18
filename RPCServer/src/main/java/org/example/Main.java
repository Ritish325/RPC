package org.example;

import org.example.service.SimpleMethod;
import org.example.service.impl.SimpleMethodImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            SimpleMethod method = new SimpleMethodImpl();
            Naming.rebind("rmi://localhost:1099/CalculatorService", method);
            System.out.println("CalculatorService started...");
        } catch (RemoteException | MalformedURLException e){
            System.out.println(e.getMessage());
        }
    }
}