public class ZlaTablicaException extends Exception {
    public ZlaTablicaException(String elementy) {
        super("Tablica nie spelnia wymagan , bledy na pozycjach " + elementy);
    }
}
