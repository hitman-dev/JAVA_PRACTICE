package DAY_7_ARRAY_ASSIGNMENT.Q_Q2.com.demo.service;
import DAY_7_ARRAY_ASSIGNMENT.Q_Q2.com.demo.bean.FRIENDS;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FRIENDS_SERVICE{
        static ArrayList<FRIENDS> friendList = new ArrayList<>(10);

        private static void main() {
            FRIENDS friend1 = new FRIENDS("Tony", "Stark", new String[]{"Designing", "coding", "constructing"}, 781985053, "tony@marvel.com", new Date(10 - 2 - 1970), "NYC");
            FRIENDS friend2 = new FRIENDS("Steven", "Strange", new String[]{"magic", "reading", "fighting"}, 853969339, "strange@marvel.com", new Date(25 - 5 - 1968), "london");
            FRIENDS friend3 = new FRIENDS("Thor", "Odinson", new String[]{"eating", "fighting", "flying"}, 679393962, "thunder@marvel.com", new Date(2 - 10 - 1002), "Asgard");
            FRIENDS friend4 = new FRIENDS("Bruce", "Banner", new String[]{"smashing", "reading", "coding"}, 909463636, "bigguy@marvel.com", new Date(12 - 7 - 1989), "Queens");
            FRIENDS friend5 = new FRIENDS("Nick", "Fury", new String[]{"fighting", "planning", "vanishing"}, 939393737, "oneye@marvel.com", new Date(5 - 6 - 1966), "Vegas");
            friendList.add(friend1);
            friendList.add(friend2);
            friendList.add(friend3);
            friendList.add(friend4);
            friendList.add(friend5);
        }

        public static void addFriends() throws ParseException, ParseException {
            Scanner sc = new Scanner(System.in);
            main();
            System.out.print("Want to add a Friend? y/n: ");
            String choice = sc.nextLine();
            while ("y".equals(choice)) {
                System.out.print("Enter Friend's first name: ");
                String fName = sc.nextLine();
                System.out.print("Enter Friend's last name: ");
                String lName = sc.nextLine();
                String[] hobbies = acceptHobbies();
                System.out.print("Enter mobile number: ");
                long mobNo = sc.nextLong();
                System.out.print("Enter email id: ");
                sc.nextLine();
                String email = sc.nextLine();

                System.out.print("Enter DOB as DD-MM-YYYY: ");
                String string = sc.nextLine();
                DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date bDate = format.parse(string);
                System.out.print("Enter Address: ");
                String address = sc.nextLine();
                friendList.add(new FRIENDS(fName, lName, hobbies, mobNo, email, bDate, address));
                System.out.print("Want to add another Friend? y/n: ");
                choice = sc.nextLine();
            }
        }

        public static String[] acceptHobbies() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter hobbies separated by space: ");
            return sc.nextLine().split(" ");
        }

        public static void displayFriends() {
            for (FRIENDS friends : friendList) {
                System.out.print(friends + "\n");
            }
            System.out.println();
        }

        public static void searchById(int id) {
            if (checkIdExist(friendList, id)) {
                System.out.print(friendList.get(id - 1) + "\n\n");
            } else {
                System.out.print("Friend Not Found!!\n\n");
            }

        }

        public static void searchByName(String fName, String lName) {
            if (checkNameExist(friendList, fName, lName)) {
                for (FRIENDS friend : friendList) {
                    if (fName.equals(friend.getfName()) && lName.equals(friend.getlName())) {
                        System.out.println(friend);
                    }
                }
                System.out.println();
            } else {
                System.out.print("Friend Not Found!!\n\n");
            }

        }

        public static void searchByHobby(String hobby) {
            if (checkHobbyExist(friendList, hobby)) {
                for (FRIENDS friend : friendList) {
                    String[] friendHobbies = friend.getHobbies();
                    for (String fHobby : friendHobbies) {
                        if (fHobby.equals(hobby)) {
                            System.out.println(friend);
                        }
                    }
                }
                System.out.println();
            } else {
                System.out.print("Not Found!!\n\n");
            }

        }

        public static boolean checkIdExist(ArrayList<FRIENDS> friendList, int id) {
            for (FRIENDS friend : friendList) {
                if (friend.getId() == (id)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean checkNameExist(ArrayList<FRIENDS> friendList, String fName, String lName) {
            for (FRIENDS friend : friendList) {
                if (friend.getfName().equals(fName) && friend.getlName().equals(lName)) {
                    return true;
                }
            }
            return false;
        }

        public static boolean checkHobbyExist(ArrayList<FRIENDS> friendList, String hobby) {
            for (FRIENDS friend : friendList) {
                String[] friendHobbies = friend.getHobbies();
                for (String fHobby : friendHobbies) {
                    if (fHobby.equals(hobby)) {
                        return true;
                    }
                }
            }
            return false;
        }

    }
