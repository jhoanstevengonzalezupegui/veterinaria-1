package app;

public class Mascota {
    // ------------- Atributos -------------------
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String numeroChip;
    private String nombrePropietario;
    private String numeroContacto;

    // ------------- Constructor -------------------
    public Mascota(String nombre, String especie,
                   String raza, int edad, String numeroChip,
                   String nombrePropietario, String numeroContacto) {

        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.numeroChip = numeroChip;
        this.nombrePropietario = nombrePropietario;
        this.numeroContacto = numeroContacto;

    }


    @Override
    public String toString() {
        return "Mascota \n nombre: " + nombre + "\n Especie: " + especie + "\n raza: "+raza+"\n edad:"+edad+"\n " +
                "numero de chip:"+numeroChip+"\n nombre propietario:"+nombrePropietario+"\n numero de :"+numeroContacto+" \n";
    }

    //getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getNumeroChip() {
        return numeroChip;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

  //seterss


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumeroChip(String numeroChip) {
        this.numeroChip = numeroChip;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
}



