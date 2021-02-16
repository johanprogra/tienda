<%@page import="java.sql.*"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Fomulario JSP</title>
    </head>
    <body>
        <h1 align="center">Bienvenido Estudiante</h1>
        <br>
        <%
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
        String id=request.getParameter("id");
       
        if(id!=null){

        Statement st = con.createStatement(); 
        try{
                   st.executeUpdate("DELETE from `estudiantes` WHERE `id_estudiantes`='"+id+"'");
                   request.getRequestDispatcher("index.jsp").forward(request,response);
                }catch(SQLException e){
        %>
        <div class="row">
            <div class="col-sm">
                <br>
                <div class="alert alert-primary" role="alert" class="text-center">
                    <%out.println("Error!!! no se podido borrar datos "+e); 
                    }
                    }%>
                </div>
            </div>
        </div>
    </body>
</html>