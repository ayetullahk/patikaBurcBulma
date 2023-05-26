package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum ayınız :");
        month = inp.nextInt();

        System.out.print("Doğum gününüz :");
        day = inp.nextInt();

        if (month == 1) {
            if (day >= 22 && day <= 31) {
                burc = "kova";
            } else {
                burc = "oğlak";
            }
        } else {
            isError = true;
        }
        if (month == 2) {
            if (day >= 20 && day <= 29) {
                burc = "balık";
            } else {
                burc = "kova";
            }
        } else {
            isError = true;
        }
        if (month == 3) {
            if (day >= 21 && day <= 31) {
                burc = "koç";
            } else {
                burc = "balık";
            }
        } else {
            isError = true;
        }
        if (month == 4) {
            if (day >= 21 && day <= 31) {
                burc = "boğa";
            } else {
                burc = "koç";
            }
        } else {
            isError = true;
        }
        if (month == 5) {
            if (day >= 22 && day <= 31) {
                burc = "ikizler";
            } else {
                burc = "boğa";
            }
        } else {
            isError = true;
        }
        if (month == 6) {
            if (day >= 23 && day <= 31) {
                burc = "yengeç";
            } else {
                burc = "ikizler";
            }
        } else {
            isError = true;
        }
        if (month == 7) {
            if (day >= 23 && day <= 31) {
                burc = "aslan";
            } else {
                burc = "yengeç";
            }
        } else {
            isError = true;
        }
        if (month == 8) {
            if (day >= 23 && day <= 31) {
                burc = "başak";
            } else {
                burc = "aslan";
            }
        } else {
            isError = true;
        }
        if (month == 9) {
            if (day >= 23 && day <= 31) {
                burc = "terazi";
            } else {
                burc = "başak";
            }
        } else {
            isError = true;
        }
        if (month == 10) {
            if (day >= 23 && day <= 31) {
                burc = "akrep";
            } else {
                burc = "terazi";
            }
        } else {
            isError = true;
        }
        if (month == 11) {
            if (day >= 22 && day <= 31) {
                burc = "yay";
            } else {
                burc = "akrep";
            }
        } else {
            isError = true;
        }
        if (month == 12) {
            if (day >= 22 && day <= 31) {
                burc = "oğlak";
            } else {
                burc = "yay";
            }
        } else {
            isError = true;
        }
        if (month >= 13) {
            isError = true;
        }
        if (isError) {
            System.out.println("Hatalı giriş yaptınız");
        } else {
            System.out.println("Burcunuz :" + burc);
        }
    }
}