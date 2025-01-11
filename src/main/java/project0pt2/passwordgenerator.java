package project0pt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class passwordgenerator {
    // atributes
    private int length;
    private int numSpecialChars;
    private int numNumbers;
    private int numLetters;
    private Random rand = new Random();

    // constructor
    public passwordgenerator() {
        // generate random length between 8 and 30
        this.length = rand.nextInt(8,31);
        this.numLetters = rand.nextInt(this.length+1);
        this.numNumbers = rand.nextInt(this.length - this.numLetters + 1);
        this.numSpecialChars = this.length - this.numLetters - this.numNumbers;
    }

    public passwordgenerator(int length, int numSpecialChars, int numNumbers, int numLetters) {
        this.length = length;
        this.numSpecialChars = numSpecialChars;
        this.numNumbers = numNumbers;
        this.numLetters = numLetters;
    }

    // generate password with random letters, numbers, and special characters in random order
    public String generate() {
        StringBuilder password = new StringBuilder();
        List<Character> characters = new ArrayList<>();
        
        for (int i = 0; i < this.numLetters; i++) {
            if (rand.nextBoolean()) {
                characters.add((char) (rand.nextInt(26) + 'A'));
            } else {
                characters.add((char) (rand.nextInt(26) + 'a'));
            }
        }
        for (int i = 0; i < this.numNumbers; i++) {
            characters.add((char) (rand.nextInt(10) + '0'));
        }
        for (int i = 0; i < this.numSpecialChars; i++) {
            characters.add((char) (rand.nextInt(15) + 33));
        }
    
        Collections.shuffle(characters);
        for (char c : characters) {
            password.append(c);
        }
        
        return password.toString();
    }

    // toString method
    public String toString() {
        return "Password: " + this.generate();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNumSpecialChars() {
        return numSpecialChars;
    }

    public void setNumSpecialChars(int numSpecialChars) {
        this.numSpecialChars = numSpecialChars;
    }

    public int getNumNumbers() {
        return numNumbers;
    }

    public void setNumNumbers(int numNumbers) {
        this.numNumbers = numNumbers;
    }

    public int getNumLetters() {
        return numLetters;
    }

    public void setNumLetters(int numLetters) {
        this.numLetters = numLetters;
    }
}
