
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(urlPatterns = {"/cookiesServlet"})
public class cookiesServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
                 //Suponemos que el usuario estÃ¡ visitando por primera vez nuestro sitio
        boolean nuevoUsuario = true;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente")
                        && c.getValue().equals("si")) {
                    nuevoUsuario = false;
                    break;
                }
            }
        String mensaje = null;
        if (nuevoUsuario) {
            //En caso de ser un usuario nuevo creamos el objeto Cookie
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            //Agregamos la cookie en la respuesta
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio";
        } else {
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
        }

        //Escribimos la salida
        response.setContentType("text/html");
        //Omitimos cÃ³digo HTML para simplificar el cÃ³digo
        out.println("Mensaje:" + mensaje);
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
