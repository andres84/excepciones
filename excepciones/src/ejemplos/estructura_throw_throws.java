package ejemplos;

public class estructura_throw_throws {

    public void metodo1() {

        try {
            
            metodo2();

        } catch (Exception e) {
        }

    }
    
    public void metodo2() {

        try {
            
            metodo3();

        } catch (Exception e) {
            
            System.out.println(e.getMessage());
            
        }

    }
    
    public void metodo3() throws Exception {

        try {
            
            int division = 3 / 0;
            System.out.println(division);

        } catch (Exception e) {
            
            throw new Exception("enviando a la capa del metodo2");
        }

    }

    public static void main(String[] args) {

        
        estructura_throw_throws es = new estructura_throw_throws();
        es.metodo1();
        
    }

}
