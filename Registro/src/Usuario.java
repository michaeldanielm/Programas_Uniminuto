
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Usuario {

    static String readString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @Michael Daniel
     */

    private long id;
    private String nombre;
    private String apellido;
    private String sexo;
    private String correo;
    private String direccion;
    private String fecha;
    private int nit;
    private String Ncelular;
    private String edad;
    private String pais;
    private String luga_de_nacimiento;
    private String Cedula;
    private String Tipo_Sangre_o_Rh;

    public void Datos() {
        Scanner tec = new Scanner(System.in);
        System.out.print("ingrese id;");
        id = tec.hashCode();
        System.out.print("ingrese nombre: ");
        nombre = tec.next();
        System.out.print("ingrese apellido: ");
        apellido = tec.next();
        System.out.print("ingrese nit: ");
        nit = tec.nextInt();
        System.out.print("ingrese fecha de naciminiento\n"
                + "d-mes-fecha separacion '/ o -' : ");
        fecha = tec.next();
        System.out.print("ingrese N° celular o fijo : ");
        Ncelular = tec.next();
        System.out.print("ingrese correo electronico : ");
        correo = tec.next();
        System.out.print("ingrese direccion recidencial sin espacios: ");
        direccion = tec.next();
        System.out.print("ingrese sexo : ");
        sexo = tec.next();
        System.out.print("ingrese Edad:");
        edad = tec.next();
        System.out.print("Pais:");
        pais = tec.next();
        System.out.print("Lugar de Nacimiento:");
        luga_de_nacimiento = tec.next();
        System.out.print("Cedula :");
        Cedula = tec.next();
        System.out.print("Tipo de Sangre o Rh");
        Tipo_Sangre_o_Rh = tec.next();

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNcelular() {
        return Ncelular;
    }

    public void setNcelular(String Ncelular) {
        this.Ncelular = Ncelular;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLuga_de_nacimiento() {
        return luga_de_nacimiento;
    }

    public void setLuga_de_nacimiento(String luga_de_nacimiento) {
        this.luga_de_nacimiento = luga_de_nacimiento;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTipo_Sangre_o_Rh() {
        return Tipo_Sangre_o_Rh;
    }

    public void setTipo_Sangre_o_Rh(String Tipo_Sangre_o_Rh) {
        this.Tipo_Sangre_o_Rh = Tipo_Sangre_o_Rh;
    }}

    