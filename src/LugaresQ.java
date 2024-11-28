public class LugaresQ extends Quito{
    String direccion;
    String restaurante;
    String time;
    int calificacion;

    public LugaresQ() {

    }

    public LugaresQ(String foodName, String chefName, String IngredentsNumber, String Sabor, String extra, String juice, String dresser, double costs, String year, String direccion, String restaurante, String time, int calificacion) {
        super(foodName, chefName, IngredentsNumber, Sabor, extra, juice, dresser, costs, year);
        this.direccion = direccion;
        this.restaurante = restaurante;
        this.time = time;
        this.calificacion = calificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public String getTime() {
        return time;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    // metodo imprimir
    @Override
    public void imprimirPlato(){
        super.imprimirPlato();
        System.out.println(" -----------------------------------------------  ");
        System.out.println(" LUGARES PARA COMER ESTE DELICIOSO PLATO ");
        System.out.println("Nombre del restaurante: "+ restaurante);
        System.out.println("Direccion: " + direccion);
        System.out.println("Calificacion: "+ calificacion);
        System.out.println("Tiempo de preparacion: " + time);
        System.out.println(" -----------------------------------------------  ");
    }
}
