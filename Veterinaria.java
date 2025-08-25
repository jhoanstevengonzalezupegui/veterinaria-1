package app;

public class Veterinaria {
    // ------------- Atributos Propios-------------------
    private String nombre;
    private String nit;

    // ------------- Atributos de Relaciones -------------------
    private Mascota[] listMascota;

    // ------------- Constructor -------------------
    public Veterinaria(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        listMascota = new Mascota[10];
    }

    // ------------- CRUD -------------------

    public boolean agregarMascota(String nombre, String especie,
                                  String raza, int edad, String numeroChip,
                                  String nombrePropietario, String numeroContacto){

        Mascota nuevoMascota= new Mascota(nombre,especie,raza,edad,numeroChip,nombrePropietario,numeroContacto);

        for (int i = 0; i < listMascota.length; i++) {
            if (listMascota[i] != null && listMascota[i].getNumeroChip().equals(numeroChip)) {
                return false;
            }
        }
        for (int i = 0; i < listMascota.length; i++) {
            if(listMascota[i] == null){
                listMascota[i] = nuevoMascota;
                return true;
            }
        }
        return false;
    }




    private int obtenerPosicionMascota(String numeroChip){
        for(int i = 0; i < listMascota.length; i++){
            if(listMascota[i] != null &&
                    listMascota[i].getNumeroChip().equals(numeroChip)){
                return i;
            }
        }
        return -1;
    }

    public boolean eliminarMascota(String numeroChip){
        int indexMascota = obtenerPosicionMascota(numeroChip);

        if(indexMascota == -1) return false;

        listMascota[indexMascota] = null;
        return true;

    }



    public boolean actualizarMascota(String nombre, String especie,
                                     String raza, int edad, String numeroChip,
                                     String nombrePropietario, String numeroContacto){

        int indexMascota = obtenerPosicionMascota(numeroChip);
        if(indexMascota == -1) return false;

        Mascota actualizarMascota = listMascota[indexMascota];

        actualizarMascota.setNombre(nombre);
        actualizarMascota.setEspecie(especie);
        actualizarMascota.setRaza(raza);
        actualizarMascota.setEdad(edad);
        actualizarMascota.setNumeroChip(numeroChip);
        actualizarMascota.setNombrePropietario(nombrePropietario);
        actualizarMascota.setNumeroContacto(numeroContacto);
        
        return true;
    }





    public Mascota obtenerMascota(String numeroChip){
        int indexMascota = obtenerPosicionMascota(numeroChip);
        if(indexMascota == -1) return null;

        return listMascota[indexMascota];
    }

    public Mascota[] obtenerListaMascota(){
        return listMascota;
    }










    // ------------- Getters And Setters -------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}