//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.09 at 02:26:48 PM BRST 
//


package br.jus.tst.esocial.esquemas.eventos.toxic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="evtToxic">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00}TIdeEveTrab"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00}TEmpregador"/>
 *                   &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00}TIdeVinculoEstag"/>
 *                   &lt;element name="toxicologico">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dtExame">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cnpjLab" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\d{14}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="codSeqExame" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="\w{11}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nmMed" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="70"/>
 *                                   &lt;whiteSpace value="preserve"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nrCRM" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ufCRM" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="AC"/>
 *                                   &lt;enumeration value="AL"/>
 *                                   &lt;enumeration value="AP"/>
 *                                   &lt;enumeration value="AM"/>
 *                                   &lt;enumeration value="BA"/>
 *                                   &lt;enumeration value="CE"/>
 *                                   &lt;enumeration value="DF"/>
 *                                   &lt;enumeration value="ES"/>
 *                                   &lt;enumeration value="GO"/>
 *                                   &lt;enumeration value="MA"/>
 *                                   &lt;enumeration value="MT"/>
 *                                   &lt;enumeration value="MS"/>
 *                                   &lt;enumeration value="MG"/>
 *                                   &lt;enumeration value="PA"/>
 *                                   &lt;enumeration value="PB"/>
 *                                   &lt;enumeration value="PR"/>
 *                                   &lt;enumeration value="PE"/>
 *                                   &lt;enumeration value="PI"/>
 *                                   &lt;enumeration value="RJ"/>
 *                                   &lt;enumeration value="RN"/>
 *                                   &lt;enumeration value="RS"/>
 *                                   &lt;enumeration value="RO"/>
 *                                   &lt;enumeration value="RR"/>
 *                                   &lt;enumeration value="SC"/>
 *                                   &lt;enumeration value="SP"/>
 *                                   &lt;enumeration value="SE"/>
 *                                   &lt;enumeration value="TO"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="indRecusa">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="[N|S]"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
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
    "evtToxic",
    "signature"
})
@XmlRootElement(name = "eSocial", namespace = "http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00")
public class ESocial {

    @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00", required = true)
    protected ESocial.EvtToxic evtToxic;
    @XmlElement(name = "Signature", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtToxic property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtToxic }
     *     
     */
    public ESocial.EvtToxic getEvtToxic() {
        return evtToxic;
    }

