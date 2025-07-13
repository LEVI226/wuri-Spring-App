package bf.securitywithjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SecurityWithJwtApplication {

  public static void main(String[] args) {
    SpringApplication.run(SecurityWithJwtApplication.class, args);

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    String rawPassword = "monMotDePasse";
    String encodedPassword = encoder.encode(rawPassword);
    System.out.println("Mot de passe encodé : " + encodedPassword);
  }

}
