<%-- 
    Document   : index
    Created on : 21/01/2021, 09:45:41 AM
    Author     : jl-im
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container" mt-5>
            <div class="row">
                <div class="col-sm">
                    <form action="index.jsp" method="post">
                        <div class="mb-3">
                            <label>Escribe Tu nombre</label>
                            <input type="username" class="form-control" name="nombre" aria-describedby="nombre">
                        </div>
                        <br>
                        <div class="mb-3">
                            <label>Escribe Tu edad</label>
                            <input type="number" class="form-control" name="edad" aria-describedby="nombre">
                        </div>
                        <button type="submit" class="btn btn-primary">Enviar</button>
                    </form>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm">
                <div class="alert alert-primary" role="alert">
                    <%
                        String nombre=request.getParameter("nombre");
                        String edad=request.getParameter("edad");
                        if(nombre!=null && edad!=null){
                        String saludar="hola "+nombre+" a tus "+edad+" años";
                        out.println(saludar);
                        }else{
                        out.println("Por favor llena el formulario");
                        }  
                    %>

                </div>
            </div>
        </div>
    </body>
</html>
