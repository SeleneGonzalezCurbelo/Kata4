package test;

import model.Mail;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MailTest {
    @Test
    public void testIsEmail() {
        Mail mail = new Mail("user@example.com");
        assertTrue(mail.isEmail());
        
        mail = new Mail("user@example.");
        assertFalse(mail.isEmail());
        
        mail = new Mail("user@");
        assertFalse(mail.isEmail());
        
        mail = new Mail("user@.com");
        assertFalse(mail.isEmail());
        
        mail = new Mail("@example.com");
        assertFalse(mail.isEmail());
    }
}