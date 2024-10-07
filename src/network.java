/*
* File: network.java
* Author: Ambrus Zsolt
* Copyright: 2024, Ambrus Zsolt
* Group: Szoft II/I/N
* Date: 2024-10-06
* Github: https://github.com/ZsoltAmbrus
* Licenc: GNU GPL
*/
class ConnectionManager {
    public void Connection(String networkName) {
        System.out.println("Connecting " + networkName + "...");
    }
    public void NoConnection() {
        System.out.println("Disconnecting..");
    }
}