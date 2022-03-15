package clases;

public class Proceso extends Thread{
    
    int num_int;
    
    @Override
    public void run(){
        for (int i = 0; i < num_int; i++) {
            System.out.println("i = " + i+ this.getName());
        }
        System.out.println("");
    }
    
    public void valorCondicion(int valor){
        this.num_int=valor;
    }
    
}
