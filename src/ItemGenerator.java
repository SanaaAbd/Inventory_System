import java.util.Random;

public class ItemGenerator {
    public static Item generate() {
        Random rng = new Random();
        int rng_pick = rng.nextInt((3 - 0) + 0) + 0;
        ItemType pick = ItemType.OTHER;
        switch(rng_pick)
        {
            case 0:
                pick = ItemType.OTHER;
                break;
            case 1:
                pick = ItemType.ARMOUR;
                break;
            case 2:
                pick = ItemType.WEAPON;
                break;
        }
        //this will separtae the armour and weapon strenth from the others
        String[] Name = {};
        if(pick == ItemType.ARMOUR) {
            Name = new String[]{"Iron Armour","Steel Armour","Leather boot","Iron boot"};
        } else if (pick == ItemType.WEAPON) {
            Name = new String[]{"Iron Long Sword", "Wood Sword", "Iron Spear","Iron dagger"};
        } else{
            Name = new String[]{"Health potion", "Mana potion","Food","Bandages"};

        }
        //this will separtae the armour and weapon strenth from the others
        int []weight = {};
        if(pick == ItemType.ARMOUR) {
            weight = new int[]{18, 22, 19, 16, 16, 21, 19};
        } else if (pick == ItemType.WEAPON) {
            weight = new int[]{26, 28, 18, 16, 15, 16, 19};
        } else{
            weight = new int[]{6,5,5,4,2,1,5};
        }
        //this will separtae the armour and weapon strenth from the others
        int []value = {};
        if(pick == ItemType.ARMOUR) {
           value = new int[]{18, 32, 19, 21, 16, 24, 29};
        } else if (pick == ItemType.WEAPON) {
            value = new int[]{10, 12, 25, 11, 36, 14, 19};
        } else{
            value = new int[]{6,2,9,1,1,3,2};
        }
        //this will separtae the armour and weapon strenth from the others
        int []strength = {};
        if(pick == ItemType.ARMOUR) {
            strength = new int[]{18, 12, 19, 11, 16, 14, 19};
        } else if (pick == ItemType.WEAPON) {
            strength = new int[]{20, 21, 15, 16, 16, 14, 19};
        } else{
            strength = new int[]{0,0,0,0,0,0,0};
        }

        int posName = rng.nextInt((4 - 0) + 0) + 0;
        int posWeight = rng.nextInt((7 - 0) + 0) + 0;
        int posValue = rng.nextInt((7 - 0) + 0) + 0;
        int posStrength = rng.nextInt((7 - 0) + 0) + 0;
        return new Item(pick, Name[posName], weight[posWeight], value[posValue], strength[posStrength]);
    }
}
