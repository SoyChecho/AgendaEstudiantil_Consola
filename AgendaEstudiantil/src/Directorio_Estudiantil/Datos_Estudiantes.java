/*
Realizado por Sergio David Castro Rojas - Grupo 8
*/
/*
Aplicación de directorio único para el manejo de
los datos de contacto de los estudiantes del Instituto la Floresta.
*/
package Directorio_Estudiantil;

/**
 *
 * @author Sergio Castro
 */
public class Datos_Estudiantes {
    //Atributos
    protected String nombres;
    protected String apellidos;
    protected String fecha_Nacimiento;
    protected String correo_Institucional;
    protected String correo_Personal;
    protected long telefono_Celular;
    protected long telefono_fijo;
    protected String programa_Academico;
//Constructor
    public Datos_Estudiantes(String nombres, String apellidos, String fecha_Nacimiento, String correo_Institucional, String correo_Personal, long telefono_Celular, long telefono_fijo, String programa_Academico) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.correo_Institucional = correo_Institucional;
        this.correo_Personal = correo_Personal;
        this.telefono_Celular = telefono_Celular;
        this.telefono_fijo = telefono_fijo;
        this.programa_Academico = programa_Academico;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public String getCorreo_Institucional() {
        return correo_Institucional;
    }

    public String getCorreo_Personal() {
        return correo_Personal;
    }

    public long getTelefono_Celular() {
        return telefono_Celular;
    }

    public long getTelefono_fijo() {
        return telefono_fijo;
    }

    public String getPrograma_Academico() {
        return programa_Academico;
    }
    /*
    Metodo que permite mostrar los datos que se han ingresado
    */
    public String mostrarDatos(){
        return("\nNombres: "+nombres+"\nApellidos: "+apellidos+"\nFecha Nacimiento: "+fecha_Nacimiento+
                "\nCorreo institucional: "+correo_Institucional+"\nCorreo personal: "+correo_Personal+
                "\nNúmero de teléfono celular: "+telefono_Celular+"\nNúmero de teléfono fijo: "+telefono_fijo+
                "\nPrograma académico: "+programa_Academico);
    }
    /*
    Metodo que permite buscar un dato a partir de comprarlo con otro dato ingresado y existente
    imprimiendo la lista de datos que lo acompañan acompañan
    */
    public void buscarDatos(String coIns){
        if(coIns.equals(correo_Institucional)){
            System.out.println("\nNombres: "+nombres+"\nApellidos: "+apellidos+"\nFecha Nacimiento: "+fecha_Nacimiento+
                "\nCorreo institucional: "+correo_Institucional+"\nCorreo personal: "+correo_Personal+
                "\nNúmero de teléfono celular: "+telefono_Celular+"\nNúmero de teléfono fijo: "+telefono_fijo+
                "\nPrograma académico: "+programa_Academico);
        }
    }
    
}
