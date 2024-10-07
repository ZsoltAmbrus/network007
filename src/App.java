/*
* File: App.java
* Author: Ambrus Zsolt
* Copyright: 2024, Ambrus Zsolt
* Group: Szoft II/I/N
* Date: 2024-10-06
* Github: https://github.com/ZsoltAmbrus
* Licenc: GNU GPL
*/
public class App {
    public static void main(String[] args) throws Exception {
        ConnectionManager manager = new ConnectionManager();
        manager.Connection("Network");
        manager.NoConnection();
    }
}