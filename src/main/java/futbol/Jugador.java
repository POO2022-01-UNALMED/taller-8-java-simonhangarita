package futbol;
public class Jugador extends Futbolista{
  private short golesMarcados;
  private byte dorsal;
  public Jugador(String nombre,int edad,String posicion, short golesMarcados,byte dorsal){
    super(nombre,edad,posicion);
    this.golesMarcados=golesMarcados;
    this.dorsal=dorsal;
  }
  public Jugador(){
    super();
    this.golesMarcados=289;
    this.dorsal=7;
  }
  public Short getGolesMarcados(){
    return golesMarcados;
  }
  public byte getDorsal(){
    return dorsal;
  }
  public void setGolesMarcados(short goles){
    this.golesMarcados=goles;
  }
  public void setDorsal(byte dorsal){
    this.dorsal=dorsal;
  }
  public int compareTo(Futbolista f){
    if(this.getEdad()==f.getEdad()){
      return 0;
    }
    else if(this.getEdad()<f.getEdad()){
      return f.getEdad()-this.getEdad();
    }
    else{
      return this.getEdad()-f.getEdad();
    }
  }
  public boolean jugarConLasManos(){
    return false;
  }
  public String toString(){
    return super.toString()+" con el dorsal "+dorsal+". Ha marcado "+ golesMarcados;
  }
  
}