import java.util.Scanner;

public class Main {
    public static int menu(Scanner sc)
    {
        //format for the menu
        System.out.print("\n 1. Print Inventory \n 2. Add Random Item \n 3. Drop Item" +
                "\n 4. Equip Weapon \n 5. Equip Armour \n 6. Exit. \n : ");
        int ch = sc.nextInt();
        sc.nextLine();
        return ch;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inventory inv = new Inventory(50);
        System.out.println("--------------------");
        do
        {
            switch(menu(sc))
            {
                case 1:
                    inv.print();
                    break;
                case 2:
                    inv.add(ItemGenerator.generate());
                    break;
                case 3:
                    inv.drop();
                    break;
                case 4:
                    inv.equipWeapon();
                    break;
                case 5:
                    inv.equipArmor();
                    break;
                case 6:
                    System.out.print("\n\n\t\t Thanks");
                    System.exit(0);
                default:
                    System.out.print("\n Invalid Choice!");
            }
            System.out.println("--------------------");

        }while(true);

    }
}