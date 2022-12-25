public class Main {
    public static void main(String[] args) {

        wrapperList list = new wrapperList();
        list.addCascade("mail.host.protocol");
        list.addCascade("mail.host.url");
        list.addCascade("mail.host.url.port");
        list.addCascade("mail.username");
        list.printList();
    }
}