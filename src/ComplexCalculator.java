import menu.UserMenu;
import logger.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComplexCalculator {
    private static final Logger log = Log.log(ComplexCalculator.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Calculator starting...");
        UserMenu menu = new UserMenu();
        menu.userMenu();
    }
}
