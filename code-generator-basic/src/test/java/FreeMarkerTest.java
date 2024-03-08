import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

/**
 * Author: zwz
 * FreeMarker Test
 */
public class FreeMarkerTest {

    @Test
    public void Test() throws IOException, TemplateException {

        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);
        configuration.setDirectoryForTemplateLoading(new File("src/main/resources/template"));
        configuration.setDefaultEncoding("utf-8");

        // Load specified template
        Template template = configuration.getTemplate("demoWeb.html.ftl");

        // Set data model
        Map<String, Object> dataModel = new HashMap<String, Object>();
        dataModel.put("currentYear", 2024);
        List<Map<String, Object>> menuItems = new ArrayList<Map<String, Object>>();
        Map<String, Object> menuItem1 = new HashMap<String, Object>();
        menuItem1.put("url", "https://github.com/not4yazwz");
        menuItem1.put("label", "Github Personal HomePage");
        Map<String, Object> menuItem2 = new HashMap<String, Object>();
        menuItem2.put("url", "https://1458451001@qq.com");
        menuItem2.put("label", "E-mail");
        menuItems.add(menuItem1);
        menuItems.add(menuItem2);
        dataModel.put("menuItems", menuItems);

        Writer out = new FileWriter("demoWeb.html");
        template.process(dataModel, out);

        out.close();
    }
}
