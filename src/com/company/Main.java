package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "sousage", 3, "white");
        double prize = hamburger.prizeHam();
        hamburger.addHamburgeradd1("tomato", 0.5);
        hamburger.addHamburgeradd2("onions", 0.5);
        prize = hamburger.prizeHam();
        System.out.println("total price is " + prize);

        HealthyBurger healthy = new HealthyBurger("bacon", 4.5);
        healthy.addHealtAddition1("rucola", 1);
        healthy.addHealtAddition2("carrot", 21);
        System.out.println("total price is " + healthy.prizeHam());

        DeluxeHamburger deluxe = new DeluxeHamburger();
        deluxe.addHamburgeradd3("denied acces", 9999);
        deluxe.prizeHam();
        MegaBytesConverter.printMegaBytesAndKiloBytes(1025);
        BarkingDog.bark(true, 24);
        //LeapYear.isLapYear(2018);
        EqualSumChecker.hasEqualSum(1, -1, 2);
        PlayingCat.isCatPlaying(false, 36);
        NumberPalindrome.isPalindrome(11);
        FirstLastDigitSum.sumFirstAndLastDigit(-222);
        SharedDigit.hasSharedDigit(12, 3);
        NumberToWords.numberToWords(10);
        LargestPrime.getLargestPrime(217);
        DiagonalStar.printSquareStar(5);
    }

}

//1
class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int MB = 1024;
        int printMB;
        int changeMB;
        printMB = kiloBytes / MB;
        changeMB = kiloBytes - (printMB * MB);
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + printMB + " MB and " + changeMB + " KB");
        }
    }
}

//2
class BarkingDog {
    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23 || barking == false) {
            return false;
        } else if (hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else return false;

    }
}

//3
class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0 & year % 100 != 0 | year % 400 == 0) {
            return true;
        } else return false;
    }
}

//4
class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        one = one * 1000;
        two = two * 1000;
        int on = (int) one;
        int tw = (int) two;
        if ((on) == (tw)) {
            return true;
        } else return false;

    }
}

//5
class EqualSumChecker {
    public static boolean hasEqualSum(int one, int two, int three) {
        if (one + two == three) {
            return true;
        } else {
            return false;
        }
    }

}

//6
class TeenNumberChecker {
    public static boolean hasTeen(int one, int two, int three) {
        if (one >= 13 & one <= 19 | two >= 13 & two <= 19 | three >= 13 & three <= 19) {
            return true;
        } else return false;
    }
}

/////////////////////////////7
class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            double c;
            c = radius * radius * 3.14159;
            return c;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 | y < 0) {
            return -1;
        }
        double z;
        z = x * y;
        return z;
    }
}

//8
class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int days;
            days = ((int) minutes / 60) / 24;
            int years;
            years = days / 365;
            int resultdays;
            resultdays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + resultdays + " d");
        }
    }
}

//9
class IntEqualityPrinter {
    public static void printEqual(int x, int y, int z) {
        if (x < 0 | y < 0 | z < 0) {
            System.out.println("Invalid Value");
        }
        if (x == y & x == z & z == y) {
            System.out.println("All numbers are equal");
        } else if (x != y & x != z & z != y) {
            System.out.println("All numbers are diffrent");
        } else System.out.println("Neither all are equal or diffrent");
    }
}

//10
class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temerature) {
        if (summer) {
            if (temerature >= 25 & temerature <= 45) {
                return true;
            } else return false;
        } else if (temerature >= 25 & temerature <= 35) {
            return true;
        } else return false;
    }
}

//11
class NumberInWord {
    public static void printNumberInWord(int number) {
        if (number == 0) {
            System.out.println("ZERO");
        } else if (number == 1) {
            System.out.println("ONE");
        } else if (number == 2) {
            System.out.println("TWO");
        } else if (number == 3) {
            System.out.println("THREE");
        } else if (number == 4) {
            System.out.println("FOUR");
        } else if (number == 5) {
            System.out.println("FIVE");
        } else if (number == 6) {
            System.out.println("SIX");
        } else if (number == 7) {
            System.out.println("SEVEN");
        } else if (number == 8) {
            System.out.println("EIGHT");
        } else if (number == 9) {
            System.out.println("NINE");
        } else System.out.println("OTHER");
    }
}

//12
class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year > 9999 | year < 1) {
            return false;
        } else if (year % 4 == 0 & year % 100 != 0 | year % 400 == 0) {
            return true;
        } else return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 | month > 12) {
            return -1;
        } else if (year > 9999 | year < 1) {
            return -1;
        } else {
            switch (month) {
                case 1:
                    return 31;
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    } else return 28;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
                default:
                    return -1;
            }
        }
    }
}

