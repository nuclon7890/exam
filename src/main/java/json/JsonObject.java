package json;

import java.util.ArrayList;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {
    private final ArrayList<JsonPair> jsonPairs;


    public JsonObject(JsonPair... jsonPairs) {
        this.jsonPairs = new ArrayList<JsonPair>();
    }

    @Override
    public String toJson() {
        String result = "{";
        for(JsonPair el: jsonPairs) {
            result += "'" + el.key + "':'" + el.value + "',";

        }
        result += "}";
        return result;
    }

    public void add(JsonPair jsonPair) {
        this.jsonPairs.add(jsonPair);
    }

    public Json find(String name) {
        for(JsonPair el: jsonPairs){
            if (name.equals(el.key)){
                return el.key;
            }
        }
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        return null;
    }
}
