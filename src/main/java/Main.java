import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter strategy: ");
            String strategyName = scanner.nextLine();
            Class strategyClass = null;
            try {
                strategyClass = Class.forName(strategyName);
                Strategy strategy = (Strategy) strategyClass.newInstance();
                context.setStrategy(strategy);
                context.applyStrategy();
            } catch (Exception e) {
                System.out.println("Erreur: " + e);
            }

        }
    }
}