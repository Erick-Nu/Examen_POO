import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Creacion de Objetos
        // Quito
        System.out.print("[NOMBRE DEL RESTAURANTE]: ");
        String restaurante = teclado.nextLine();
        System.out.print("[NOMBRE DEL PLATO]: ");
        String plato = teclado.nextLine();
        System.out.print("[DIRECCION]: ");
        String direccion = teclado.nextLine();
        System.out.print("[TIEMPO DE ESPERA]: ");
        String time= teclado.nextLine();
        System.out.print("[CUAL ES SU ACOMPAÑADO]: ");
        String extra= teclado.nextLine();
        System.out.print("[CON QUE JUGO RECOMIENDAS COMER ESTA COMIDA]: ");
        String juice= teclado.nextLine();
        System.out.print("[CUAL POSTRE ES EL MEJOR ACOMPAÑANTE]: ");
        String dresser= teclado.nextLine();
        System.out.print("[NUMERO DE INGREDIENTES]: ");
        String IngredentsNumber= teclado.nextLine();
        System.out.print("[CHEF]: ");
        String chefName= teclado.nextLine();
        System.out.print("[SABOR DEL PLATO]: ");
        String sabor= teclado.nextLine();
        System.out.print("[AÑO EN EL QUE APARECIO EL PLATO]: ");
        String year= teclado.nextLine();
        System.out.print("[PRECIO DEL PLATO]: ");
        Double costs= teclado.nextDouble();
        System.out.print("[CALIFICACION DEL PLATO]: ");
        int calificacion= teclado.nextInt();
        LugaresQ foodOne = new LugaresQ(plato,chefName,IngredentsNumber,sabor,extra,juice,dresser,costs,year,direccion,restaurante,time,calificacion);
        foodOne.imprimirPlato();
        // Guayaquil
        System.out.print("[NOMBRE DEL RESTAURANTE]: ");
        String restaurante1 = teclado.nextLine();
        System.out.print("[NOMBRE DEL PLATO]: ");
        String plato1 = teclado.nextLine();
        System.out.print("[DIRECCION]: ");
        String direccion1 = teclado.nextLine();
        System.out.print("[TIEMPO DE ESPERA]: ");
        String time1= teclado.nextLine();
        System.out.print("[CUAL ES SU ACOMPAÑADO]: ");
        String extra1= teclado.nextLine();
        System.out.print("[CON QUE JUGO RECOMIENDAS COMER ESTA COMIDA]: ");
        String juice1= teclado.nextLine();
        System.out.print("[CUAL POSTRE ES EL MEJOR ACOMPAÑANTE]: ");
        String dresser1= teclado.nextLine();
        System.out.print("[NUMERO DE INGREDIENTES]: ");
        String IngredentsNumber1= teclado.nextLine();
        System.out.print("[CHEF]: ");
        String chefName1= teclado.nextLine();
        System.out.print("[SABOR DEL PLATO]: ");
        String sabor1= teclado.nextLine();
        System.out.print("[AÑO EN EL QUE APARECIO EL PLATO]: ");
        String year1= teclado.nextLine();
        System.out.print("[PRECIO DEL PLATO]: ");
        Double costs1= teclado.nextDouble();
        System.out.print("[CALIFICACION DEL PLATO]: ");
        int calificacion1= teclado.nextInt();
        LugaresG foodTwo = new LugaresG(plato1,chefName1,IngredentsNumber1,sabor1,extra1,juice1,dresser1,costs1,year1,direccion1,restaurante1,time1,calificacion1);
        foodOne.imprimirPlato();
        // Puyo
        System.out.print("[NOMBRE DEL RESTAURANTE]: ");
        String restaurante2 = teclado.nextLine();
        System.out.print("[NOMBRE DEL PLATO]: ");
        String plato2 = teclado.nextLine();
        System.out.print("[DIRECCION]: ");
        String direccion2 = teclado.nextLine();
        System.out.print("[TIEMPO DE ESPERA]: ");
        String time2= teclado.nextLine();
        System.out.print("[CUAL ES SU ACOMPAÑADO]: ");
        String extra2= teclado.nextLine();
        System.out.print("[CON QUE JUGO RECOMIENDAS COMER ESTA COMIDA]: ");
        String juice2= teclado.nextLine();
        System.out.print("[CUAL POSTRE ES EL MEJOR ACOMPAÑANTE]: ");
        String dresser2= teclado.nextLine();
        System.out.print("[NUMERO DE INGREDIENTES]: ");
        String IngredentsNumber2= teclado.nextLine();
        System.out.print("[CHEF]: ");
        String chefName2= teclado.nextLine();
        System.out.print("[SABOR DEL PLATO]: ");
        String sabor2= teclado.nextLine();
        System.out.print("[AÑO EN EL QUE APARECIO EL PLATO]: ");
        String year2= teclado.nextLine();
        System.out.print("[PRECIO DEL PLATO]: ");
        Double costs2= teclado.nextDouble();
        System.out.print("[CALIFICACION DEL PLATO]: ");
        int calificacion2= teclado.nextInt();
        LugaresQ foodThree = new LugaresQ(plato2,chefName2,IngredentsNumber2,sabor2,extra,juice2,dresser2,costs2,year2,direccion2,restaurante2,time2,calificacion2);
        foodOne.imprimirPlato();

    }
}