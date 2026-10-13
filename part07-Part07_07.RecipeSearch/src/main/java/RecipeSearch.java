
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        ArrayList<Recipe> recipes = readRecipes(fileName);

        System.out.println();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println();
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                printRecipes(recipes);
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();

                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(word)) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.parseInt(scanner.nextLine());

                for (Recipe recipe : recipes) {
                    if (recipe.getCookingTime() <= maxTime) {
                        System.out.println(recipe);
                    }
                }
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();

                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(ingredient)) {
                        System.out.println(recipe);
                    }
                }
            }
        }
    }

    public static ArrayList<Recipe> readRecipes(String fileName) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();

                if (name.isEmpty()) {
                    continue;
                }

                int cookingTime = Integer.parseInt(fileScanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (fileScanner.hasNextLine()) {
                    String ingredient = fileScanner.nextLine();

                    if (ingredient.isEmpty()) {
                        break;
                    }

                    ingredients.add(ingredient);
                }

                recipes.add(new Recipe(name, cookingTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return recipes;
    }

    public static void printRecipes(ArrayList<Recipe> recipes) {
        System.out.println();
        System.out.println("Recipes:");

        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
}
