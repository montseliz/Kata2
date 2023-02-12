import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main_Kata2 {

	public static void main(String[] args) {
		
		String [] words = {"duel", "speed", "dule", "car"}; 
		String [] queries = {"spede", "deul", "rac", "acr"}; 
		
		System.out.println(Arrays.deepToString(getSearchResults(words, queries)));
		
	}

	public static String[][] getSearchResults(String[] words, String[] queries) {
	    // Crear una array per emmagatzemar els resultats de les queries
	    String[][] results = new String[queries.length][];

	    for (int i = 0; i < queries.length; i++) {
	        char[] queryChars = queries[i].toCharArray();
	        Arrays.sort(queryChars);
	       
	        List<String> queryResults = new ArrayList<>();

	        for (String word : words) {
	            char[] wordChars = word.toCharArray();
	            Arrays.sort(wordChars);

	            // Comparar si la querie es un anagrama d'un word
	            if (Arrays.equals(queryChars, wordChars)) {
	                queryResults.add(word);
	            }
	        }

	        Collections.sort(queryResults);

	        // Assignar els resultats de les queries a l'array results
	        results[i] = queryResults.toArray(new String[0]);
	    }

	    return results;
	}
}
