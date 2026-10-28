package com.m486;

import com.m486.config.ConfiguracioConnexioBDMysql;

import java.sql.SQLException;


public class Main
{
    public static void main( String[] args )
    {
        ConfiguracioConnexioBDMysql conBDMysql = new ConfiguracioConnexioBDMysql();
        try{conBDMysql.getConnection();}
        catch(SQLException e){
            System.err.println(e.getMessage());
        }

    }
}
