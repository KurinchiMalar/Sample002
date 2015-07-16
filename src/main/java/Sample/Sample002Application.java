package Sample;


import org.apache.commons.lang.StringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sample002Application implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(Sample002Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Kurinchi - HelloWorld!!");
        System.out.println(StringUtils.abbreviate("This is a string to abbreviate",5,20));
    }
}
