import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.math.BigInteger;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Example JSON data
        String jsonData1 = "{\"keys\":{\"key1\": \"value1\"}}";
        String jsonData2 = "{\"keys\":{\"key2\": \"value2\"}}";

        // Parse the JSON data
        Gson gson = new Gson();
        JsonObject testCase1 = gson.fromJson(jsonData1, JsonObject.class);
        JsonObject testCase2 = gson.fromJson(jsonData2, JsonObject.class);

        // Example usage
        System.out.println("Secret from TestCase1: " + findSecret(testCase1));
        System.out.println("Secret from TestCase2: " + findSecret(testCase2));
    }

    private static BigInteger findSecret(JsonObject testCase) {
        JsonObject keys = testCase.getAsJsonObject("keys");
        BigInteger result = BigInteger.ZERO;

        // Process each key-value pair
        for (Map.Entry<String, JsonElement> entry : keys.entrySet()) {
            JsonObject root = entry.getValue().getAsJsonObject();
            // Dummy logic to add BigInteger values (replace with your logic)
            result = result.add(BigInteger.valueOf(root.toString().length()));
        }

        return result;
    }
}

