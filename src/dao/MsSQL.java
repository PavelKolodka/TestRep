package dao;

import java.sql.Connection;

public class MsSQL {

    Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
