package extend.util.external;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import extend.util.Util;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author isayan
 */
public class JsonUtil {

    public static String stringify(JsonElement jsonElement) {
        return prettyJson(jsonElement, false);
    }

    public static JsonElement parse(String jsonElementString)  throws JsonSyntaxException {
        JsonParser jp = new JsonParser();
        return jp.parse(jsonElementString);
    }

    public static String prettyJson(String jsonString) throws IOException {
        return prettyJson(jsonString, true);
    }
    
    public static String prettyJson(String jsonElementString, boolean pretty)  throws JsonSyntaxException {
        return prettyJson(parse(jsonElementString), pretty);
    }

    public static String prettyJson(JsonElement jsonElement, boolean pretty) {
        if (pretty) {
            Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().serializeNulls().create();
            return gson.toJson(jsonElement);
        } else {
            Gson gson = new GsonBuilder().disableHtmlEscaping().serializeNulls().create();
            return gson.toJson(jsonElement);
        }
    }

    public static DefaultTreeModel toJsonTreeModel(JsonElement jsonElement) {
        DefaultMutableTreeNode rootJson = new DefaultMutableTreeNode("JSON");
        DefaultTreeModel model = new DefaultTreeModel(rootJson);
        toJsonTreeNode(jsonElement, rootJson);
        return model;
    }

    private static void toJsonTreeNode(JsonElement jsonElement, DefaultMutableTreeNode parentNode) {
        if (jsonElement.isJsonObject()) {
            DefaultMutableTreeNode node = new DefaultMutableTreeNode("{}");
            parentNode.add(node);
            JsonObject jsonObject = (JsonObject) jsonElement;
            Set<Map.Entry<String, JsonElement>> set = jsonObject.entrySet();
            for (Map.Entry<String, JsonElement> s : set) {
                JsonElement value = s.getValue();
                if (value.isJsonNull()) {
                    DefaultMutableTreeNode jsonKeySet = new DefaultMutableTreeNode(s);
                    node.add(jsonKeySet);
                } else if (value.isJsonPrimitive()) {
                    DefaultMutableTreeNode jsonKeySet = new DefaultMutableTreeNode(s);
                    node.add(jsonKeySet);
                } else {
                    DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(s.getKey());
                    node.add(childNode);
                    toJsonTreeNode(value, childNode);
                }
            }
        } else if (jsonElement.isJsonArray()) {
            JsonArray jsonArray = (JsonArray) jsonElement.getAsJsonArray();
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonElement value = jsonArray.get(i);
                toJsonTreeNode(value, parentNode);
            }
        } else if (jsonElement.isJsonNull()) {
            DefaultMutableTreeNode jsonKeySet = new DefaultMutableTreeNode(jsonElement);
            parentNode.add(jsonKeySet);
        } else if (jsonElement.isJsonPrimitive()) {
            DefaultMutableTreeNode jsonKeySet = new DefaultMutableTreeNode(jsonElement);
            parentNode.add(jsonKeySet);
        }

    }

    private final static Pattern JSON_TYPE = Pattern.compile("[\\s\r\n]*((\\[(.*)\\])|(\\{(.*)\\}))[\\s\r\n]*", Pattern.DOTALL);
    
    public static boolean isJson(String jsonString) {
        Matcher m = JSON_TYPE.matcher(jsonString);
        try {
            if (m.lookingAt()) {
                JsonUtil.prettyJson(jsonString, false);
                return true;
            } else {
                return false;
            }        
        } catch (JsonSyntaxException ex) {
            return false;
        }
    }
    
    public static void saveToJson(File fo, Object bean, boolean exludeFields) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder().serializeNulls();
        if (exludeFields) {
            gsonBuilder = gsonBuilder.excludeFieldsWithoutExposeAnnotation();
        }        
        Gson gson = gsonBuilder.create();
        String jsonString = gson.toJson(bean);
        Util.bytesToFile(Util.encodeMessage(jsonString, StandardCharsets.UTF_8), fo);
    }

    public static <T> T loadFromJson(File fi, Class<T> classOfT, boolean exludeFields) throws IOException {
        Gson gson = new GsonBuilder().serializeNulls().excludeFieldsWithoutExposeAnnotation().create();
        String jsonString = Util.decodeMessage(Util.bytesFromFile(fi), StandardCharsets.UTF_8);
        return gson.fromJson(jsonString, classOfT);
    }

}
