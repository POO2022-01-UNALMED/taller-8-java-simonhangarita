package futbol;
public class Portero extends Futbolista{
  private short golesRecibidos;
  private byte dorsal;
  public Portero(String nombre,int edad, short golesMarcados,byte dorsal){
    super(nombre,edad,"Portero");
    this.golesRecibidos=golesMarcados;
    this.dorsal=dorsal;
  }
  public Short getGolesRecibidos(){
    return golesRecibidos;
  }
  public byte getDorsal(){
    return dorsal;
  }
  public void setGolesRecibidos(short golesRecibidos){
    this.golesRecibidos=golesRecibidos;
  }
  public void setDorsal(byte dorsal){
    this.dorsal=dorsal;
  }
  public int compareTo(Futbolista p){
    if(golesRecibidos==((Portero)p).getGolesRecibidos()){
      return 0;
    }
    else if(golesRecibidos<((Portero)p).getGolesRecibidos()){
      return ((Portero)p).getGolesRecibidos()-this.getGolesRecibidos();
    }
    else{
      return this.getGolesRecibidos()-((Portero)p).getGolesRecibidos();
    }
  }
  public boolean jugarConLasManos(){
    return true;
  }
  public String toString(){
    return super.toString()+" con el dorsal "+dorsal+". Le han marcado "+ golesRecibidos;
  }
  
}