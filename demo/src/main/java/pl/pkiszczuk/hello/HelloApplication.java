package pl.pkiszczuk.hello; // Group (pakiet) zdefiniowany w generatorze + Artifact

// wykorzystywane zależności
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // adnotacja wskazująca, że jest to aplikacja Spring Boot
public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args); // uruchomienie aplikacji
    }
}