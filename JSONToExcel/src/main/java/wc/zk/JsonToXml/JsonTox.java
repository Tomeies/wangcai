package wc.zk.JsonToXml;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map.Entry;
import java.util.Set;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import com.google.gson.*;
/**
 * Json转换xml文件保存
 * 使用dom4j包中的方法完成
 *
 * @author 周楷
 * @version 1.0.0
 * @date 2022-11-03 14:13:00
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2022-11-03      zk           v1.0.0               新建
 **/
public class JsonTox {
    private static final String STR_JSON = "{\"stakeapply\":{\"voltageLevel\":\"AC00062\",\"stakeList\":{\"stake\":[{\"stakeAssetNO\":45754745,\"otherStakeTypeRemark\":\"xxx\",\"stationId\":\"547547547547\"},{\"stakeAssetNO\":34325325322,\"otherStakeTypeRemark\":\"xxx\",\"stationId\":\"52354645462\"}]},\"otherStationTypeRemark\":\"xxx\",\"stationAddr\":\"哈哈\",\"custLists\":{\"custList\":{\"custId\":\"7547547547\",\"custPhone\":13666666666,\"contactMode\":1}},\"principalList\":{\"principal\":[{\"principalName\":121212,\"principalType\":1},{\"principalName\":12121233,\"principalType\":1}]}}}";

    /**
     * 将json字符串转换成xml
     *
     * @param json
     *            json字符串
     * @param parentElement
     *            xml根节点
     * @throws Exception
     */
    public static Element jsonToXml(String json, Element parentElement) throws Exception {
        JsonObject jsonObject = new JsonParser().parse(json).getAsJsonObject();
        Element ee = toXml(jsonObject, parentElement, null);
        return ee;
    }

    /**
     * 将json字符串转换成xml
     *
     * @param jsonElement
     *            待解析json对象元素
     * @param parentElement
     *            上一层xml的dom对象
     * @param name
     *            父节点
     */
    public static Element toXml(JsonElement jsonElement, Element parentElement, String name) {
        if (jsonElement instanceof JsonArray) {
            //是json数据，需继续解析
            JsonArray sonJsonArray = (JsonArray)jsonElement;
            for (int i = 0; i < sonJsonArray.size(); i++) {
                JsonElement arrayElement = sonJsonArray.get(i);
                toXml(arrayElement, parentElement, name);
            }
        }else if (jsonElement instanceof JsonObject) {
            //说明是一个json对象字符串，需要继续解析
            JsonObject sonJsonObject = (JsonObject) jsonElement;
            Element currentElement = null;
            if (name != null) {
                currentElement = parentElement.addElement(name);
            }
            Set<Entry<String, JsonElement>> set = sonJsonObject.entrySet();
            for (Entry<String, JsonElement> s : set) {
                toXml(s.getValue(), currentElement != null ? currentElement : parentElement, s.getKey());
            }
        } else {
            //说明是一个键值对的key,可以作为节点插入了
            addAttribute(parentElement, name, jsonElement.getAsString());
        }
        return parentElement;
    }

    /**
     *
     * @param element   父节点
     * @param name      子节点的名字
     * @param value     子节点的值
     */
    public static void addAttribute(Element element, String name, String value) {
        //增加子节点，并为子节点赋值
        Element el = element.addElement(name);
        el.addText(value);

    }
    public static void main(String[] args) throws Exception {

        Document document = DocumentHelper.createDocument();
        Element root =  document.addElement("stakeapply"); //默认根节点
        Element el = jsonToXml(STR_JSON, root);
        System.out.println(el.asXML());
        try {
            //生成xml文件
            String fileName = "test.xml";
            OutputFormat format = OutputFormat.createPrettyPrint();
            format.setEncoding("UTF-8"); // 指定XML编码
            format.setExpandEmptyElements(true);//自动添加闭合标签
            document.setXMLEncoding("UTF-8");
            //指定文件路径，名字，格式
            XMLWriter writer = new XMLWriter(
                    new FileOutputStream(new File("D:" + File.separator + fileName)), format);
            writer.write(document);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*
    json串
    {
        "stakeapply": {
            "voltageLevel": "AC00062",
            "stakeList": {
                "stake": [
                    {
                        "stakeAssetNO": 45754745,
                        "otherStakeTypeRemark": "xxx",
                        "stationId": "547547547547"
                    },
                    {
                        "stakeAssetNO": 34325325322,
                        "otherStakeTypeRemark": "xxx",
                        "stationId": "52354645462"
                    }
                ]
            },
            "otherStationTypeRemark": "xxx",
            "stationAddr": "哈哈",
            "custLists": {
                "custList": {
                    "custId": "7547547547",
                    "custPhone": 13666666666,
                    "contactMode": 1
                }
            },
            "principalList": {
                "principal": [
                    {
                        "principalName": 121212,
                        "principalType": 1
                    },
                    {
                        "principalName": 12121233,
                        "principalType": 1
                    }
                ]
            }
        }
    }
    */

    /*
    转换后的xml
    <?xml version="1.0" encoding="UTF-8"?>

    <stakeapply>
      <voltageLevel>AC00062</voltageLevel>
      <stakeList>
        <stake>
          <stakeAssetNO>45754745</stakeAssetNO>
          <otherStakeTypeRemark>xxx</otherStakeTypeRemark>
          <stationId>547547547547</stationId>
        </stake>
        <stake>
          <stakeAssetNO>34325325322</stakeAssetNO>
          <otherStakeTypeRemark>xxx</otherStakeTypeRemark>
          <stationId>52354645462</stationId>
        </stake>
      </stakeList>
      <otherStationTypeRemark>xxx</otherStationTypeRemark>
      <stationAddr>哈哈</stationAddr>
      <custLists>
        <custList>
          <custId>7547547547</custId>
          <custPhone>13666666666</custPhone>
          <contactMode>1</contactMode>
        </custList>
      </custLists>
      <principalList>
        <principal>
          <principalName>121212</principalName>
          <principalType>1</principalType>
        </principal>
        <principal>
          <principalName>12121233</principalName>
          <principalType>1</principalType>
        </principal>
      </principalList>
    </stakeapply>
    */
}