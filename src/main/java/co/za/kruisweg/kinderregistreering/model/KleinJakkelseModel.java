package co.za.kruisweg.kinderregistreering.model;

public class KleinJakkelseModel {
    private String kidNameAndSurname;
    private String parentNameAndSurname;
    private String cellphoneNumber;
    private String service;

    public KleinJakkelseModel(){

    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getKidNameAndSurname() {
        return kidNameAndSurname;
    }

    public void setKidNameAndSurname(String kidNameAndSurname) {
        this.kidNameAndSurname = kidNameAndSurname;
    }

    public String getParentNameAndSurname() {
        return parentNameAndSurname;
    }

    public void setParentNameAndSurname(String parentNameAndSurname) {
        this.parentNameAndSurname = parentNameAndSurname;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }
}
