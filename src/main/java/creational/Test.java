package creational;

import creational.abstractFactroy.*;
import creational.factory.WebsiteType;
import creational.factory.c_Website;
import creational.factory.e_WebsiteFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Calendar;

public class Test {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //1>> example factory pattern
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        //factory
        c_Website shopWebsite = e_WebsiteFactory.getWebsite(WebsiteType.SHOPPING);
        System.out.println(shopWebsite.getPages());
        c_Website blogWebsite = e_WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(blogWebsite.getPages());

        //2>> abstract factory: factory of factories
        //example abstract factory pattern
        String xml="<document><body><stock>AAPl</stock></body></document>";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xml.getBytes());
        DocumentBuilderFactory abstractDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilderFactory = abstractDocumentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilderFactory.parse(byteArrayInputStream);
        document.normalizeDocument();
        System.out.println("Root="+document.getDocumentElement().getNodeName());
        System.out.println("abstractDocumentBuilderFactory: "+abstractDocumentBuilderFactory);//DocumentBuilderFactoryImpl
        System.out.println("documentBuilderFactory: "+documentBuilderFactory);//DocumentBuilderImpl

        System.out.println(
                CardFactory.getCardFactory(CardType.DEBIT).getCardVariationFactory(DebitCardVariety.VISA).getCard(0));
        System.out.println(
                CardFactory.getCardFactory(CardType.CREDIT).getCardVariationFactory(CreditCardVariety.AMEX).getCard(10000));

    }

}
