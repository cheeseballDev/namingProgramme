package smolProjects;

import java.util.Scanner;

public class namingProgrammeArray {
    public static void main(String[] args){
        int x;
        boolean flag = true;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter three first names: ");                               // Gets 3 user inputs
        String name0 = userInput.nextLine();
        String name1 = userInput.nextLine();
        String name2 = userInput.nextLine();

        String[] combinedNames = {                                                      // Combines names into an array
            name0.concat(" " + name1),
            name0.concat(" " + name2),
            name1.concat(" " + name0),
            name1.concat(" " + name2),
            name2.concat(" " + name0),
            name2.concat(" " + name1)
        };

        System.out.println("Possible names are:");                                    // Makes a table of names and 
        for(int i = 0; i < combinedNames.length; i++){                                  // prints it for the user
            System.out.println((i+1) + "- " + combinedNames[i]);
        }

        System.out.print("Enter 1-6 to select a name or 0 to stop the program: ");   // Selection statements
        x = userInput.nextInt();
        while(flag) {
        switch (x) {
            case 1: // first + second
                String selectedCombination1 = combinedNames[x - 1];
                char intialCombinationFS1 = name0.charAt(0);
                char initialCombinationFS2 = name1.charAt(0);
                String lowerCaseFS = selectedCombination1.toLowerCase();
                String usernameFS = lowerCaseFS.replace(' ', '_');
                System.out.println("The initials for " + selectedCombination1 + " is " + intialCombinationFS1 + initialCombinationFS2);
                System.out.println("Suggested username: " + usernameFS);
                System.out.println("---");
                System.out.println("What is your next number?");
                x = userInput.nextInt();
                break;
            case 2: // first + third
                String selectedCombination2 = combinedNames[x - 1];
                char intialCombinationFT1 = name0.charAt(0);
                char initialCombinationFT2 = name2.charAt(0);
                String lowerCaseFT = selectedCombination2.toLowerCase();
                String usernameFT = lowerCaseFT.replace(' ', '_');
                System.out.println("The initials for " + selectedCombination2 + " is " + intialCombinationFT1 + initialCombinationFT2);
                System.out.println("Suggested username: " + usernameFT);
                System.out.println("---");
                System.out.println("What is your next number?");
                x = userInput.nextInt();
                break;
            case 3: // second + first
                String selectedCombination3 = combinedNames[x - 1];
                char intialCombinationSF1 = name1.charAt(0);
                char initialCombinationSF2 = name0.charAt(0);
                String lowerCaseSF = selectedCombination3.toLowerCase();
                String usernameSF = lowerCaseSF.replace(' ', '_');;
                System.out.println("The initials for " + selectedCombination3 + " is " + intialCombinationSF1 + initialCombinationSF2);
                System.out.println("Suggested username: " + usernameSF);
                System.out.println("---");
                System.out.println("What is your next number?");
                x = userInput.nextInt();
                break;
            case 4: // second + third
                String selectedCombination4 = combinedNames[x - 1];
                char intialCombinationST1 = name1.charAt(0);
                char initialCombinationST2 = name2.charAt(0);
                String lowerCaseST = selectedCombination4.toLowerCase();
                String usernameST = lowerCaseST.replace(' ', '_');
                System.out.println("The initials for " + selectedCombination4 + " is " + intialCombinationST1 + initialCombinationST2);
                System.out.println("Suggested username: " + usernameST);
                System.out.println("---");
                System.out.println("What is your next number?");
                x = userInput.nextInt();
                break;
            case 5: // third + first
                String selectedCombination5 = combinedNames[x - 1];
                char intialCombinationTF1 = name2.charAt(0);
                char initialCombinationTF2 = name0.charAt(0);
                String lowerCaseTF = selectedCombination5.toLowerCase();
                String usernameTF = lowerCaseTF.replace(' ', '_');
                System.out.println("The initials for " + selectedCombination5 + " is " + intialCombinationTF1 + initialCombinationTF2);
                System.out.println("Suggested username: " + usernameTF);
                System.out.println("---");
                System.out.println("What is your next number?");
                x = userInput.nextInt();
                break;
            case 6: // third + second
                String selectedCombination6 = combinedNames[x - 1];
                char intialCombinationTS1 = name2.charAt(0);
                char initialCombinationTS2 = name1.charAt(0);
                String lowerCaseTS = selectedCombination6.toLowerCase();
                String usernameTS = lowerCaseTS.replace(' ', '_');
                System.out.println("The initials for " + selectedCombination6 + " is " + intialCombinationTS1 + initialCombinationTS2);
                System.out.println("Suggested username: " + usernameTS);
                System.out.println("---");
                System.out.println("What is your next number?");
                x = userInput.nextInt();
                break;
            case 0: // stop loop
                System.out.println("Stopping program!");
                flag = false;
                continue;
            default:
                System.out.println("Invalid choice, please try again:");
                x = userInput.nextInt();
        }
    }
        userInput.close();
    }
}
