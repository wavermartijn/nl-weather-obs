
package org.waver.dutchobs.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "locatienaam",
    "parameternaam",
    "par",
    "loc",
    "net",
    "waarde",
    "eenheid",
    "category",
    "iconsubscript",
    "meettijd",
    "link_wn",
    "ids",
    "location",
    "categoryDescription",
    "icon"
})
public class Feature {

    @JsonProperty("locatienaam")
    private String locatienaam;
    @JsonProperty("parameternaam")
    private String parameternaam;
    @JsonProperty("par")
    private String par;
    @JsonProperty("loc")
    private String loc;
    @JsonProperty("net")
    private String net;
    @JsonProperty("waarde")
    private String waarde;
    @JsonProperty("eenheid")
    private String eenheid;
    @JsonProperty("category")
    private Integer category;
    
    //@JsonProperty("iconnr")
    @JsonIgnore
    private Integer iconnr;
    
    //@JsonProperty("popupsize")
    @JsonIgnore
    private String popupsize;
    
    @JsonIgnore
    private String graphsize;
    @JsonIgnore
    private Object waardeh10a;
    @JsonIgnore
    private Object waardeh10v;
    @JsonIgnore
    private Object waardeq10v;
    @JsonProperty("iconsubscript")
    @JsonIgnore
    private String iconsubscript;
    @JsonProperty("meettijd")
    private String meettijd;
    @JsonProperty("link_wn")
    @JsonIgnore
    private Object linkWn;
    @JsonProperty("ids")
    private List<String> ids = new ArrayList<String>();
    @JsonProperty("location")
    private Location location;
    @JsonProperty("categoryDescription")
    private String categoryDescription;
    @JsonProperty("icon")
    @JsonIgnore
    private Icon icon;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The locatienaam
     */
    @JsonProperty("locatienaam")
    public String getLocatienaam() {
        return locatienaam;
    }

    /**
     * 
     * @param locatienaam
     *     The locatienaam
     */
    @JsonProperty("locatienaam")
    public void setLocatienaam(String locatienaam) {
        this.locatienaam = locatienaam;
    }

    /**
     * 
     * @return
     *     The parameternaam
     */
    @JsonProperty("parameternaam")
    public String getParameternaam() {
        return parameternaam;
    }

    /**
     * 
     * @param parameternaam
     *     The parameternaam
     */
    @JsonProperty("parameternaam")
    public void setParameternaam(String parameternaam) {
        this.parameternaam = parameternaam;
    }

    /**
     * 
     * @return
     *     The par
     */
    @JsonProperty("par")
    public String getPar() {
        return par;
    }

    /**
     * 
     * @param par
     *     The par
     */
    @JsonProperty("par")
    public void setPar(String par) {
        this.par = par;
    }

    /**
     * 
     * @return
     *     The loc
     */
    @JsonProperty("loc")
    public String getLoc() {
        return loc;
    }

    /**
     * 
     * @param loc
     *     The loc
     */
    @JsonProperty("loc")
    public void setLoc(String loc) {
        this.loc = loc;
    }

    /**
     * 
     * @return
     *     The net
     */
    @JsonProperty("net")
    public String getNet() {
        return net;
    }

    /**
     * 
     * @param net
     *     The net
     */
    @JsonProperty("net")
    public void setNet(String net) {
        this.net = net;
    }

    /**
     * 
     * @return
     *     The waarde
     */
    @JsonProperty("waarde")
    public String getWaarde() {
        return waarde;
    }

    /**
     * 
     * @param waarde
     *     The waarde
     */
    @JsonProperty("waarde")
    public void setWaarde(String waarde) {
        this.waarde = waarde;
    }

    /**
     * 
     * @return
     *     The eenheid
     */
    @JsonProperty("eenheid")
    public String getEenheid() {
        return eenheid;
    }

    /**
     * 
     * @param eenheid
     *     The eenheid
     */
    @JsonProperty("eenheid")
    public void setEenheid(String eenheid) {
        this.eenheid = eenheid;
    }

    /**
     * 
     * @return
     *     The category
     */
    @JsonProperty("category")
    public Integer getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    @JsonProperty("category")
    public void setCategory(Integer category) {
        this.category = category;
    }

    

    /**
     * 
     * @param iconnr
     *     The iconnr
     */
    @JsonProperty("iconnr")
    public void setIconnr(Integer iconnr) {
        this.iconnr = iconnr;
    }

    

    /**
     * 
     * @param popupsize
     *     The popupsize
     */
    @JsonProperty("popupsize")
    public void setPopupsize(String popupsize) {
        this.popupsize = popupsize;
    }

    

    /**
     * 
     * @param graphsize
     *     The graphsize
     */
    @JsonProperty("graphsize")
    public void setGraphsize(String graphsize) {
        this.graphsize = graphsize;
    }

    

    /**
     * 
     * @param waardeh10a
     *     The waardeh10a
     */
    @JsonProperty("waardeh10a")
    public void setWaardeh10a(Object waardeh10a) {
        this.waardeh10a = waardeh10a;
    }

    

    /**
     * 
     * @param waardeh10v
     *     The waardeh10v
     */
    @JsonProperty("waardeh10v")
    public void setWaardeh10v(Object waardeh10v) {
        this.waardeh10v = waardeh10v;
    }

    

    /**
     * 
     * @param waardeq10v
     *     The waardeq10v
     */
    @JsonProperty("waardeq10v")
    public void setWaardeq10v(Object waardeq10v) {
        this.waardeq10v = waardeq10v;
    }

    /**
     * 
     * @return
     *     The iconsubscript
     */
    @JsonProperty("iconsubscript")
    public String getIconsubscript() {
        return iconsubscript;
    }

    /**
     * 
     * @param iconsubscript
     *     The iconsubscript
     */
    @JsonProperty("iconsubscript")
    public void setIconsubscript(String iconsubscript) {
        this.iconsubscript = iconsubscript;
    }

    /**
     * 
     * @return
     *     The meettijd
     */
    @JsonProperty("meettijd")
    public String getMeettijd() {
        return meettijd;
    }

    /**
     * 
     * @param meettijd
     *     The meettijd
     */
    @JsonProperty("meettijd")
    public void setMeettijd(String meettijd) {
        this.meettijd = meettijd;
    }

    

    /**
     * 
     * @param linkWn
     *     The link_wn
     */
    @JsonProperty("link_wn")
    public void setLinkWn(Object linkWn) {
        this.linkWn = linkWn;
    }

    /**
     * 
     * @return
     *     The ids
     */
    @JsonProperty("ids")
    public List<String> getIds() {
        return ids;
    }

    /**
     * 
     * @param ids
     *     The ids
     */
    @JsonProperty("ids")
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    /**
     * 
     * @return
     *     The location
     */
    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The categoryDescription
     */
    @JsonProperty("categoryDescription")
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * 
     * @param categoryDescription
     *     The categoryDescription
     */
    @JsonProperty("categoryDescription")
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }


    /**
     * 
     * @param icon
     *     The icon
     */
    @JsonProperty("icon")
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
