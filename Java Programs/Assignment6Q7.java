import java.util.HashMap;
import java.util.Map;

public class Assignment6Q7 {

interface ConvertKeyValueToString{
public String convertKeyValueToString(HashMap<String, Integer>map);
    }

public static  ConvertKeyValueToString convertKeyValueToString(){
return (map)->{
String result="";
for(Map.Entry<String,Integer>mp: map.entrySet()){
String key = mp.getKey();
int value = mp.getValue();

result += key + Integer.toString(value);
            }
return result;
        };
    }

public static void main(String[] args) {
HashMap<String, Integer>hashMap = new HashMap<>();

hashMap.put("Adisri",1);
hashMap.put("Atharva",2);
hashMap.put("Pratik",3);
hashMap.put("Anjali",4);
hashMap.put("Harsh",5);

System.out.println("String after append key-value all pairs into a single string:\n");

System.out.println(convertKeyValueToString().convertKeyValueToString(hashMap));
    }
}
