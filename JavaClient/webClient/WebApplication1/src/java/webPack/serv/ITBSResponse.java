
package webPack.serv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ITBSResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "itbsResult"
})
@XmlRootElement(name = "ITBSResponse")
public class ITBSResponse {

    @XmlElement(name = "ITBSResult")
    protected String itbsResult;

    /**
     * Gets the value of the itbsResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITBSResult() {
        return itbsResult;
    }

    /**
     * Sets the value of the itbsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITBSResult(String value) {
        this.itbsResult = value;
    }

}
