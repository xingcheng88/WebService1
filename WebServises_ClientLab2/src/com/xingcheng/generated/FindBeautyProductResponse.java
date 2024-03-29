package com.xingcheng.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author XingCheng
 * @date 13.06.2019
 *       <p>
 *       Java class for findBeautyProductResponse complex type.
 * 
 *       <p>
 *       The following schema fragment specifies the expected content contained
 *       within this class.
 * 
 *       <pre>
 * &lt;complexType name="findBeautyProductResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://lab1.xingcheng.com/}beautyProduct" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 *       </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findBeautyProductResponse", propOrder = { "_return" })
public class FindBeautyProductResponse {

	@XmlElement(name = "return")
	protected List<BeautyProduct> _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the return property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getReturn().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link BeautyProduct
	 * }
	 * 
	 * 
	 */
	public List<BeautyProduct> getReturn() {
		if (_return == null) {
			_return = new ArrayList<BeautyProduct>();
		}
		return this._return;
	}

}
