package com.shafay.hp.learn_android.programs.display_execute;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import android.widget.TextView;

import com.shafay.hp.learn_android.R;

public class Xml_Parsing extends AppCompatActivity {
    TextView textView;

    private static String getValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml_parsing);
        getSupportActionBar().setTitle("Xml Parsing");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        textView = (TextView) findViewById(R.id.textView1);
        try {
            InputStream is = getAssets().open("file.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(is);

            Element element = doc.getDocumentElement();
            element.normalize();

            NodeList nList = doc.getElementsByTagName("Country");
            for (int i = 0; i < nList.getLength(); i++) {

                Node node = nList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element3 = (Element) node;
                    textView.setText(textView.getText() + "\nId : " + getValue("id", element3) + "\n");
                    textView.setText(textView.getText() + "Name : " + getValue("name", element3) + "\n");
                    textView.setText(textView.getText() + "Capital : " + getValue("capital", element3) + "\n");
                    textView.setText(textView.getText() + "----------------------------------------------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
