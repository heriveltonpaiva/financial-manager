package br.com.financial.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.financial.domain.Expense;
import br.com.financial.domain.Fuel;
import br.com.financial.domain.FuelType;
import br.com.financial.domain.PaymentMode;
import br.com.financial.repository.FuelRepository;

@SpringBootApplication
@ComponentScan(basePackages = { "br.com.financial.service", "br.com.financial.controller" })
@EnableJpaRepositories(basePackages = { "br.com.financial.repository" })
@EntityScan(basePackages = "br.com.financial.domain")
public class FinancialApplication {

	@Autowired
	private FuelRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(FinancialApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			System.out.println("Financial Application was started!");

			Expense e = new Expense();
			e.setValue(12);
			e.setPaymentMode(PaymentMode.DEBIT);

			Fuel f = new Fuel();
			f.setCurrentKM(10000);
			f.setType(FuelType.GASOLINE);
			f.setValueByLiter(3D);
			f.setValueTotal(12);
			f.setExpense(e);

			repository.save(f);

			System.out.println(f.toString());
		};
	}
}
