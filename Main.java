import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String firstRomanNumber = scanner.next();
        String sign = scanner.next();
        String secondRomanNumber = scanner.next();
        String uselessInput = scanner.nextLine();
        if (!uselessInput.isEmpty()) {
            throw new Exception("Wrong input");
        }
        scanner.close();
        List<String> romana = new ArrayList<>(Arrays.asList("I","II", "III", "IV", "V", "VI", "VII", "VII", "IX", "X"));
        List<String> arabic = new ArrayList<>(Arrays.asList("1","2", "3", "4", "5", "6", "7", "8", "9", "10"));
        int rezult = 0;
        boolean isRoman;
        if (romana.contains(firstRomanNumber) && romana.contains(secondRomanNumber)) {
            isRoman = true;
        } else if(arabic.contains(firstRomanNumber) && arabic.contains(secondRomanNumber)) {
            isRoman = false;
        } else {
            throw new Exception("Wrong input");
        }
        int firstNumber;
        int secondNumber;
        String result = "";
        if (isRoman) {
            firstNumber = RomanNumbers.romanToArabic(firstRomanNumber);
            secondNumber = RomanNumbers.romanToArabic(secondRomanNumber);
        } else {
            firstNumber = Integer.parseInt(firstRomanNumber);
            secondNumber = Integer.parseInt(secondRomanNumber);
        }
            switch (sign) {
                case ("+"):
                    rezult = firstNumber + secondNumber;
                    break;
                case ("-"):
                    rezult = firstNumber - secondNumber;
                    break;
                case ("*"):
                    rezult = firstNumber * secondNumber;
                    break;
                case ("/"):
                    rezult = firstNumber / secondNumber;
                    break;
                default:
                    throw new Exception("Wrong sign");
            }
        if (isRoman) {
            result = RomanNumbers.arabicToRoman(rezult);
        } else {
            result += rezult;
        }
        System.out.println(result);
        }
    }

