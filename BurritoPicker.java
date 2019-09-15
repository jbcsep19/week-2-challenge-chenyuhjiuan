import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BurritoPicker {
    public static void main(String[] args) {

        //loop for 25 burritos
        for (int i = 1; i < 26; i++) {

            //create arrays for each of the 9 ingredients and randomize item in an ingredient category
            Random random = new Random();

            String array1[] = {"no rice", "white rice", "brown rice"};

            int a = random.nextInt(array1.length);

            String array2[] = {"no meat", "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};

            int b = random.nextInt(array2.length);

            String array3[] = {"no beans", "pinto", "black beans"};

            int c = random.nextInt(array3.length);

            String array4[] = {"no salsa", "mild salsa", "medium salsa", "hot salsa"};

            int d = random.nextInt(array4.length);

            String array5[] = {"no fajita veggies", "lettuce", "fajita veggies", "no lettuce veggies" };

            int e = random.nextInt(array5.length);

            String array6[] = {"no cheese", "cheese" };

            int f = random.nextInt(array6.length);

            String array7[] = {"no guac", "guac" };

            int g = random.nextInt(array7.length);

            String array8[] = {"no queso", "queso"};

            int h = random.nextInt(array8.length);

            String array9[] = {"no sourcream", "sour cream" };

            int j = random.nextInt(array9.length);

            // create a list of the above arrays

            List<String> list = new ArrayList<>();

            // add 9 randomized ingredients in a List by order

            list.add(array1[a]);

            list.add(array2[b]);

            list.add(array3[c]);

            list.add(array4[d]);

            list.add(array5[e]);

            list.add(array6[f]);

            list.add(array7[g]);

            list.add(array8[h]);

            list.add(array9[j]);


            BurritoPicker obj = new BurritoPicker();

            //randomize item numbers among 5 and 9 in the list

            int numberOfElements= 5 + random.nextInt(5);;

            //print 25 burritos

            System.out.printf("Burrito " + i + ": ");

            //pick the ingredient list by using getRandomElement method
            //which picks 5 to 9 ingredients in a list randomly
            List ingredientlist =obj.getRandomElement(list, numberOfElements)   ;


            //convert ingredientlist to a string array for finding the "no " string

            String[] ingredientString = new String[ingredientlist.size()];

            ingredientlist.toArray(ingredientString);
            //find the "no " string by looping the ingredientString array
            //if it is, minus one on numberOfElements

            for (String ingredient : ingredientString) {

                if (ingredient.substring(0,3).equals("no "))

                    numberOfElements--;
            }

            //erase the bracket
            String nobracket =ingredientlist.toString().replace("[", "")

                    .replace("]","")

                    .trim();

            //print the burrito ingredient list

            System.out.print(nobracket);

            //print the price
            System.out.printf(" $" + (3 + (0.5 * numberOfElements)) + "");

            //let the loop have a new line
            System.out.println("");

        }
    }

    // Function select several ingredients based on index and return several ingredients list

    public List<String> getRandomElement(List<String> list, int totalItems) {

        // create a temporary list for storing selected ingredient

        List<String> newList = new ArrayList<>();

        for (int i = 1; i <= totalItems; i++) {

            // take a random index between 0 to size of the given List
            //randomly pick one ingredient and continue the loop to pick the next ingredient until looping totalItems times
            //which is the total of the selected ingredients
            Random rand = new Random();
            if (!list.isEmpty()) {

                int randomIndex = rand.nextInt(list.size());

                newList.add(list.get(randomIndex));
                // if not remove, the selected items will be selected in the next loop

                list.remove(randomIndex);

            }

        }
        return newList;
    }
    }




