// import java.util.*;

// public class Knapsack {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         List<Integer> profits = new ArrayList<>();
//         List<Integer> weights = new ArrayList<>();
//         List<Integer> match = new ArrayList<>();
//         int objects = scanner.nextInt();

//         System.out.println("Enter weights: ");
//         for (int i = 0; i < objects; i++) {
//             weights.add(scanner.nextInt());
//         }

//         System.out.println("Enter profits: ");
//         for (int i = 0; i < objects; i++) {
//             profits.add(scanner.nextInt());
//         }

//         int capacity = scanner.nextInt();
//         scanner.close();

//         List<Double> ratios = new ArrayList<>();
//         for (int i = 0; i < objects; i++) {
//             ratios.add((double)profits.get(i) / weights.get(i));
//         }

//         int used = 0;
//         double maxp = 0;
//         List<Double> X = new ArrayList<>(Collections.nCopies(objects, 0.0));

//         List<Integer> sortedIndices = new ArrayList<>();
//         for (int i = 0; i < objects; i++) {
//             sortedIndices.add(i);
//         }
//         Collections.sort(sortedIndices, (a, b) -> Double.compare(ratios.get(b), ratios.get(a)));

//         for (int i : sortedIndices) {
//             if (used + weights.get(i) <= capacity) {
//                 X.set(i, 1.0);
//                 used += weights.get(i);
//                 maxp += profits.get(i);
//             } else {
//                 int remaining = capacity - used;
//                 double fraction = (double)remaining / weights.get(i);
//                 X.set(i, fraction);
//                 used += remaining;
//                 maxp += fraction * profits.get(i);
//                 break;
//             }
//         }

//         for (int i = 0; i < objects; i++) {
//             for (int j = 0; j < objects; j++) {
//                 if (X.get(i) != 0.0 && X.get(i) == 1.0 && weights.get(i) == weights.get(j) && profits.get(i) == profits.get(j)) {
//                     match.add(j);
//                 }
//             }
//         }

//         System.out.println("Maximum profit: " + maxp);
//         System.out.println("Fractions: " + X);
//         System.out.println("Object index: " + match);
//     }
// }
import java.util.*;

public class Knapsack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> profits = new ArrayList<>();
        List<Integer> weights = new ArrayList<>();
        List<Integer> match = new ArrayList<>();
        
        System.out.print("Enter the number of objects: ");
        int objects = scanner.nextInt();

        System.out.println("Enter the weight of each object: ");
        for (int i = 0; i < objects; i++) {
            weights.add(scanner.nextInt());
        }

        System.out.println("Enter the profit of each object: ");
        for (int i = 0; i < objects; i++) {
            profits.add(scanner.nextInt());
        }

        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = scanner.nextInt();
        scanner.close();

        List<Double> ratios = new ArrayList<>();
        for (int i = 0; i < objects; i++) {
            ratios.add((double)profits.get(i) / weights.get(i));
        }

        int used = 0;
        double maxp = 0;
        List<Double> X = new ArrayList<>(Collections.nCopies(objects, 0.0));

        List<Integer> sortedIndices = new ArrayList<>();
        for (int i = 0; i < objects; i++) {
            sortedIndices.add(i);
        }
        Collections.sort(sortedIndices, (a, b) -> Double.compare(ratios.get(b), ratios.get(a)));

        for (int i : sortedIndices) {
            if (used + weights.get(i) <= capacity) {
                X.set(i, 1.0);
                used += weights.get(i);
                maxp += profits.get(i);
            } else {
                int remaining = capacity - used;
                double fraction = (double)remaining / weights.get(i);
                X.set(i, fraction);
                used += remaining;
                maxp += fraction * profits.get(i);
                break;
            }
        }

        for (int i = 0; i < objects; i++) {
            for (int j = 0; j < objects; j++) {
                if (X.get(i) != 0.0 && X.get(i) == 1.0 && weights.get(i) == weights.get(j) && profits.get(i) == profits.get(j)) {
                    match.add(j);
                }
            }
        }

        System.out.println("Maximum profit: " + maxp);
        System.out.println("Fractions: " + X);
        System.out.println("Object index: " + match);
    }
}
