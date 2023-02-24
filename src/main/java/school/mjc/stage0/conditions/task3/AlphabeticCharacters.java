package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            //english letter
            if (character == 'a' || character == 'A' || character == 'o' || character == 'O' || character == 'e' ||
                    character == 'E' || character == 'u' || character == 'U' || character == 'i' || character == 'I')
                        System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }
        else
            System.out.println("wrong alphabet!");
    }
}
