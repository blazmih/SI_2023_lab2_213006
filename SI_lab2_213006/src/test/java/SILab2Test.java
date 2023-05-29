import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SILab2Test {
private List<User> createlist(User...users){
    return new ArrayList<>(Arrays.asList(users));
}
@Test
    void function()
{
    RuntimeException ex;
    ex=Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
    Assertions.assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    Assertions.assertEquals(true, SILab2.function(new User("mia", "lala1234!!", "mia@gmail.com")
            , createlist(new User("ema", "pass111!!", "ema@gmail.com"))));
    Assertions.assertEquals(false, SILab2.function(new User(null, "lala", "ema@gmail.com")
            , createlist(new User("ema", "pass111!!", "ema@gmail.com"))));
    Assertions.assertEquals(false, SILab2.function(new User("ema", "lala1234 !!", "mia@gmail.com")
            , createlist(new User("ema", "pass111!!", "ema@gmail.com"))));
    Assertions.assertEquals(false, SILab2.function(new User("mia", "lala1234444", "miagmailcom")
            , createlist(new User("ema", "pass111!!", "ema@gmail.com"))));
}
@Test
    void functionMC()
{
    RuntimeException ex;
    ex=Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
    Assertions.assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    ex=Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(new User("mia", null, "mia@gmail.com"), null));
    Assertions.assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    ex=Assertions.assertThrows(RuntimeException.class, () -> SILab2.function(new User("mia", "lala1234!!", null), null));
    Assertions.assertTrue(ex.getMessage().contains("Mandatory information missing!"));
    Assertions.assertEquals(true, SILab2.function(new User("mia", "lala1234!!", "mia@gmail.com")
            , createlist(new User("ema", "pass111!!", "ema@gmail.com"))));
}
}
