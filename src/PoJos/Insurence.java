package PoJos;

public class Insurence {

    Integer insurenceId;

    String insurenceProvider;

    Boolean deathCovered;

    String typeOfInsurence;

    public Insurence(Integer insurenceId, String insurenceProvider, Boolean deathCovered, String typeOfInsurence) {
        this.insurenceId = insurenceId;
        this.insurenceProvider = insurenceProvider;
        this.deathCovered = deathCovered;
        this.typeOfInsurence = typeOfInsurence;
    }

    public Integer getInsurenceId() {
        return insurenceId;
    }

    public void setInsurenceId(Integer insurenceId) {
        this.insurenceId = insurenceId;
    }

    public String getInsurenceProvider() {
        return insurenceProvider;
    }

    public void setInsurenceProvider(String insurenceProvider) {
        this.insurenceProvider = insurenceProvider;
    }

    public Boolean getDeathCovered() {
        return deathCovered;
    }

    public void setDeathCovered(Boolean deathCovered) {
        this.deathCovered = deathCovered;
    }

    public String getTypeOfInsurence() {
        return typeOfInsurence;
    }

    public void setTypeOfInsurence(String typeOfInsurence) {
        this.typeOfInsurence = typeOfInsurence;
    }
}
