import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Scanner entrada2 = new Scanner(System.in);
    System.out.println("ingresa el numero casillas que desea tener(no mayor a 180)");
    int auxi = entrada.nextInt();
    if (auxi>180){
      System.out.println("error casillas no validas");
    }
    else{

    int[] codigo = new int[auxi];
    int[] pp = new int[auxi];
    int[] sp = new int[auxi];
    int[] tp = new int[auxi];
    String[] nombre = new String[auxi];
    
    int aux = 0;
    int aux2 = 0;
    int opcion = 0;
    for (int i = 0;i<200;i++){
    System.out.println("que desea hacer a continuacion?");
    System.out.println("para ingresar estudiante marque 1");
    System.out.println("para retirar estudiante marque 2");
    System.out.println("para ingresar nota marque 3");
    System.out.println("para mostrar toda la informacion marque 4");
    opcion = entrada.nextInt();
      if (opcion==1){
        System.out.println("ingresar el nombre del estudiante: ");
        nombre[i] = entrada2.nextLine();
        codigo[i] = (int) (Math.random()*((10000-1000)+1))+1000;
        pp[i] = 00;
        sp[i] = 00;
        tp[i] = 00;
        System.out.println("ingresado correctamente!");
        System.out.println();
      }
      else if(opcion == 2){
        for(int j=0;j<auxi;j++){
        System.out.println((j+1) + " " + nombre[j] + " " + codigo[j]);
      }
        System.out.println("elige el numero de estudiante a eliminar");
        aux = entrada.nextInt();
        nombre[aux] = "retirado";
        codigo[aux] = 0;
        pp[aux] = 00;
        sp[aux] = 00;
        tp[aux] = 00;
        
      }
      else if(opcion == 3){
        for(int j=0;j<auxi;j++){
        System.out.println((j+1) + " " + nombre[j] + " " + codigo[j]);
      }
        System.out.println("elige el numero de estudiante a ingresar/cambiar notas");
        aux = entrada.nextInt();
        System.out.println("primer parcial");
        pp[aux] = entrada.nextInt();
        System.out.println("segundo parcial");
        sp[aux] = entrada.nextInt();
        System.out.println("examen final");
        tp[aux] = entrada.nextInt();
        System.out.println("notas cambiadas con exito!");
        for(int j=0;j<auxi;j++){
        System.out.println((j+1) + " " + nombre[j] + " " + codigo[j] + " " + pp[j] + " " + sp[j] + " " + tp[j]);
      }
      }
      else if(opcion == 4){
        for(int j=0;j<auxi;j++){
        System.out.println((j+1) + " " + nombre[j] + " " + codigo[j]);
      }
      }
      }
    }
  }
}
