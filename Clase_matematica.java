package main_calculadora;

public class Clase_matematica {
    private int num;


    //Constructor con un parametro
    public Clase_matematica(int num) {
        this.num = num;
    }
    public Clase_matematica() {    
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int sumar(int numero){
      int numero1=this.getNum();
         return numero1+numero;
    }
    public int[] multiplicar(){
        int numeros[] = new int[10];
       for (int i = 0; i < 10; i++) {
        numeros[i]=this.getNum()*i;
       }
       return numeros;
    }

}
