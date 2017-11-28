package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Shutdown Thread!");
				System.out.flush();
			}
		};
		System.out.println("Adding Shutdown Hook");
		Runtime.getRuntime().addShutdownHook(thread);
		SpringApplication.run(Application.class, args);
	}
}
