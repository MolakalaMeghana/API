package com.example.demo2.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class person {
    private  int person_id;
    private  String person_name;
    private  String Address;
    public person()
    {
        super();
    }
    public person(@JsonProperty("person_id") int person_id,
                @JsonProperty("person_name") String person_name,
                @JsonProperty("Address") String Address)
    {
        this.person_id=person_id;
        this.person_name=person_name;
        this.Address=Address;
    }
    //getter methods
    public int getId()
    {
        return person_id;
    }
    public String getPerson_name()
    {
        return person_name;
    }
    public String getAddress()
    {
        return Address;
    }

    


}


