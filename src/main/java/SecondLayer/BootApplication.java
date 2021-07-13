package SecondLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BootApplication implements CommandLineRunner {

	@Value("${my.sample.application.property}")
	private String myAppProps;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {

		SpringApplication.run(BootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(myAppProps);

		jdbcTemplate.execute("Drop table carSample");
		jdbcTemplate.execute("create table carSample(\n" +
				"\tid int auto_increment primary key,\n" +
				"\tbrand varchar(50),\n" +
				"\tmodel varchar(50),\n" +
				"\tprice double\n" +
				"\t)");
		jdbcTemplate.execute("insert into carSample (brand, model, price) values ('Audi','Q5', 70002.0)");

	}
}
