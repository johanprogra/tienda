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
        %>
        <div class="container" mt-5>
            <div class="row">
                <div class="col-sm">
                    <form>
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Ingrese el nombre</label>
                            <input type="text" class="form-control" id="nombre" name="nombre" required="required">
                            <div id="emailHelp" class="form-text">Ingresar nombre ejemplo juanito perez</div>
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label">Ingrese la materia</label>
                            <input type="text" class="form-control" id="materia" name="materia" required="required">
                            <div id="emailHelp" class="form-text">Ingresar materia ejemplo fisica</div>
                        </div>
                        <a href="index.jsp" class="btn btn-danger">cancelar <i class="fa fa-ban" aria-hidden="true"></i></a>
<button type="submit" class="btn btn-primary" id="enviar" name="enviar" >Guardar <i class="fa fa-floppy-o" aria-hidden="true"></i></button>
                    </form>
                </div>
            </div>
        </div>
        <%
        if(request.getParameter("enviar")!=null){

        String snombre=request.getParameter("nombre");
        String cnombre[] = snombre.split(" ");
        String nombre = cnombre[0];

        String sapellido=request.getParameter("nombre");
        String capellido[] = sapellido.split(" ");
        String apellido = capellido[1];

        String materia=request.getParameter("materia");
        
        Statement st = con.createStatement(); 
        try{
                   st.executeUpdate("INSERT INTO estudiantes (nombres, apellidos, materias,id_profesores1) VALUES ('"+nombre+"','"+apellido+"','"+materia+"','1')");
                   request.getRequestDispatcher("index.jsp").forward(request,response);
                }catch(SQLException e){
        %>
        <div class="row">
            <div class="col-sm">
                <br>
                <div class="alert alert-primary" role="alert" class="text-center">
                    <%out.println("Error!!! no se podido ingresar datos "+e); 
                    }
                    }%>
                </div>
            </div>
        </div>
    </body>
</html>
