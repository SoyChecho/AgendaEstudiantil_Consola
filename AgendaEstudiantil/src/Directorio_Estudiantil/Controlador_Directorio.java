/*
Realizado por Sergio David Castro Rojas - Grupo 8
*/
/*
Aplicación de directorio único para el manejo de
los datos de contacto de los estudiantes del Instituto la Floresta.
*/
package Directorio_Estudiantil;
import java.util.*;
/**
 *
 * @author Sergio Castro
 */
/*
Vista y Controlador de la clase Datos_Estudiantes
*/
public class Controlador_Directorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Datos_Estudiantes> listaEstudiantes = new ArrayList <Datos_Estudiantes>();
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int op = 0;
        //Ciclo para menú
        while(op != 6){
            System.out.println("\nINSTITUTO LA FLORESTA");
            System.out.println("Seleccione tarea a realizar:"+ "\n1.Ingresar estudiante"+
                    "\n2.Buscar estudiante"+"\n3.Modificar estudiante"+"\n4.Eliminar Estudiante"+
                    "\n5.Ver directorio de estudiantes"+"\n6.Salir");
            System.out.println("Opción:");
            op = teclado.nextInt();
        
        switch(op){
            case 1://Create - CRUD
                System.out.println("\nIngresar estudiante");
                System.out.println("Ingresar nombres:");
                String nom = teclado.next();
                System.out.println("\nIngresar apellidos:");
                String ape = teclado.next();
                System.out.println("\nIngresar fecha de nacimiento (YYYY-MM-DD):");
                String fecha = teclado.next();
                System.out.println("\nIngresar correo institucional:");
                String coIns = teclado.next();
                System.out.println("\nIngresar correo personal:");
                String coPer = teclado.next();
                //Manejo Excepcion al ingresar tipo de dato erroneo
                Scanner tecla = new Scanner(System.in).useDelimiter("\n");
                long telCel;
                
                try{
                      
                    System.out.println("\nIngresar número de celular:");
                    telCel = tecla.nextLong();
                }
                catch(Exception e){
                    System.out.println("Dato Erroneo");
                    telCel = 0;
                        
                }
                
                //Manejo Excepcion al ingresar tipo de dato erroneo
                Scanner tec = new Scanner(System.in).useDelimiter("\n");
                long telfijo;
                
                try{
                    System.out.println("\nIngresar número fijo:");
                    telfijo = tec.nextLong();
                }
                catch(Exception e){
                    System.out.println("Dato No Valido");
                    telfijo = 0;
                }
                
                System.out.println("\nIngresar programa:");
                String programa = teclado.next();

                //Add para adicionar al arraylist
                listaEstudiantes.add(new Datos_Estudiantes(nom,ape,fecha,coIns,coPer,telCel,telfijo,programa));
                System.out.println("\nSe agregó el estudiante");
                break;
                
            case 2://Read - CRUD
                System.out.println("\nBuscar estudiante");
                System.out.println("Ingresar correo institucional:");
                String encontrar = teclado.next();
                System.out.println("\nInformación del estudiante");
                //Metodo para buscar dato
                for(Datos_Estudiantes Student:listaEstudiantes){
                    Student.buscarDatos(encontrar);                   
                }
                
                break;
            case 3://Update - CRUD
                System.out.println("\nModificar estudiante");
                System.out.println("Ingresar correo institucional");
                encontrar = teclado.next();
                for(int i = 0; i < listaEstudiantes.size(); i = i+1){
                    if(listaEstudiantes.get(i).getCorreo_Institucional().equals(encontrar)){

                        System.out.println("\nIngresar correo personal:");
                        coPer = teclado.next();
                        System.out.println("\nIngresar número de celular:");
                        telCel = teclado.nextLong();
                        System.out.println("\nIngresar número fijo:");
                        telfijo = teclado.nextLong();
                        System.out.println("Ingresar programa:");
                        programa = teclado.next();
                        //Set para edicion
                        listaEstudiantes.set(i, new Datos_Estudiantes(listaEstudiantes.get(i).getNombres(),listaEstudiantes.get(i).getApellidos(),
                                listaEstudiantes.get(i).getFecha_Nacimiento(),listaEstudiantes.get(i).getCorreo_Institucional(),coPer,telCel,telfijo,programa));
                        System.out.println("Se modificó el estudiante");
                    }
                }
                break;
            case 4://Delete - CRUD
                System.out.println("\nEliminar estudiante");
                System.out.println("Ingresar correo institucional:");
                encontrar = teclado.next();
                for(int i = 0; i < listaEstudiantes.size(); i++){
                    if(listaEstudiantes.get(i).getCorreo_Institucional().equals(encontrar)){
                        listaEstudiantes.remove(i);
                        System.out.println("\nSe eliminó el estudiante");
                    }
                }
                
                break;
            case 5:
                System.out.println("\nEl directorio de los estudiantes");
                for(Datos_Estudiantes i: listaEstudiantes){
                    System.out.println(i.mostrarDatos());
                }
                break;
            case 6:
                break;
            
        }
            
        }
        System.out.println("Hasta pronto");
    }
    
}
