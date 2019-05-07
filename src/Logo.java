public class Logo {
    private void printLogo(String s, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(s);
        }
    }
    public void printOnConsole(int input) {
        if(verify(input)) {
            int addTwo = 1;
            int removeTwo = (input * 2) - 1;
            for (int i = 0; i < (input + 1) / 2; i++) { // splitting the logo horizontally at the middle

                //Upper left side of M
                printLogo("-", input - i);
                printLogo("*", input + i * 2);
                printLogo("-", input - i * 2);
                printLogo("*", input + i * 2);
                printLogo("-", input - i);
                //Upper right side of M
                printLogo("-", input - i);
                printLogo("*", input + i * 2);
                printLogo("-", input - i * 2);
                printLogo("*", input + i * 2);
                printLogo("-", input - i);
                System.out.println();
            }
            for (int i = (input + 1) / 2; i <= input; i++) {
                //Lower left side of M
                printLogo("-", input - i);
                printLogo("*", input);
                printLogo("-", addTwo);
                printLogo("*", removeTwo);
                printLogo("-", addTwo);
                printLogo("*", input);
                printLogo("-", input - i);
                //Lower right side of M
                printLogo("-", input - i);
                printLogo("*", input);
                printLogo("-", addTwo);
                printLogo("*", removeTwo);
                printLogo("-", addTwo);
                printLogo("*", input);
                printLogo("-", input - i);
                System.out.println();
                addTwo += 2;
                removeTwo -= 2;
            }
        }
    }
    private boolean verify(int input){
        if ((input >= 2 && input <= 10000) && (input % 2 != 0)){
            return true;
        }
        System.out.println("The number doesn't suit the requirements.");
        return false;
    }
}
