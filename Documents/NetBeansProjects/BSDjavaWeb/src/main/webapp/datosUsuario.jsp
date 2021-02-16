<%@page import="Utils.Encriptar"%> 
<%@page import="java.sql.*"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  
            Encriptar enc=new Encriptar();
            HttpSession sesion=request.getSession();
            if(sesion.getAttribute("logueado")==null || sesion.getAttribute("logueado").equals("0")){
            response.sendRedirect("login.jsp");
            }
            String driver="com.mysql.jdbc.Driver";
            String cadenaConeccion="jdbc:mysql://localhost/colegio";
            String usuario="root";
            String contraseña="";
            Connection con=null;

        
                try{
                   Class.forName(driver);
                    con=DriverManager.getConnection(cadenaConeccion,usuario,contraseña);
                }catch(SQLException e){
                    out.println("Error!!! no se ha podido establecer una conexion con la base de datos "+e); 
                }
        %>
        <h1 align="center">Ingresar Usuario</h1>
        <br>
        <div class="container" mt-5>
            <div class="row">
                <div class="col-sm">
                    <form action="datosUsuario.jsp" method="post">
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label">Usuario</label>
                            <input type="text" class="form-control" name="user" id="user" placeholder="Usuario" required="required">
                        </div>
                            <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Contraseña</label>
                            <input type="text" class="form-control" name="password" id="password" placeholder="Contraseña"  required="required">
                        </div>
                            <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label">Repita contraseña</label>
                            <input type="text" class="form-control" name="repetir" id="repetir" placeholder="Repita la Contraseña" required="required">
                        </div>
                        <br>
                        <a href="index.jsp" class="btn btn-danger">cancelar <i class="fa fa-ban" aria-hidden="true"></i></a>
                        <button type="submit" class="btn btn-primary" id="enviar" name="enviar" >Guardar <i class="fa fa-floppy-o" aria-hidden="true"></i></button>
                    </form>
                </div>
            </div>
        </div>
         <%
        if(request.getParameter("enviar")!=null){

        String user=request.getParameter("user");

        String password=request.getParameter("password");

        String repetir=request.getParameter("repetir");
        
        if(password.equals(repetir)){
        Statement st = con.createStatement(); 
        try{
                   st.executeUpdate("UPDATE `login` SET `user`='"+user+"',`password`='"+enc.getmD5(password)+"' WHERE id='"+sesion.getAttribute("id")+"'");
                   session.setAttribute("user",user);
                   response.sendRedirect("index.jsp");
                }catch(SQLException e){
                out.print("Error!! no se ingresaron datos: "+e);
         }}else{%>
         <div class="alert alert-primary" role="alert" class="text-center">
                <%out.print("Las contraseñas no coinciden");%>
         </div>
         <%}}
        %>
    </body>
</html>
