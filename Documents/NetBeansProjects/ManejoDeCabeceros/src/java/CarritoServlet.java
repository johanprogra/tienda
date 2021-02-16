
import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(urlPatterns = {"/CarritoServlet"})
public class CarritoServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String articuloNuevo=request.getParameter("articulo");
            HttpSession sesion=request.getSession();
            List<String> articulos=(List<String>)sesion.getAttribute("articulos");
            if (articulos==null) {
                articulos=new ArrayList<>();
                sesion.setAttribute("articulos", articulos);
            }
            //funcion trim quitar espacios de derecha o izquierda
            if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
                articulos.add(articuloNuevo);
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Lista de Art&iacute;culo</h1>");
            for (String articulo:articulos) {
                out.println("<LI>"+articulo+"</LI>"); 
            }
            out.println("<br>");
            out.println("<a href='/ManejoDeCabeceros'>Regresar</a>");
            out.println("</body>"); 
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
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
