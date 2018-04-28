package database;

import java.sql.*;
import java.lang.Class;
public class HerokuConnectionDB {
    private Connection  connectionToHeroku;

    public HerokuConnectionDB() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        this.connectionToHeroku = DriverManager.getConnection("jdbc:postgres://nyiubpwldmpgja:e0271e05b8eb82d19ffcf626debbe77b13112ab5b540fd339bd3ea1d256493d1@ec2-54-83-58-222.compute-1.amazonaws.com:5432/d23uibh9e5cq1u",
                "nyiubpwldmpgja","e0271e05b8eb82d19ffcf626debbe77b13112ab5b540fd339bd3ea1d256493d1");
    }

    public Connection getConnectionToHeroku() {
        return connectionToHeroku;
    }
}