//13
class SumOddRange {
    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 == 1) {
                return true;
            } else return false;
        } else return false;
    }

    public static int sumOdd(int start, int end) {
        int suma = 0;
        if (start > end | start < 0 | end < 0) {
            return -1;
        }
        for (; end >= start; start++) {
            if (isOdd(start)) {
                suma = suma + start;
            }
        }
        return suma;
    }
}

//14
class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;
        while (number != 0 | number > 0) {
            int last = number % 10;
            reverse = reverse * 10;
            reverse = reverse + last;
            number = number / 10;
        }
        if (num == reverse) {
            return true;
        } else return false;
    }


}

//15
class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        // if (number / 10 == 0) {
        //     return 2 * number;
        // }
        int x = number;
        int reverse = 0;
        int num = number % 10;
        int last = 0;
        while (number != 0) {
            last = number % 10;
            reverse = reverse * 10;
            reverse = reverse + last;
            number = number / 10;
        }
        if (x < 0) {
            return -1;
        } else {
            return (last % 10 + num % 10);
        }
    }
}

//16
class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int reverse = 0;
        int num = number;
        int suma = 0;
        while (number != 0 | number > 0) {
            int last = number % 10;
            if (last % 2 == 0) {
                suma = suma + last;
            }
            reverse = reverse * 10;
            reverse = reverse + last;
            number = number / 10;
        }
        return suma;
    }
}

//17
class SharedDigit {
    public static boolean hasSharedDigit(int x, int y) {
        int lx = x % 10;
        int lxx = x / 10;
        int ly = y % 10;
        int lyy = y / 10;
        if (x < 10 | x > 99 | y < 10 | y > 99) {
            return false;
        } else if (((lx == ly) || (lx == lyy)) || ((lxx == ly) || (lxx == lyy))) {
            return true;
        }
        return false;
    }
}

//18
class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z) {
        int a = x % 10;
        int b = y % 10;
        int c = z % 10;
        if (x > 1000 | x < 10 | z > 1000 | z < 10 | y > 1000 | y < 10) {
            return false;
        } else {
            if ((a == b | a == c) | (b == c | b == a)) {
                return true;
            }

        }
        return false;
    }
}

//19
class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 | second < 10) {
            return -1;
        }
        int dzielnik = 1;
        int maxdzielnik = 1;
        while (dzielnik <= first || dzielnik <= second) {
            if (first % dzielnik == 0 && second % dzielnik == 0) {
                maxdzielnik = dzielnik;
            }
            dzielnik++;
        }
        return maxdzielnik;
    }
}

//20
class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}

//21
class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int suma = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == number) {
            return true;
        } else return false;

    }
}

//22
class NumberToWords {
    public static int getDigitCount(int number) {
        int count = 0;
        int copyOfDigit = number;
        if (number < 0)
            return -1;
        do {
            count++;
            copyOfDigit /= 10;
        } while (copyOfDigit != 0);

        return count;
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0 | number > 0) {
            int last = number % 10;
            reverse = reverse * 10;
            reverse = reverse + last;
            number = number / 10;
        }
        if (number < 0) {
            return reverse * (-1);
        } else return reverse;
    }

    public static void numberToWords(int number) {
        int num = reverse(number);
        int reverse = 0;
        boolean tak = true;
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int liczba = getDigitCount(number);
        for (int i = 0; i < liczba; i++) {
            int last = num % 10;
            reverse = reverse * 10;
            reverse = reverse + last;
            num = num / 10;
            switch (last) {
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


            }
        }
    }
}

//23
class FlourPacker {
    public boolean canPack(int bigCount, int smallCount, int goal) {
        if (((bigCount * 5) + smallCount) - goal < 0) {
            return false;
        }
        for (int i = 1; i <= bigCount; i++) {
            goal = goal - 5;
            if (goal < 0) {
                return false;
            }
            if (goal < 5) {
                break;
            }
        }
        return (goal <= smallCount);
    }
}

//24
class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }
        int largestPrime;
        int divisor = number / 2;
        while (divisor >= 1) {
            if (number % divisor == 0) {
                if (isPrime(divisor)) {
                    return divisor;
                }
            }
            divisor--;
        }

        return 1;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//25
class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (j == 1 || j == number || i == 1 || i == number ||
                            i == j || j == (number - i + 1)) {
                        System.out.print("*");
                    } else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}