package com.goutham.Creational.ObjectPool.ex1;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/sakila",
                "root", "Sarvesham@198");

        // Get a connection:
        Connection con = pool.takeObject();

        // Return the connection:
        pool.returnObject(con);

        Connection con1 = pool.takeObject();

        JDBCConnectionPool pool1 = new JDBCConnectionPool(
                "com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost:3306/world",
                "root", "Sarvesham@198");
        Connection con2 = pool1.takeObject();
    }
}
