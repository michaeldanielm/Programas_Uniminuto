
import java.io.File;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Michael Daniel murillo
 */
public class guardar {
    public void guardar()throws EOFException{
        Usuario a = new Usuario();
        File guardar= new File ("datosEstudiante.txt");
        if (!guardar.exists()){
            try{
                guardar.createNewFile();
                System.out.println(guardar.getName()+"Ha sido creado");
            }catch(IOException ex){}   
        }else{
            try{
                FileWriter agregar = new FileWriter(guardar,true);
                agregar.append("datos personales del Usuario");
                agregar.append(a.getNombre());
                agregar.append(a.getApellido());
                agregar.append((char) a.getNit());
                agregar.append(a.getFecha());
                agregar.append(a.getNcelular());
                agregar.append(a.getCorreo());
                agregar.append(a.getDireccion());             
                agregar.append(a.getSexo());
                
            }catch(IOException ex){}
        }
    }
}
