package Service;

import dto.EmailBookDto;

public class MailService {

    public static void sendMail(EmailBookDto emailBookD) {
        System.out.println("Sending mail to " + emailBookD.getEmail() + "for book "+emailBookD.getIsbn()
        +" with type "+emailBookD.getFileType());
    }
}
