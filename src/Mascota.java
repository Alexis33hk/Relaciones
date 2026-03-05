public class Mascota {
        private String Nombre;
        private int edad;

    public Mascota() {
    }

    public Mascota(String nombre, int edad) {
        Nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "Nombre='" + Nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
    public String name(){
        System.out.println("Me llamo Pablito de raza Pug  y Mi dueño es Juan");
        return "Me llamoo";
    }
    public  int edad(){
        System.out.println("Tengo 5 años");
        return  5;
    }

}
