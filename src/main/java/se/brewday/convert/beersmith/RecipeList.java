package se.brewday.convert.beersmith;

import se.brewday.convert.xmladapters.BooleanStringAdapter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = RecipeList.NAME)
public class RecipeList {

    protected static final String NAME = "Recipes";

    @XmlElement(name = "_MOD_")
    private LocalDate modified;

    @XmlElement(name = "Name")
    private String name = NAME; // Ingredients

    @XmlElement(name = "Type")
    private int type; // 7405

    @XmlElement(name = "Dirty")
    @XmlJavaTypeAdapter(BooleanStringAdapter.class)
    private boolean dirty; // 1

    @XmlElement(name = "OwnData")
    @XmlJavaTypeAdapter(BooleanStringAdapter.class)
    private boolean ownData; // 1

    @XmlElement(name = "TID")
    private int tId; // 7182

    @XmlElement(name = "Size")
    public int getSize() {
        return data.size(); // 14
    }

    @XmlElement(name = "_XName")
    private String xName = NAME; // Ingredients

    @XmlElement(name = "Allocinc")
    private int allocInc; // 16

    @XmlElementWrapper(name = "Data")
    @XmlElement(name = "Recipe")
    private List<Recipe> data = new ArrayList<>();

    //<editor-fold desc="Getters and Setters">
    public LocalDate getModified() {
        return modified;
    }

    public void setModified(LocalDate modified) {
        this.modified = modified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isOwnData() {
        return ownData;
    }

    public void setOwnData(boolean ownData) {
        this.ownData = ownData;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String getxName() {
        return xName;
    }

    public void setxName(String xName) {
        this.xName = xName;
    }

    public int getAllocInc() {
        return allocInc;
    }

    public void setAllocInc(int allocInc) {
        this.allocInc = allocInc;
    }

    public List<Recipe> getData() {
        return data;
    }

    public void setData(List<Recipe> data) {
        this.data = data;
    }
    //</editor-fold>
}
