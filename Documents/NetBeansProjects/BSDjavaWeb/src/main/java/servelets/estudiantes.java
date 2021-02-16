package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class estudiantes extends HttpServlet {
            ResultSet rs = null;
            Connection con = null;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String driver = "com.mysql.jdbc.Driver";
            String cadenaConeccion = "jdbc:mysql://localhost/colegio";
            String usuario = "root";
            String contraseña = "";
            
            try {
                Class.forName(driver);
                con = DriverManager.getConnection(cadenaConeccion, usuario, contraseña);
            } catch (ClassNotFoundException | SQLException e) {
                out.println("no se ha podido establecer una conexion con la base de datos " + e);
            }

            try {
                Statement st = con.createStatement();
                rs = st.executeQuery("SELECT * FROM `estudiantes`");
                while (rs.next()) {
                    out.print("<tr>"
                            + "<td>" + rs.getString(2) + "</td>"
                            + "<td>" + rs.getString(3) + "</td>"
                            + "<td>" + rs.getString(4) + "</td>"
                            + "<td>" + rs.getString(5) + "</td>"
                            + "<td><a href=\"crear.jsp\"><i class=\"fa fa-user-plus\" aria-hidden=\"true\"></i></a>"
                            + "<a href=\"editar.jsp?id=" + rs.getString(1) + "&nombres=" + rs.getString(2) + "&apellidos=" + rs.getString(3) + "&materias=" + rs.getString(4) + "&id_profesores1=" + rs.getString(5) + ">"
                            + "<i class=\"fa fa-pencil\" aria-hidden=\"true\"></i></a> "
                            + "<a href=\"borrar.jsp?id=" + rs.getString(1) + ">"
                            + "<i class=\"fa fa-trash\" aria-hidden=\"true\"></i></a>"
                            + "</td>"
                    );
                }
            } catch (SQLException e) {
                out.println("error!! no se ha podido buscar datos " + e);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
