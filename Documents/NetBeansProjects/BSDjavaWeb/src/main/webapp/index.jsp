<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
            HttpSession sesion=request.getSession();
            
            if(sesion.getAttribute("logueado")==null || sesion.getAttribute("logueado").equals("0")){
            response.sendRedirect("login.jsp");
            }
        %>
        <title>Fomulario JSP</title>
    </head>
    <body>
        <div class="container mt-5" >
            <nav class="navbar navbar-light bg-light">
                    <a class="navbar-brand"><h3>Bienvenido Estudiante</h3></a>
                    <form class="d-flex" action="logout.jsp">
                        <a href="datosUsuario.jsp"><i class="fa fa-user-circle-o" aria-hidden="true"></i><%=session.getAttribute("user")%></a>
                        <button class="btn btn-outline-danger my-2 my-sm-0 ml-2" type="submit">Log out</button>
                    </form>
            </nav>
            <div class="row mt-2">
                <div class="col-sm">
                    <form action="editar.jsp" method="get">
                        <table class="table table-striped table-hover">
                            <thead>
                                <tr>
                                    <th scope="col" colspan="4" class="text-center"></th>
                                    <th>
                                    </th>
                                </tr>
                                <tr>  
                                    <th scope="col">id_estudiantes</th>
                                    <th scope="col">nombres</th>
                                    <th scope="col">apellidos</th>
                                    <th scope="col">materia</th>
                                    <th scope="col">id profesores</th>
                                    <th scope="col">acciones</th>
                                    </  tr>  
                            </thead>
                            <tbody>
                            <jsp:include page="estudiantes"/> 
                            </tbody>
                        </table>  
                    </form>
                </div>
            </div>
        </div> 
    </body>
</html>
