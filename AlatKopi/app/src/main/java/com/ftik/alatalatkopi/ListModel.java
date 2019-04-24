package com.ftik.alatalatkopi;

public class ListModel {

    
    private String CompanyName="";
    private String Image="";
    private String Url="";
    private String Address="";
    private  int ID=0;
    
    
     
    /*********** Set Methods ******************/
     
    public void setCompanyName(String CompanyName)
    {
        this.CompanyName = CompanyName;
    }
     
    public void setImage(String Image)
    {
        this.Image = Image;
    }
     
    public void setUrl(String Url)
    {
        this.Url = Url;
    }

    public void setAddress(String address)
    {
        this.Address = address;
    }


    public void setID(int id)
    {
        this.ID = id;
    }
     
    /*********** Get Methods ****************/
     
    public String getCompanyName()
    {
        return this.CompanyName;
    }
     
    public String getImage()
    {
        return this.Image;
    }
 
    public String getUrl()
    {
        return this.Url;
    }

    public String getAddress()
    {
        return this.Address;
    }


    public int getID()
    {
        return this.ID;
    } 
}