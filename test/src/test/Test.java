package test;

public class Test {

   
    public static void main(String[] args) {    
    
        Operaciones obj=new Operaciones ();
        int n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el primer numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el segundo numero"));
        obj.sumar(n1,n2);
    }
    
}
