package firstLessonWork;

public class VowelLettersDemo {

    public static void main(String[] args) {
        char character = 'A';
        switch (character) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("bold vowel");
                break;
            default:
                System.out.println("thin vowel");
        }

    }
}
