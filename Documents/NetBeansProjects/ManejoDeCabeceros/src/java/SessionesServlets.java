

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = {"/SessionesServlets"})
public class SessionesServlets extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession sesion=request.getSession();
            String titulo=null;
            
            Integer contadorVisitas=(Integer) sesion.getAttribute("ContadorVisitas");
            if (contadorVisitas == null) {
                contadorVisitas = new Integer(1);
                titulo="Bienvenido por primer vez...";
            }else{
                contadorVisitas++;
                titulo="Bienvenido nuevamente...";
            }   
            sesion.setAttribute("ContadorVisitas", contadorVisitas);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>"+titulo+"</title>");
            out.println("<h1>"+titulo+"</h1>");              
            out.println("</head>");
            out.println("<body>");
            out.println("<h3> ContadorVisitas "+contadorVisitas+ "</h3>");
            out.println("<br>");
            out.println("<h3> Sesi&oacute;n: "+sesion.getId()+ "</h3>");
            out.println("</body>");
            out.println("</html>");
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
