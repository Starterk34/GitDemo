public class HW_Arrays_5 {
    public static void main (String[] args){
        String[] forms = new String[]{"round", "elongated", "round", "elongated", "drop-shaped", "round", "square", "drop-shaped", "round", "square"};
        String[] color = new String[]{"green", "yellow", "yellow", "red", "green", "red", "red", "yellow", "black", "yellow"};
        for (int i=0; i<forms.length;i++ ){
            if (forms[i].equalsIgnoreCase("round") == true && (color[i].equalsIgnoreCase("green") == true || color[i].equalsIgnoreCase("red") == true || color[i].equalsIgnoreCase("yellow") == true) ){
                System.out.println((i+1) + " fruit is an apple!");
            }
            else if (forms[i].equalsIgnoreCase("elongated") == true && color[i].equalsIgnoreCase("yellow")){
                System.out.println((i+1) + " fruit is a banana!");
            }
            else if (forms[i].equalsIgnoreCase("drop-shaped") && (color[i].equalsIgnoreCase("green") == true || color[i].equalsIgnoreCase("red") == true || color[i].equalsIgnoreCase("yellow") == true)){
                System.out.println((i+1) + " fruit is a pear!");
            }
            else {
                System.out.println("I don't know such fruit.");
            }

        }
    }
}
