
package Modelo;

public class Persona {
    int OrderID;
    String Nombre;
    String Apellido;
    String PlatoFuerte;
    String Bebida;

    public Persona() {
    }

    public Persona( String Nombre, String Apellido, String PlatoFuerte, String Bebida) {
        this.OrderID = OrderID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.PlatoFuerte = PlatoFuerte;
        this.Bebida = Bebida;
    }

    public int getId() {
        return OrderID;
    }

    public void setId(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
      public String getPlatoFuerte() {
        return PlatoFuerte;
    }

    public void setPlatoFuerte(String PlatoFuerte) {
        this.PlatoFuerte = PlatoFuerte;
    }
      public String getBebida() {
        return Bebida;
    }

    public void setBebida(String Bebida) {
        this.Bebida = Bebida;
    }
}