    /**
     * Sets the value of the evtToxic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtToxic }
     *     
     */
    public void setEvtToxic(ESocial.EvtToxic value) {
        this.evtToxic = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }


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
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00}TIdeEveTrab"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00}TEmpregador"/>
     *         &lt;element name="ideVinculo" type="{http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00}TIdeVinculoEstag"/>
     *         &lt;element name="toxicologico">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dtExame">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cnpjLab" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\d{14}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="codSeqExame" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="\w{11}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nmMed" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="70"/>
     *                         &lt;whiteSpace value="preserve"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nrCRM" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ufCRM" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="AC"/>
     *                         &lt;enumeration value="AL"/>
     *                         &lt;enumeration value="AP"/>
     *                         &lt;enumeration value="AM"/>
     *                         &lt;enumeration value="BA"/>
     *                         &lt;enumeration value="CE"/>
     *                         &lt;enumeration value="DF"/>
     *                         &lt;enumeration value="ES"/>
     *                         &lt;enumeration value="GO"/>
     *                         &lt;enumeration value="MA"/>
     *                         &lt;enumeration value="MT"/>
     *                         &lt;enumeration value="MS"/>
     *                         &lt;enumeration value="MG"/>
     *                         &lt;enumeration value="PA"/>
     *                         &lt;enumeration value="PB"/>
     *                         &lt;enumeration value="PR"/>
     *                         &lt;enumeration value="PE"/>
     *                         &lt;enumeration value="PI"/>
     *                         &lt;enumeration value="RJ"/>
     *                         &lt;enumeration value="RN"/>
     *                         &lt;enumeration value="RS"/>
     *                         &lt;enumeration value="RO"/>
     *                         &lt;enumeration value="RR"/>
     *                         &lt;enumeration value="SC"/>
     *                         &lt;enumeration value="SP"/>
     *                         &lt;enumeration value="SE"/>
     *                         &lt;enumeration value="TO"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="indRecusa">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[N|S]"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideVinculo",
        "toxicologico"
    })
    public static class EvtToxic {

        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00", required = true)
        protected TIdeEveTrab ideEvento;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00", required = true)
        protected TEmpregador ideEmpregador;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00", required = true)
        protected TIdeVinculoEstag ideVinculo;
        @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00", required = true)
        protected ESocial.EvtToxic.Toxicologico toxicologico;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEveTrab }
         *     
         */
        public TIdeEveTrab getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEveTrab }
         *     
         */
        public void setIdeEvento(TIdeEveTrab value) {
            this.ideEvento = value;
        }

        /**
         * Gets the value of the ideEmpregador property.
         * 
         * @return
         *     possible object is
         *     {@link TEmpregador }
         *     
         */
        public TEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Sets the value of the ideEmpregador property.
         * 
         * @param value
         *     allowed object is
         *     {@link TEmpregador }
         *     
         */
        public void setIdeEmpregador(TEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Gets the value of the ideVinculo property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeVinculoEstag }
         *     
         */
        public TIdeVinculoEstag getIdeVinculo() {
            return ideVinculo;
        }

        /**
         * Sets the value of the ideVinculo property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeVinculoEstag }
         *     
         */
        public void setIdeVinculo(TIdeVinculoEstag value) {
            this.ideVinculo = value;
        }

        /**
         * Gets the value of the toxicologico property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtToxic.Toxicologico }
         *     
         */
        public ESocial.EvtToxic.Toxicologico getToxicologico() {
            return toxicologico;
        }

        /**
         * Sets the value of the toxicologico property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtToxic.Toxicologico }
         *     
         */
        public void setToxicologico(ESocial.EvtToxic.Toxicologico value) {
            this.toxicologico = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


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
         *         &lt;element name="dtExame">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cnpjLab" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\d{14}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="codSeqExame" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="\w{11}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nmMed" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="70"/>
         *               &lt;whiteSpace value="preserve"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nrCRM" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ufCRM" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="AC"/>
         *               &lt;enumeration value="AL"/>
         *               &lt;enumeration value="AP"/>
         *               &lt;enumeration value="AM"/>
         *               &lt;enumeration value="BA"/>
         *               &lt;enumeration value="CE"/>
         *               &lt;enumeration value="DF"/>
         *               &lt;enumeration value="ES"/>
         *               &lt;enumeration value="GO"/>
         *               &lt;enumeration value="MA"/>
         *               &lt;enumeration value="MT"/>
         *               &lt;enumeration value="MS"/>
         *               &lt;enumeration value="MG"/>
         *               &lt;enumeration value="PA"/>
         *               &lt;enumeration value="PB"/>
         *               &lt;enumeration value="PR"/>
         *               &lt;enumeration value="PE"/>
         *               &lt;enumeration value="PI"/>
         *               &lt;enumeration value="RJ"/>
         *               &lt;enumeration value="RN"/>
         *               &lt;enumeration value="RS"/>
         *               &lt;enumeration value="RO"/>
         *               &lt;enumeration value="RR"/>
         *               &lt;enumeration value="SC"/>
         *               &lt;enumeration value="SP"/>
         *               &lt;enumeration value="SE"/>
         *               &lt;enumeration value="TO"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="indRecusa">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[N|S]"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
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
            "dtExame",
            "cnpjLab",
            "codSeqExame",
            "nmMed",
            "nrCRM",
            "ufCRM",
            "indRecusa"
        })
        public static class Toxicologico {

            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00", required = true)
            protected XMLGregorianCalendar dtExame;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00")
            protected String cnpjLab;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00")
            protected String codSeqExame;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00")
            protected String nmMed;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00")
            protected String nrCRM;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00")
            protected String ufCRM;
            @XmlElement(namespace = "http://www.esocial.gov.br/schema/evt/evtToxic/v02_05_00", required = true)
            protected String indRecusa;

            /**
             * Gets the value of the dtExame property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDtExame() {
                return dtExame;
            }

            /**
             * Sets the value of the dtExame property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDtExame(XMLGregorianCalendar value) {
                this.dtExame = value;
            }

            /**
             * Gets the value of the cnpjLab property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCnpjLab() {
                return cnpjLab;
            }

            /**
             * Sets the value of the cnpjLab property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCnpjLab(String value) {
                this.cnpjLab = value;
            }

            /**
             * Gets the value of the codSeqExame property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodSeqExame() {
                return codSeqExame;
            }

            /**
             * Sets the value of the codSeqExame property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodSeqExame(String value) {
                this.codSeqExame = value;
            }

            /**
             * Gets the value of the nmMed property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNmMed() {
                return nmMed;
            }

            /**
             * Sets the value of the nmMed property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNmMed(String value) {
                this.nmMed = value;
            }

            /**
             * Gets the value of the nrCRM property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNrCRM() {
                return nrCRM;
            }

            /**
             * Sets the value of the nrCRM property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNrCRM(String value) {
                this.nrCRM = value;
            }

            /**
             * Gets the value of the ufCRM property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUfCRM() {
                return ufCRM;
            }

            /**
             * Sets the value of the ufCRM property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUfCRM(String value) {
                this.ufCRM = value;
            }

            /**
             * Gets the value of the indRecusa property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIndRecusa() {
                return indRecusa;
            }

            /**
             * Sets the value of the indRecusa property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIndRecusa(String value) {
                this.indRecusa = value;
            }

        }

    }

}
