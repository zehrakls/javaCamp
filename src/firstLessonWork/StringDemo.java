package firstLessonWork;

public class StringDemo {

    public static void main(String[] args) {
        String message = "The weather is very nice at today.";
        System.out.println(message);

        System.out.println("number of element: " + message.length());
        System.out.println("5th element: " + message.charAt(4));
        System.out.println(message.concat(" Good!"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("."));
        char[] characters = new char[5];
        message.getChars(0, 5, characters, 0);
        System.out.println(characters);
        System.out.println(message.indexOf("ni"));
        System.out.println(message.lastIndexOf("e"));

        String newMassage = message.replace(' ', '-');
        System.out.println(newMassage);
        System.out.println(message.substring(2, 5));

        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
