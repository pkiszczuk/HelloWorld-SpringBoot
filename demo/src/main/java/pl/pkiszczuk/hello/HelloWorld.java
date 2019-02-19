package pl.pkiszczuk.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // rodzaj beana (typu klasy zarządzanej przez Spring)
public class HelloWorld { // nazwa klasy

    @RequestMapping("/helloworld") // wskazanie pod jakim adresem dostępna jest metoda
    public String hello() { // sygnatura metody
        return " Hello World!"; // zwracana wartość przez przeglądarkę
    }
}