package org.example;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        IRepository<Clients> clientsList = new ClientRep();
        IRepository<Masters> mastersList = new MasterRep();
        List<Masters> masters = mastersList.getAll();
        List<Clients> clients = clientsList.getAll();
        

        for(Clients cl: clients){
            FunctionsBD.ClientsOut(cl);
        }
        for(Masters ma: masters){
            FunctionsBD.MastersOut(ma);
        }

    }

}
