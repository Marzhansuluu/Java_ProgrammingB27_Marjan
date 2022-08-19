package day24_array;

public class SchoolStore {
    public static void main(String[] args) {
        String[] items = {"Backpack", "Jacket", "Shirt", "Macbook", "Notebook", "Headphones"};
        double[] prices = {59.99, 150.0, 10.55, 1_000, 3.49, 15.99};
        int[] itemId = {500101, 500102, 500103, 500104, 500105, 500106};

        // print the catalog
        System.out.println("Full Catalog\nID | NAME | PRICE");
        for(int i =0; i < items.length; i++){
            System.out.println(itemId[i] + " | " + items[i] + " | $" + prices[i]);

        }
        System.out.println("-------------------------------------------------");

        // finding if jackets in the store
        boolean inStock = false;
        for(String eachItem: items){// eachItem will represents each element from the items array
            if(eachItem.equalsIgnoreCase("jacket")){
                inStock =true;
                break;
            }
        }
        System.out.println(inStock ? "jacket is in stock" : "we do not have jackets right now");
        System.out.println("---------------------------------------------");

        // find the index of notebook
        int index = -1;// we just wanted to start -1.
        for(int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("notebook")){
                index =i;
            }
        }
        System.out.println("index of the notebook: " + index);

        // Find the information for the most expensive item
        double maxPrice =prices[0];// we put prices[0] because if this index element is not biggest it will change automatically. first element is good default
        int indexOfMax =0;

        for(int i =0; i < prices.length; i++){// we can start from int=1 because price is already the default
            if(prices[i] > maxPrice){// in here prices[i] is starting from 0 index element
                maxPrice = prices[i];
                indexOfMax =i;
            }
        }
        System.out.println("most expensive item: " + itemId[indexOfMax] + " | " + items[indexOfMax] + " | $" + prices[indexOfMax]);
    }
}
