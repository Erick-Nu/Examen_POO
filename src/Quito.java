public class Quito extends Sierra {
    double costs;
    String year;

    public Quito() {

    }

    public Quito(String foodName, String chefName, String IngredentsNumber, String Sabor, String extra, String juice, String dresser, double costs, String year) {
        super(foodName, chefName, IngredentsNumber, Sabor, extra, juice, dresser);
        this.costs = costs;
        this.year = year;
    }

    public Quito(String foodName, String chefName, String IngredentsNumber, String Sabor,String extra, String juice, String dresser) {
        super(foodName, chefName, IngredentsNumber, Sabor, extra, juice, dresser);
    }

    //getters


    public double getCosts() {
        return costs;
    }

    public String getYear() {
        return year;
    }

    //setters


    public void setCosts(double costs) {
        this.costs = costs;
    }

    public void setYear(String year) {
        this.year = year;
    }

    // metodo imprmir
    @Override
    public void imprimirPlato(){
        super.imprimirPlato();
        System.out.println(" -----------------------------------------------  ");
        System.out.println(" FICHA QUITO ");
        System.out.println(" El precio aproximado del plato es: " + costs);
        System.out.println(" El año de creacion del plato es: " + year);
        System.out.println(" -----------------------------------------------  ");

    }
}
