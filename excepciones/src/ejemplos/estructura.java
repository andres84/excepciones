package ejemplos;

public class estructura {

    public void proceso(){
        
        int a = 3, b = 0;
        int division = a / b;
        System.out.println(division);
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //app app = new app();
        //app.proceso();
        
        
        try {//se ejecutan los procesos
            
            estructura app = new estructura();
            app.proceso();
            
        } catch (Exception e) {//se conytrola la exclecion
            
            System.out.println(e.getMessage());//obtener el mensaje
            
        }finally{//se ejecuta un proceso si o si
            
            System.out.println("ejecicion Bloque finally");
        }
        
        
    }
    
}
