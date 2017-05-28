package story.wordFrequencies;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordFrequenciesTest {

	WordFrequencies Frequency = new WordFrequencies();
	
	@Test
	public void test() {
		Frequency.tester();
		Frequency.findMax();
	}

}
