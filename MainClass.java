import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        //Including the classes in the main class
        Scanner sc = new Scanner(System.in);
        Character characterC = new Character();
        Gender gen = new Gender();
        Classes Class = new Classes();
        HairColor hc = new HairColor();

        //Name of the character
        System.out.print("Enter character name: ");
        characterC.charName = sc.next();

        //Selecting a gender with Switch
        System.out.println("WARNING: If you miss spell the words, it will create and error.");
        System.out.println("Choose the following genders: " + gen.male + ", " + gen.female + " or " + gen.other);
        System.out.print("Select gender: ");
        characterC.gender = sc.next();
        switch (characterC.gender) {
            case "Female":
            case "Male":
                break;

            default:
                System.out.println("Gender doesn't exist!");
        }

        //Selecting a class with switch
        System.out.println("Choose the following classes: " + Class.warrior + ", " + Class.rogue + " or " + Class.sorcerer);
        System.out.print("Select your class: ");
        characterC.classes = sc.next();
        switch (characterC.classes) {
            case "Warrior":
            case "Rogue":
            case "Sorcerer":
                break;

            default:
                System.out.println("Class does not exist!");
        }

        //Selecting the hair color for the character
        System.out.println("Choose the following hair dyes: " + hc.black + ", " + hc.blue + ", " + hc.green + " or " + hc.violet);
        System.out.print("Select your hair dye: ");
        characterC.hairColor = sc.next();
        switch (characterC.hairColor) {
            case "Black":
            case "Blue":
            case "Green":
            case "Violet":
                break;

            default:
                System.out.println("That color doesn't exist yet!");
        }

        //Results
        System.out.println("");
        System.out.println("Your character name is: " + characterC.charName);
        System.out.println("Your character gender is: " + characterC.gender);
        System.out.println("Your character's class is: " + characterC.classes);
        System.out.println("Your character's hair is: " + characterC.hairColor);
        System.out.println("");

        //If class is not entered properly
        if (characterC.classes == "Warrior" || characterC.classes == "Rogue" || characterC.classes == "Sorcerer") {
            System.out.println("Error on the classes!");
        }

        //If Male of Female is not entered
        if (characterC.gender == "Male" || characterC.gender == "Female") {
            System.out.println("Error on the gender!");
        }

        //If hair color isn't added
        if (characterC.hairColor == "Black" || characterC.hairColor == "Blue" || characterC.hairColor == "Green" || characterC.hairColor == "Violet") {
            System.out.println("Error on the hair color!");
        }

        characterC.characterSuccess();
    }

}
