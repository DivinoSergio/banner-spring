package br.com.mendes.banner_code;

import com.github.lalyos.jfiglet.FigletFont;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class BannerCodeApplication {

	public static void main(String[] args) {
		SpringApplication app =  new SpringApplication(BannerCodeApplication.class);
		app.setBanner(new CustomBanner());
		app.run(args);
	}

	static class CustomBanner implements Banner {
		@Override
		public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
			try {
				String linha1 = FigletFont.convertOneLine("DS Mendes 2025");
				String linha2 = "      )))";
				String linha3 = "     (oo)";
				String linha4 = "-ooO--()--Ooo-";
				out.println(linha1);
				out.println(linha2);
				out.println(linha3);
				out.println(linha4);
			} catch (Exception e) {
				out.println("Erro ao gerar o banner");
			}
		}
	}
}
