
package personasDTO;


public class personaDTO {

    private int id_estudiantes;
    private String nombres;
    private String apellidos;
    private String materias;
    private int id_profesores1;

    public personaDTO() {}
    
    public personaDTO(int id_estudiantes) {this.id_estudiantes=id_estudiantes;}

    public int getId_estudiantes() {return id_estudiantes;}

    public void setId_estudiantes(int id_estudiantes) {this.id_estudiantes = id_estudiantes;}

    public String getNombres() {return nombres;}

    public void setNombres(String nombres) {this.nombres = nombres;}

    public String getApellidos() {return apellidos;}

    public void setApellidos(String apellidos) { this.apellidos = apellidos;}

    public String getMaterias() {return materias;}

    public void setMaterias(String materias) {this.materias = materias;}

    public int getId_profesores1() {return id_profesores1;}

    public void setId_profesores1(int id_profesores1) {this.id_profesores1 = id_profesores1;}

}