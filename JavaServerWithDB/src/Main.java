import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // URL de conexão com o banco de dados
            String url = "jdbc:mysql://localhost:3306/java_db";

            // Credenciais de acesso ao banco de dados
            String username = "root";
            String password = "admin1234";

            // Estabelece a conexão com o banco de dados
            conn = DriverManager.getConnection(url, username, password);

            // Verifica se a conexão foi bem-sucedida
            if (conn != null) {
                System.out.println("Conexão bem-sucedida!");
            } else {
                System.out.println("Falha ao conectar ao banco de dados.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado.");
        } finally {
            // Fecha a conexão com o banco de dados
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("Erro ao fechar a conexão: " + e.getMessage());
                }
            }
        }
    }
}
