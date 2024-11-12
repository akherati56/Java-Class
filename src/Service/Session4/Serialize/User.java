package Service.Session4.Serialize;

import Model.Session1.BankAccount;
import Service.Session4.File.Exceptions.CantOpenFileException;
import Service.Session4.File.FileUtility;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User implements Serializable {
    transient String Password;
    transient String CardNumber;
    String UserName;
    List<BankAccount> bk ;

    /** test how to write document in java
     *
     * @param password
     * @param cardNumber
     * @param userName
     */
    public User(String password, String cardNumber, String userName) {
        Password = password;
        CardNumber = cardNumber;
        UserName = userName;
        this.bk = new ArrayList<BankAccount>();
        bk.add(new BankAccount(5421.0));
    }

    public boolean serialize(){
        try (FileOutputStream fileOut = new FileOutputStream("User.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(this);
            System.out.println("Object serialized to person.ser");
        } catch (IOException e) {
            System.err.println("Serialization error: " + e.getMessage());
        }
        return false;
    }

    public User deserialize() throws CantOpenFileException {
        try (FileInputStream fileIn = new FileInputStream("User.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            User user = (User) in.readObject();
            return user;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization error: " + e.getMessage());
        }
        return null;
    }

    @Override
    public String toString() {
        return "User{" +
                "Password='" + Password + '\'' +
                ", CardNumber='" + CardNumber + '\'' +
                ", UserName='" + UserName + '\'' +
                ", bk=" + bk +
                '}';
    }
}
