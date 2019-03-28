import javax.swing.*;
import java.io.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        DataBase db = new DataBase();
        ArrayList<String> logins = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        ArrayList<String> niknames = new ArrayList<>();
        String psw, lng;

        do {
            psw = "zero";
            lng = "no";
            logins = db.dbInitlogin();
            System.out.println("Input your login");
            String str = sc.nextLine();
            for (String o : logins) {
                if (o.equals(str)) {
                    lng = "yes";
                }
            }

            passwords = db.dbInitPassword();
            System.out.println("Input your password");
            String pass = sc.nextLine();
            for (String o : passwords) {
                if (o.equals(pass)) {
                    psw = "yes";
                }
            }
        } while (!lng.equals(psw));
        System.out.println("Welcome to the chat");
    }
}
