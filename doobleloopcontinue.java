public class doobleloopcontinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               continue;
            }
            System.out.println(i);
        }
    }
    
}
