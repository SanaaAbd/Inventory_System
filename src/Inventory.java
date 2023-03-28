import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    private ArrayList<Item> items;
    private int maxWeight;
    private Item equippedWeapon;
    private Item equippedArmor;

    public Inventory(int maxWeight) {
        this.items = new ArrayList<Item>();
        this.maxWeight = 100;
        equippedArmor = null;
        equippedWeapon = null;

    }



    public boolean add(Item item)
    {
        if(item.getWeight() < maxWeight)
        {
            items.add(item);
            System.out.println("The " + item.getName() + " was added to your inventory.");
            return true;
        }
        else
            System.out.println("Inventory Full!");
            return false;
    }

    public int totalWeight()
    {
        int total = 0;
        for(int c = 0; c < items.size(); c++)
            total += items.get(c).getWeight();
        return total;
    }
    public void print()
    {
        System.out.printf("%-25s %10s %10s %10s %n", "Item", "Weight", "Value", "Strength");
        for (Item item : items) {
            System.out.print(item.toString());
            if (item == equippedArmor) {
                System.out.println(" (EQUIPPED ARMOUR)");
            } else if ( item == equippedWeapon) {
                System.out.println(" (EQUIPPED WEAPON)");
            } else {
                System.out.println();
            }


        }

    }

    private Item ItemPackage(ItemType type)
    {
        Scanner in = new Scanner(System.in);
        int order = 0;
        int poss = 1;
        int pick = in.nextInt() - 1;
        System.out.printf("   %-25s %10s %10s %10s %n", "Item", "Weight", "Value", "Strength");
        //when the weapon or armour method is called this will form the format
        for (Item i : items) {
            if (type == null || i.getType() == type) {
                System.out.println(poss + ". " + i);
                poss++;
            }
        }
        // this will loop thro the arraylist til the item is found
        for (Item i : items) {
            if (type == null || i.getType() == type) {
                if (pick == 0) {
                    break;
                }
                pick--;
            }
            order++;
        }
        //once item found or not itl return for the weapon and armour method
        if (order < 0 || order >= items.size()) {
            return null;
        } else {
            return items.get(order);
        }
    }

    //this drop method will remove item in the inventory
    public void drop() {
        Item pick = ItemPackage(null);
        if (pick != null) {
            items.remove(pick);
            System.out.println("Item " + pick.getName() +" is removed from the inventory");
        }
    }
        // equipweappn method will equip the weapon onto the player from their inventory
        // the itempackage will find the item for the user to get the weapon they wannt to equip
        public void equipWeapon () {
            Item pick = ItemPackage(ItemType.WEAPON);
            if (pick != null) {
                equippedWeapon = pick;
                System.out.println("Equipped " + equippedWeapon.getName());

            } else
                System.out.println("Item not in your inventory");
        }
    // equiparmour method will equip the armour onto the player from their inventory
    // the itempackage will find the item for the user to get the armour they wannt to equip
        public void equipArmor() {
            Item pick = ItemPackage(ItemType.ARMOUR);
            if (pick != null) {
                equippedArmor = pick;
                System.out.println("Equipped  " + equippedArmor.getName());
            } else
                System.out.println("Item doesn't exist in the inventory");
      }


}