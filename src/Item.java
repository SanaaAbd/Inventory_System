
//this is all teh variables needed for the inventory
//
public class Item {

private ItemType type;
private String name;
private int weight;
private int value;
private int strength;

//constructor
public Item(ItemType type,String name,int weight, int value, int strength) {
    this.type = type;
    this.name = name;
    this.weight = weight;
    this.value = value;
    this.strength = strength;
}




    //get fields
    public ItemType getType(){

    return type;
    }

    public String getName(){

    return name;
    }

    public int getWeight(){

    return weight;
    }

    public int getValue(){

    return value;
    }


//this will help wiht the format of the game
public String toString() {

    return String.format("%-25s %10d %10d %10d", name, weight, value, strength);
}



}
