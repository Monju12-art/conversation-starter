import javax.swing.*;
import java.util.Random;

public class randomNumbers {
    public static void main(String[] args) {
        // Array of options for the user to choose from
        String[] options = {"Motivational quotes", "Tell me something I don't know", "Bible verses"};

        // Show the option dialog and capture the user's choice
        int choice = JOptionPane.showOptionDialog(
                null,
                "Choose from these options:",
                "Conversation Starter",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        // Ensure the user didn't cancel
        if (choice != -1) {
            // Check user choice and call appropriate method
            if (choice == 0) { // Motivational quotes
                MotivationQuotes();
            } else if (choice == 1) { // Something you don't know
                SomethingIDoNotKnow();
            } else if (choice == 2) { // Bible verses
                RandomBibleVerse();
            }
        } else {
            // User cancelled the dialog
            JOptionPane.showMessageDialog(null, "User cancelled");
        }
    }

    // Method to show a random motivational quote
    public static void MotivationQuotes() {
        String[] motivations = {
                "The only way to do great work is to love what you do.",
                "Success is not the key to happiness. Happiness is the key to success.",
                "If you love what you are doing, you will be successful.",
                "Believe you can and you're halfway there.",
                "Your limitation—it's only your imagination.",
                "Don't watch the clock; do what it does. Keep going.",
                "Do you, the world will adjust."
        };

        // Generate a random index and display a random motivational quote
        Random random = new Random();
        int randomIndex = random.nextInt(motivations.length);
        JOptionPane.showMessageDialog(null, motivations[randomIndex]);
    }

    // Method to show a random Bible verse
    public static void RandomBibleVerse() {
        String[] bibleVerses = {
                "For God so loved the world that he gave his one and only Son. (John 3:16)",
                "Love is patient, love is kind. (1 Corinthians 13:4)",
                "Do not be anxious about anything. (Philippians 4:6)",
                "God is our refuge and strength. (Psalm 46:1)",
                "You are the light of the world. (Matthew 5:14)",
                "Trust in the Lord with all your heart. (Proverbs 3:5)",
                "I can do all things through Christ who strengthens me. (Philippians 4:13)",
                "The Lord will fulfill his purpose for me. (Psalm 138:8)",
                "Fear not, for I am with you. (Isaiah 41:10)",
                "Come to me, all you who are weary. (Matthew 11:28)"
        };

        // Generate a random index and display a random Bible verse
        Random random = new Random();
        int randomIndex = random.nextInt(bibleVerses.length);
        JOptionPane.showMessageDialog(null, bibleVerses[randomIndex]);
    }

    // Method to show a random fact
    public static void SomethingIDoNotKnow() {
        String[] somethingNew = {
                "Humans share 50% DNA with bananas.",
                "The shortest war in history lasted for 38 days.",
                "The average person checks their phone 150 times a day.",
                "The world's most expensive phone is the Falcon Supernova iPhone 6, costing $48.5 million.",
                "You can lead a cow upstairs but not downstairs."
        };

        // Generate a random index and display a random fact
        Random random = new Random();
        int randomIndex = random.nextInt(somethingNew.length);
        JOptionPane.showMessageDialog(null, somethingNew[randomIndex]);
    }
}
