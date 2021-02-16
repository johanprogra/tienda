<%@page import="java.sql.*"%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
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
                }catch(ClassNotFoundException | SQLException e){
                    out.println("no se ha podido establecer una conexion con la base de datos "+e); 
                }
        %>
        <div class="container" mt-5>
            <div class="row">
                <div class="col-sm">
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>  
                                <th scope="col">id_estudiantes</th>
                                <td>
                                 <i class="fas fa-user-plus"></i>
                                </td>
                                <th scope="col">nombres</th>
                                <th scope="col">apellidos</th>
                                <th scope="col">id_materias1</th>
                                <th scope="col">id_profesores1</th>
                            </  tr>  
                        </thead>
                        <tbody>

                            <%
                                    Statement st=con.createStatement();
                                    ResultSet rs=null;
        
                                    try{
                                          rs=st.executeQuery("SELECT * FROM `estudiantes`");
                                          while(rs.next())
                                          {%>
                            <tr>        
                                <th scope="row"><%=rs.getString(1)%></td>
                                <td><%=rs.getString(2)%></td>
                                <td><%=rs.getString(3)%></td>
                                <td><%=rs.getString(4)%></td>
                                <td><%=rs.getString(5)%></td>
                            </tr>
                            <%}
                      }catch (SQLException e) {
                              out.println("error!! no se podido buscar datos "+e);
                      }
                            %> 

                            </div>
                            </div>
                            </div>

                        </tbody>
                    </table>
                    </body>
                    </html>
