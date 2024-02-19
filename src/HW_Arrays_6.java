public class HW_Arrays_6 {
    public static void main (String[] args){
        String[] surnames = new String[] {"Nescheret", "Vivcharenko", "Syrota", "Diachuk", "Tymchyk", "Sydorchuk", "Andriievskyi", "Voloshyn", "Buialskyi", "Vanat"};
        String[] names = new String[] {"Ruslan", "Kostiantyn", "Oleksandr", "Maksym", "Oleksandr", "Serhii", "Oleksandr", "Nazar", "Vitalii", "Vladyslav"};
        int max = 0;
        int a = 0;
        for (int i=0; i<names.length;i++){
            if ((names[i].length()+surnames[i].length())>max){
                max = names[i].length()+surnames[i].length();
                a = i;
            }
        }
        System.out.println("The longest name and surname in Dynamo Kyiv squad has " + names[a] + " " + surnames[a] + " (" + max + ").");
        System.out.println("Checking GIT2");
        System.out.println("Checking GIT3");
        System.out.println("Checking GIT4");

    }
}
