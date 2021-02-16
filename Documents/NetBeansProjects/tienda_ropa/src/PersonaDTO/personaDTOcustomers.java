
package PersonaDTO;

public class personaDTOcustomers {
   private static String parametro; 
   private static int ID_nit;
   private static String tipo_documento;
   private static int cedula;
   private static String nombres="";
   private static String apellidos="";
   private static String direccion="";
   private static String ciudad;
   private static int telefono;
   private static int celular;
   private static String genero;
   private static String observacion;

    public personaDTOcustomers() {}

    public String getParametro() {return parametro;}

    public void setParametro(String parametro) {this.parametro = parametro;}

    public int getID_nit() {return ID_nit;}

    public void setID_nit(int ID_nit) {this.ID_nit = ID_nit;}

    public String getTipo_documento() {return tipo_documento;}

    public void setTipo_documento(String tipo_documento) {this.tipo_documento = tipo_documento;}

    public int getCedula() {return cedula;}

    public void setCedula(int cedula) {this.cedula = cedula;}

    public String getNombres() {return nombres;}

    public void setNombres(String nombres) {this.nombres = nombres;}

    public String getApellidos() {return apellidos;}

    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public String getDireccion() {return direccion;}

    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getCiudad() {return ciudad;}

    public void setCiudad(String ciudad) {this.ciudad = ciudad;}

    public int getTelefono() {return telefono;}

    public void setTelefono(int telefono) {this.telefono = telefono;}

    public int getCelular() {return celular;}

    public void setCelular(int celular) {this.celular = celular;}

    public String getGenero() {return genero;}

    public void setGenero(String genero) {this.genero = genero;}

    public String getObservacion() {return observacion;}

    public void setObservacion(String observacion) {this.observacion = observacion;}
    
}
