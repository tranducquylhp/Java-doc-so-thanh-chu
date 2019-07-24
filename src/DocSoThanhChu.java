import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else if (number >= 0 && number <= 20) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
            }
        } else if (number > 10 && number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelfth");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fiveteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (number >= 20 && number <= 99) {
            int ones = number % 10;
            int tens = (number - ones) / 10;
            String str = "";

            switch (tens) {
                case 2:
                    str += "Twenty ";
                    break;
                case 3:
                    str += "Thirty ";
                    break;
                case 4:
                    str += "Fourty ";
                    break;
                case 5:
                    str += "Fivety ";
                    break;
                case 6:
                    str += "Sixty ";
                    break;
                case 7:
                    str += "Seventy ";
                    break;
                case 8:
                    str += "Eighty ";
                    break;
                case 9:
                    str += "Ninety ";
                    break;
            }

            switch (ones) {
                case 0:
                    str += "zero";
                    break;
                case 1:
                    str += "one";
                    break;
                case 2:
                    str += "two";
                    break;
                case 3:
                    str += "three";
                    break;
                case 4:
                    str += "four";
                    break;
                case 5:
                    str += "five";
                    break;
                case 6:
                    str += "six";
                    break;
                case 7:
                    str += "seven";
                    break;
                case 8:
                    str += "eight";
                    break;
                case 9:
                    str += "nine";
                    break;
            }

            System.out.println(str);
        } else {
            int ones = number % 10;
            int tens = (number - ones) / 10 % 10;
            int hundreds = (number - ones - tens * 10) / 100;

            String str = "";

            switch (hundreds) {
                case 1:
                    str += "One";
                    break;
                case 2:
                    str += "Two";
                    break;
                case 3:
                    str += "Three";
                    break;
                case 4:
                    str += "Four";
                    break;
                case 5:
                    str += "Five";
                    break;
                case 6:
                    str += "Six";
                    break;
                case 7:
                    str += "Seven";
                    break;
                case 8:
                    str += "Eight";
                    break;
                case 9:
                    str += "Nine";
                    break;
            }

            str += " hundred ";

            switch (tens) {
                case 1:
                    switch (ones) {
                        case 0:
                            str += "ten";
                            break;
                        case 1:
                            str += "eleven";
                            break;
                        case 2:
                            str += "twelfth";
                            break;
                        case 3:
                            str += "thirteen";
                            break;
                        case 4:
                            str += "fourteen";
                            break;
                        case 5:
                            str += "fiveteen";
                            break;
                        case 6:
                            str += "sixteen";
                            break;
                        case 7:
                            str += "seventeen";
                            break;
                        case 8:
                            str += "eighteen";
                            break;
                        case 9:
                            str += "nineteen";
                            break;
                    }
                    break;
                case 2:
                    str += "twenty ";
                    break;
                case 3:
                    str += "thirty ";
                    break;
                case 4:
                    str += "fourty ";
                    break;
                case 5:
                    str += "fivety ";
                    break;
                case 6:
                    str += "sixty ";
                    break;
                case 7:
                    str += "seventy ";
                    break;
                case 8:
                    str += "eighty ";
                    break;
                case 9:
                    str += "ninety ";
                    break;
            }
            if (tens != 1) {
                switch (ones) {
                    case 0:
                        str += "zero";
                        break;
                    case 1:
                        str += "one";
                        break;
                    case 2:
                        str += "two";
                        break;
                    case 3:
                        str += "three";
                        break;
                    case 4:
                        str += "four";
                        break;
                    case 5:
                        str += "five";
                        break;
                    case 6:
                        str += "six";
                        break;
                    case 7:
                        str += "seven";
                        break;
                    case 8:
                        str += "eight";
                        break;
                    case 9:
                        str += "nine";
                        break;
                }
            }
            System.out.println(str);
        }
    }
}
