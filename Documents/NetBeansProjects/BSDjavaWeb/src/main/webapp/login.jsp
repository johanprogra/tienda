<%@page import="Utils.Encriptar"%> 
<%@page import="java.sql.*"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Fomulario JSP</title>
    </head>
    <body>
        <h1 align="center">Bienvenido Estudiante</h1>
        <br>
        <%
            Encriptar enc=new Encriptar();
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
                    <form action="login.jsp" method="post">
                        <div><i class="fa fa-users" aria-hidden="true"></i></div>
                        <div class="mb-3">
                            <label for="exampleInputPassword1" class="form-label">Usuario</label>
                            <input type="username" class="form-control" placeholder="ejemplo juan15/*05" id="user" name="user" required="required">
                            <div id="emailHelp" class="form-text">Ingreser usuario ejemplo juan...</div>
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputEmail1" class="form-label">Contraseña</label>
                            <input type="password" class="form-control" placeholder="ejemplo 1651191" id="password" name="password" required="required">
                            <div id="emailHelp" class="form-text">Ingresar contraseña ejemplo 12@852</div>
                        </div>
                        <button type="submit" class="btn btn-primary" id="enviar" name="enviar" >Ingresar <i class="fa fa-sign-in" aria-hidden="true"></i></i></button>
                    </form>
                </div>
            </div>
        </div>
        <%
        
        
        if(request.getParameter("enviar")!=null){
        Statement st = con.createStatement(); 
        ResultSet rs=null;

        String user=request.getParameter("user");
        String password=request.getParameter("password");
        String usuario1="";
        String contraseña1="";

        HttpSession sesion=request.getSession();
        
        try{
                   rs=st.executeQuery("SELECT * FROM `login` WHERE `user` LIKE '"+user+"' and '"+enc.getmD5(password)+"'");
                   while(rs.next()){
                    session.setAttribute("logueado","1");
                    session.setAttribute("user",rs.getString("user"));
                    session.setAttribute("id",rs.getString("id"));
                    response.sendRedirect("index.jsp");
                    }
                    
                   %>
        <div class="row">
            <div class="col-sm">
                <br>
                <div class="alert alert-danger" role="alert" class="text-center">
                    <%out.println("El usuario o La contraseña estan incorrectos");%> 
                </div>
            </div>
        </div>
        <%
        }catch(SQLException e){
        out.println("Error!!! "+e);
        }} 
                    
        %>

    </body>
</html>
