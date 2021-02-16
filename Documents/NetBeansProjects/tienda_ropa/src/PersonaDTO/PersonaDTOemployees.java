
package PersonaDTO;

public class PersonaDTOemployees {
    
    private static String parametro;
    private static int ID_nit;
    private static String tipo_documento;
    private static int documento;
    private static String nombres="";
    private static String apellidos="";
    private static String direccion;
    private static int telefono;

    public PersonaDTOemployees() {}
    
    public PersonaDTOemployees(String parametro) {this.parametro=parametro;}

    public String getParametro() {return parametro;}

    public void setParametro(String parametro) {this.parametro = parametro;}

    public int getID_nit() {return ID_nit;}

    public void setID_nit(int ID_nit) {this.ID_nit = ID_nit;}

    public String getTipo_documento() {return tipo_documento;}

    public void setTipo_documento(String tipo_documento) {this.tipo_documento = tipo_documento;}

    public int getDocumento() {return documento;}

    public void setDocumento(int documento) {this.documento = documento;}

    public String getNombres() {return nombres;}

    public void setNombres(String nombres) {this.nombres = nombres;}

    public String getApellidos() {return apellidos;}

    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {this.direccion = direccion;}

    public int getTelefono() {return telefono;}

    public void setTelefono(int telefono) {this.telefono = telefono;}

    


    
    
}
