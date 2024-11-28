public class Costa extends ComidaTipica{
    String extra;
    String juice;
    String dresser;

    // constructores
    public Costa(){

    }

    public Costa(String foodName, String chefName, String IngredentsNumber, String Sabor, String extra, String juice, String dresser) {
        super(foodName, chefName, IngredentsNumber, Sabor);
        this.extra = extra;
        this.juice = juice;
        this.dresser = dresser;
    }

    public Costa(String foodName, String chefName, String IngredentsNumber, String Sabor) {
        super.foodName = foodName;
        super.chefName = chefName;
        super.IngredentsNumber = IngredentsNumber;
        super.Sabor = Sabor;
    }

    public String getExtra() {
        return extra;
    }

    public String getJuice() {
        return juice;
    }

    public String getDresser() {
        return dresser;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public void setJuice(String juice) {
        this.juice = juice;
    }

    public void setDresser(String dresser) {
        this.dresser = dresser;
    }
    //Metodo Imprimir
    @Override
    public void imprimirPlato(){
        super.imprimirPlato();
        System.out.println(" -----------------------------------------------  ");
        System.out.println(" FICHA GENERAL COSTA ");
        System.out.println("La comida de la costa se acompaña con: " + extra);
        System.out.println("La comida de la costa se toma con: " + juice);
        System.out.println("El mejor postre para acompañar la comida de la costa es: " + dresser);
        System.out.println(" -----------------------------------------------  ");
    }
}
