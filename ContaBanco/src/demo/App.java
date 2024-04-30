package demo;

import modelo.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente c1 = new Cliente(1021, "Brendo Mota", "067-8", 237.48);

        System.out.println(c1);
    }
}
