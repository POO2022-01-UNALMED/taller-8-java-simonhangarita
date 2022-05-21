package futbol;
public class Portero extends Futbolista{
  public short golesRecibidos;
  public byte dorsal;
  public Portero(String nombre,int edad, short golesMarcados,byte dorsal){
    super(nombre,edad,"Portero");
    this.golesRecibidos=golesMarcados;
    this.dorsal=dorsal;
  }
  @Override
  public int compareTo(Futbolista p){
    if(golesRecibidos==((Portero)p).golesRecibidos){
      return 0;
    }
    else if(golesRecibidos<((Portero)p).golesRecibidos){
      return ((Portero)p).golesRecibidos-this.golesRecibidos;
    }
    else{
      return this.golesRecibidos-((Portero)p).golesRecibidos;
    }
  }
  public boolean jugarConLasManos(){
    return true;
  }
  @Override
  public String toString(){
    return super.toString()+" con el dorsal "+dorsal+". Le han marcado "+ golesRecibidos;
  }
  
}