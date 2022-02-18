import java.util.ArrayList;

public class ArrayListTeste
{
    public static void main (String[] args) 
    {
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("Pizza");
        bakeryList.add("Hamburguer");
        bakeryList.add("Pao");

        ArrayList<String> namesList = new ArrayList();
        namesList.add("Jorge");
        namesList.add("Andre");
        namesList.add("Aquele");

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("Suco");
        drinkList.add("Fanta");
        drinkList.add("Coca");

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        groceryList.add(bakeryList);
        groceryList.add(namesList);
        groceryList.add(drinkList);

        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(1));
        System.out.println(groceryList.get(2));
    }
}