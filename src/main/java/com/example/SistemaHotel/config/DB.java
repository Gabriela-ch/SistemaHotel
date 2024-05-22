package com.example.SistemaHotel.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

  private static final String URL = "ulr_do_banco";

  private static final String USER = "user";

  private static final String PASSWORD = "pass";

  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
  }

  public static void createTables() {

    try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
      String sql = """
          CREATE TABLE IF NOT EXISTS Livro (
            id INT AUTO_INCREMENT PRIMARY KEY,
            titulo VARCHAR(255) NOT NULL,
            autor VARCHAR(255) NOT NULL,
            status VARCHAR(255)
          )""";

      stmt.executeUpdate(sql);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
