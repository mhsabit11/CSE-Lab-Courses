
import javax.swing.JOptionPane;

class SignUp {
    private static String userName;
    private static String userEmail;

    public static void signUp() {
        while (true) {
            try {
                userName = JOptionPane.showInputDialog("Enter your name:");
                if (userName == null || userName.isEmpty()) throw new Exception("Name cannot be empty!");

                userEmail = JOptionPane.showInputDialog("Enter your email:");
                if (!userEmail.contains("@")) throw new Exception("Email must contain '@'!");

                JOptionPane.showMessageDialog(null, "Welcome to CityCompass, " + userName + "!");
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static String getUserName() {
        return userName;
    }
}