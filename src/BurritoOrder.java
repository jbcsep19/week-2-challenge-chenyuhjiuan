
import java.util.*;


public class BurritoOrder {


    // Drive Function
    public static void main(String[] args) {

        //loop for 25 burritos

        for (int i = 1; i < 26; i++) {
            //create arrays for 9 ingredients and randomize each of the ingredient content

            String array1[] = {"white rice", "brown rice", "no rice"};
            Random random = new Random();
            int a = random.nextInt(array1.length);
            String array2[] = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
            int b = random.nextInt(array2.length);
            String array3[] = {"pinto", "black beans", "no beans"};
            int c = random.nextInt(array3.length);
            String array4[] = {"mild salsa", "medium salsa", "hot salsa", "no salsa"};
            int d = random.nextInt(array4.length);
            String array5[] = {"lettuce", "fajita veggies", "no lettuce veggies", "no fajita veggies"};
            int e = random.nextInt(array5.length);
            String array6[] = {"cheese"};
            int f = random.nextInt(array6.length);
            String array7[] = {"guac"};
            int g = random.nextInt(array7.length);
            String array8[] = {"queso"};
            int h = random.nextInt(array8.length);
            String array9[] = {"sour cream"};
            int j = random.nextInt(array9.length);


            // create a list of the above arrays
            List<String> list = new ArrayList<>();
            // add 9 randomized elements in ArrayList
            list.add(array1[a]);
            list.add(array2[b]);
            list.add(array3[c]);
            list.add(array4[d]);
            list.add(array5[e]);
            list.add(array6[f]);
            list.add(array7[g]);
            list.add(array8[h]);
            list.add(array9[j]);

            BurritoOrder obj = new BurritoOrder();

            //random list item numbers among 5 and 9
            int numberOfElements= 5 + random.nextInt(9);;

            //print 25 burritos
            System.out.printf("Burrito " + i + ": ");


            //erase the bracket of the array
            String replacement=obj.getRandomElement(list, numberOfElements).toString().replace("[", "")
                    .replace("]","")
                    .trim();
            //print the burrito order list
            System.out.print(replacement);

            List newlist= obj.getRandomElement(list,numberOfElements);


            if(newlist!=null&&!newlist.isEmpty()&&numberOfElements<10) {

                System.out.printf(" $" + (3 + (0.5 * numberOfElements)) + "");
            }
            //let the loop have a new line
            System.out.println("");

        }
    }

    // Function select an element base on index and return an element


    public List<String> getRandomElement(List<String> list, int totalItems) {


        // create a temporary list for storing selected element

        List<String> newList = new ArrayList<>();

        for (int i = 1; i <= totalItems; i++) {

            // take a random index between 0 to size of given List

            Random rand = new Random();
            if (!list.isEmpty()) {

                int randomIndex = rand.nextInt(list.size());

                newList.add(list.get(randomIndex));

                // if not remove, the selected items will have another selection
                list.remove(randomIndex);


            }

        }

        return newList;
    }

}