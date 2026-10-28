package com.m486.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracioConnexioBDMysql {

    private Connection con = null;
    private String cadenaConnexio;
    private String usuari;
    private String pswd;

    public ConfiguracioConnexioBDMysql(){
        this.cadenaConnexio = "jdbc:mysql://localhost:3306/";
        this.usuari = "root";
        this.pswd = "";
    }

    public ConfiguracioConnexioBDMysql(String cadena, String usuari, String pswd){
        this.cadenaConnexio = cadena;
        this.usuari = usuari;
        this.pswd = pswd;
    }

    public Connection getConnection() throws SQLException {
        this.con = DriverManager.getConnection(this.cadenaConnexio,this.usuari,this.pswd);
        System.out.println("Connexio: "+this.con.isClosed());
        return con;
    }
}
