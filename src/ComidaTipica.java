
public class ComidaTipica {
    String foodName;
    String chefName;
    String IngredentsNumber;
    String Sabor;
    //Constrictor vacio

    public ComidaTipica() {
    }
    //Constructor Objetos
    public ComidaTipica(String foodName, String chefName, String IngredentsNumber, String Sabor) {
        this.foodName = foodName;
        this.chefName = chefName;
        this.IngredentsNumber = IngredentsNumber;
        this.Sabor = Sabor;
    }
    // getters
    public String getFoodName() {
        return foodName;
    }

    public String getChefName() {
        return chefName;
    }

    public String getIngredentsNumber() {
        return IngredentsNumber;
    }

    public String getSabor() {
        return Sabor;
    }
    // setters
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public void setIngredentsNumber(String ingredentsNumber) {
        IngredentsNumber = ingredentsNumber;
    }

    public void setSabor(String sabor) {
        Sabor = sabor;
    }
    // metodo
    public void imprimirPlato(){
        System.out.println(" -----------------------------------------------  ");
        System.out.println(" FICHA GENERAL");
        System.out.println("Name of the food: " + foodName);
        System.out.println("Chef Name: " + chefName);
        System.out.println("Ingredents Number: " + IngredentsNumber);
        System.out.println("Sabor: " + Sabor);
        System.out.println(" -----------------------------------------------  ");
    }

}
