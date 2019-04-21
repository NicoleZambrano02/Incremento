import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double suelini,cat,suelfin,inc;
    Scanner n=new Scanner(System.in);
    System.out.println("Ingrese el Sueldo Actual");
    suelini=n.nextDouble();
    System.out.println("Ingrese la categoria a la que pertenece");
    cat=n.nextDouble();
    suelfin=0;
    inc=0;
    if(cat==1){
      suelfin=(suelini*0.15)+suelini;
      inc=0.15;
    }
    else if(cat==2){
      suelfin=(suelini*0.1)+suelini;
      inc=0.1;
    }
    else if(cat==3){
      suelfin=(suelini*0.08)+suelini;
      inc=0.08;
    }
    else if(cat==4){
      suelfin=(suelini*0.07)+suelini;
      inc=0.15;
    }
    else{
        System.out.println("Categoria no identificada");
    }
    System.out.println("Su sueldo inicial es: "+suelini);
    System.out.println("Con un incremento de: "+inc);
    System.out.println("Dando un total de: "+suelfin);
  }
}
