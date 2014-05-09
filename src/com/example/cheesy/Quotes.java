package com.example.cheesy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quotes {
	private static final List<Quote> quotes = new ArrayList<>();
	private static Random random = new Random();

	// @formatter:off
    static {
        quotes.add(Quote.q("Poets have been mysteriously silent on the subject of cheese.", "G.K. Chesterton"));
        quotes.add(Quote.q("How can you govern a country which has 246 varieties of cheese?","Charles de Gaulle"));
        quotes.add(Quote.q("The early bird gets the worm, but the second mouse gets the cheese.","Willie Nelson"));
        quotes.add(Quote.q("Give me a good sharp knife and a good sharp cheese and I’m a happy man.","George R.R. Martin"));
        quotes.add(Quote.q("What happens to the hole when the cheese is gone?","Bertolt Brecht"));
        quotes.add(Quote.q("You have to be a romantic to invest yourself, your money, and your time in cheese.","Anthony Bourdain"));
        quotes.add(Quote.q("Life is great. Cheese makes it better.","Avery Aames"));
        quotes.add(Quote.q("Age is something that doesn't matter, unless you are a cheese.","Luis Bunuel"));
    }
	// @formatter:on

	public static Quote get() {
		return quotes.get(random.nextInt(quotes.size()));
	}
}
