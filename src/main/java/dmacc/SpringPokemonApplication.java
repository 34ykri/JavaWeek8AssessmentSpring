package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Pokemon;
import dmacc.beans.Type;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PokemonRepository;

@SpringBootApplication
public class SpringPokemonApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringPokemonApplication.class, args);
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		Pokemon p = appContext.getBean("pokemon", Pokemon.class);
//		System.out.println(p.toString());
	}
	@Autowired
	PokemonRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Pokemon p = appContext.getBean("pokemon", Pokemon.class);
		p.setLevel(99);
		repo.save(p);
		Pokemon s = new Pokemon("Dragonite", "Jihyo", 75);
		Type sType = new Type("Dragon", "Flying");
		s.setType(sType);
		repo.save(s);
		Pokemon u = new Pokemon("Umbreon", "Hyeinseo", 76);
		Type uType = new Type("Dark");
		u.setType(uType);
		repo.save(u);
		
		List<Pokemon> myPokemon = repo.findAll();
		for(Pokemon pk: myPokemon) {
			System.out.println(pk.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
