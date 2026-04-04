import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Verbindung zu einer relationalen MySQL-Datenbank aufbauen und Daten abfragen

        // JDBC-URL: Format -> jdbc:mysql://[host]:[datenbank]
        String url = "jdbc:mysql://localhost:3306/beispiel_db";
        String user = "root"; // Benutzername
        String password = "passwort"; // passwort

        // try-with-ressources sorgt dafür, dass Connection automatisch geschlossen wird
        try(Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Verbindung erfolgreich");

            //SQL-Abfrage vorbereiten
            String sql = "select * from kunden";

            //Statement erzeugen und Abfrage ausführen
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // ResultSet zeilenweise auslesen
            while(rs.next()) {
                int id = rs.getInt("id");
                String name  = rs.getString("name");
                String stadt = rs.getString("stadt");
                System.out.println(id + " " + name + " " + stadt);
            }
        } catch (SQLException e) {
            // Fehlerbehandlung bei DB-Verbindungsfehlern
           e.printStackTrace();
        }

    }
}
