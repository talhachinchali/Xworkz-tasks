class AllMethods
{
	public static void main(String[] args)
	{
		Cake.tasty("Honey Cake","Rectangle","Ayyangar",500,4);
		System.out.println("=========================================================>");
		Camera.click("Ramdurg",10,24.1,"Excellent","Sagar");
		System.out.println("=========================================================>");
		Fridge.store("Milk","Hatson curd","Coriander",10,5,6);
		System.out.println("=========================================================>");
		Baker.cooking("EggPup",10,"Cake",2,"3hour");
		System.out.println("=========================================================>");
		WeighMachine.calculateWeight("Fat",50,"Rice Packets",1000,true);
		System.out.println("=========================================================>");
		Kulfi.orderKulfi("Pista Kulfi",50,30);
		System.out.println("=========================================================>");
		Owen.bake("chicken ",50,30);
		System.out.println("=========================================================>");
		Scanner.scan("paper");
		System.out.println("=========================================================>");
		Goldsmith.craft("chain","gold",30);
		System.out.println("=========================================================>");
		Soda.prepare("jeera soda","50",30);
		System.out.println("=========================================================>");
		Stove.cook("rajma",50,30);
	}
}

 class Fridge {
    static void store(String item1, String item2, String item3, int quantity1, int quantity2, int quantity3){
        System.out.println("Storing items in the fridge: " + item1 + ", " + item2 + ", " + item3);
        if(quantity1>0){
        System.out.println("Quantity of " + item1 + ": " + quantity1);
    }
        System.out.println("Quantity of " + item2 + ": " + quantity2);
        System.out.println("Quantity of " + item3 + ": " + quantity3);
    }
}

class Baker {
    static void cooking(String dish1, int quantity1, String dish2, int quantity2, String duration){
        System.out.println("Baker is cooking: " + dish1 + ", " + dish2);
        if(quantity1>0){
        System.out.println("Quantity of " + dish1 + ": " + quantity1);
    }
        System.out.println("Quantity of " + dish2 + ": " + quantity2);
        System.out.println("Duration of cooking: " + duration);
    }
}

 class WeighMachine {
    static void calculateWeight(String category, int weight, String item, int quantity, boolean isCorrectWeight){
        System.out.println("Category: " + category);
        if(weight>0){
        System.out.println("Weight: " + weight + " kg");}
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        
        if (isCorrectWeight) {
            System.out.println("Weight is correct.");
        } else {
            System.out.println("Weight is incorrect.");
        }
    }
}

class Kulfi {
    static void orderKulfi(String flavor, int quantity, int price){
        System.out.println("Ordering Kulfi");
       
        System.out.println("Flavor: " + flavor);
        if(quantity>0)
        {
        System.out.println("Quantity: " + quantity);
        }
        System.out.println("Price: $" + price);
        
    }
}


 class Owen {
    static void bake(String dish, int temperature, int duration) {
        System.out.println("Baking: " + dish);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Duration: " + duration + " minutes");

        if (temperature > 200) {
            System.out.println("Warning: High temperature! Check the dish regularly.");
        }
    }
}

class Scanner {
    static void scan(String document) {
        System.out.println("Scanning document: " + document);

        if (document.length() > 10) {
            System.out.println("Warning: Document is too long for scanning.");
        }
    }
}

class Goldsmith {
    static void craft(String jewelry, String material, int quantity) {
        System.out.println("Crafting " + quantity + " pieces of " + jewelry);
        System.out.println("Material: " + material);

        if (quantity < 5) {
            System.out.println("Warning: Low quantity. Consider making more pieces.");
        }
    }
}

class Soda {
    static void prepare(String flavor, String size, int quantity) {
        System.out.println("Preparing " + quantity + " bottles of " + flavor + " soda");
        System.out.println("Size: " + size);

        if (quantity > 100) {
            System.out.println("Warning: Large quantity. Ensure enough storage space.");
        }
    }
}

class Stove {
    static void cook(String dish, int heatLevel, int duration) {
        System.out.println("Cooking: " + dish);
        System.out.println("Heat Level: " + heatLevel);
        System.out.println("Duration: " + duration + " minutes");

        if (duration > 120) {
            System.out.println("Warning: Long cooking duration. Monitor the dish carefully.");
        }
    }
}
