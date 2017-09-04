public class Estacionamiento
{
    private int espacioDis;
    private int costo;
    private Vehiculo datos;
    
    public Estacionamiento()
    {
        espacioDis=150;
        costo=15;
        //datos=new vehiculo();
    }
    
    public void registrarIn(String placas,int horall,int minll)
    {
        
    }
    
    
    public void registrarSal(String placas,int horasa,int Vehiculosa)
    {
        
    }
    
    
    
    public boolean checarDis()
    { if(espacioDis<=150)
        {
          espacioDis=espacioDis-1;
          return true;
        }
       else
       {
           return false;
           
        }
    }
    public void calculacosto()
    {
        
    }
}   
 