package clinica;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BD {

    final String ConnectionURL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=Clinica;integratedSecurity=true;";
    String User = "";
    String Password = "";
    Statement stmt = null;
    ResultSet rs = null;
    ResultSet rs1 = null;
    PreparedStatement _includePac = null;
    PreparedStatement _includeMed = null;
    PreparedStatement _consultaPaciente = null;
    PreparedStatement _consultaMedico = null;
    Connection con = null;

    void incluirMedico(String NomeMedico, String EspecialidadeMedico, int Crm) {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection(ConnectionURL, User, Password);

            _includeMed = con.prepareStatement("insert into Medicos(CRM,NomeMed,EspecialidadeMed) values (?,?,?)");
            _includeMed.setInt(1, Crm);
            _includeMed.setString(2, NomeMedico);
            _includeMed.setString(3, EspecialidadeMedico);
            _includeMed.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    void incluirPaciente(String NomePaciente, String RGPaciente, String CPFPaciente, String EnderecoPaciente,
            String FonePaciente, String NascPaciente) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection(ConnectionURL, User, Password);

            _includePac = con.prepareStatement("insert into Pacientes(NomePac,"
                    + "RG,CPF,EnderecoPac,TelefonePac,NascPac) values (?,?,?,?,?,?)");
            _includePac.setString(1, NomePaciente);
            _includePac.setString(2, RGPaciente);
            _includePac.setString(3, CPFPaciente);
            _includePac.setString(4, EnderecoPaciente);
            _includePac.setString(5, FonePaciente);
            _includePac.setString(6, NascPaciente);
            _includePac.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    void buscaPaciente(String CPFPaciente) {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection(ConnectionURL, User, Password);
            String SQLconsultaPaciente = "Select * from Pacientes where CPF = ? ";

            _consultaPaciente = con.prepareStatement(SQLconsultaPaciente);
            _consultaPaciente.setString(1, CPFPaciente);
            rs1 = _consultaPaciente.executeQuery();
            ResultSetMetaData column = rs1.getMetaData();
            int numberColumn = column.getColumnCount();
            JFrame frame = new JFrame("Tela");

            while (rs1.next()) {
                for (int i = 1; i <= numberColumn; i++) {
                    JOptionPane.showMessageDialog(frame, "Informação do Paciente " + rs1.getObject(i));
                }

            }

        } catch (SQLException | ClassNotFoundException e) {
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                }
            }
        }
    }

    void buscaMedico(int Crm) {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            con = DriverManager.getConnection(ConnectionURL, User, Password);
            String SQLconsultaMedico = "Select * from Medicos where CRM = ?";
            _consultaMedico = con.prepareStatement(SQLconsultaMedico);
            _consultaMedico.setInt(1, Crm);
            rs = _consultaMedico.executeQuery();
            ResultSetMetaData column = rs.getMetaData();
            int numberColumn = column.getColumnCount();
            JFrame frame = new JFrame("Tela");
            while (rs.next()) {
                for (int i = 1; i <= numberColumn; i++) {
                    JOptionPane.showMessageDialog(frame, "Informações do Paciente: " + rs.getObject(i));
                }
            }

        } catch (SQLException | ClassNotFoundException e) {
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                }
            }
        }
    }
}
