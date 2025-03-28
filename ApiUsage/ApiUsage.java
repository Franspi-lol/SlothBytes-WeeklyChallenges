package ApiUsage;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiUsage {

    /**
     * Retrieves Pokémon data from the PokeAPI based on the given ID.
     *
     * @param id The ID of the Pokémon to retrieve.
     * @return A string representation of the Pokémon object, or "ERROR" if an error occurs.
     * @author Franco Bernardele
     */
    public static String useAPI(int id) {
        String apiURL = "https://pokeapi.co/api/v2/pokemon/" + id;
        try {
            URL url = new URL(apiURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                Gson gson = new Gson();
                Pokemon pokemon = gson.fromJson(response.toString(), Pokemon.class);
                return pokemon.toString();
            } else {
                return "ERROR";
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main() {
        System.out.println(useAPI(5)); // Output: Pokemon{name='charmeleon', id=5, height=11} or ERROR
    }
}

class Pokemon {
    private final String name;
    private final int id;
    private final int height;

    @Override
    public String toString() {
        return "Pokémon{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", height=" + height +
                '}';
    }

    public Pokemon(String name, int id, int height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }




}