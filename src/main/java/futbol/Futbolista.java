package futbol;
public abstract class Futbolista implements Comparable{
  private String nombre;
  private int edad;
  private final String posicion;
  protected Futbolista(String nombre,int edad,String posicion){
    this.nombre=nombre;
    this.edad=edad;
    this.posicion=posicion;
  }
  protected Futbolista(){
    this("Maradona",30,"delantero");
  }
  public String getNombre(){
    return nombre;
  }
  public int getEdad(){
    return edad;
  }
  public String getPosicion(){
    return posicion;
  }
  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public void setEdad(int edad){
    this.edad=edad;
  }
  public String toString(){
    return "El futbolista "+nombre+" tiene "+edad+", y juega de "+posicion;
  }
  public boolean equals(Futbolista f){
    if(this.getEdad()==f.getEdad()){
      if (this.getNombre().equals(f.getNombre())&& this.getPosicion().equals(f.getPosicion())){
        if (f instanceof Jugador){
          if(((Jugador)this).golesMarcados==((Jugador)f).golesMarcados &&((Jugador)this).dorsal==((Jugador)f).dorsal){
            return true;
          } 
          else{return false;}
        }
        else if(f instanceof Portero){
          if(((Portero)this).golesRecibidos==((Portero)f).golesRecibidos &&((Jugador)this).dorsal==((Jugador)f).dorsal){
            return true;
          }
          else{return false;}
        }
        return true;
      }
      return false;
    }
    return false;
  }
  public abstract boolean jugarConLasManos();
}