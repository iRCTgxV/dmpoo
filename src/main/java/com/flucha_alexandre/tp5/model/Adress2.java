package com.flucha_alexandre.tp5.controller;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//All the data contained in the JSON response
@JsonIgnoreProperties(ignoreUnknown=true)
public class Adress2 {
	public String type;
	public String version;
	public Feature features[];
	public String attribution;
	public String licence;
	public String query;
	public int limit;
    public String type;
	public Geometry geometry;
	public Properties properties;
    public String type;
	public double coordinates[];
    public String label;
	public double score;
	public String housenumber;
	public String id;
	public String type;
	public double x;
	public double y;
	public double importance;
	public String name;
	public String postcode;
	public String citycode;
	public String city;
	public String context;
	public String street;
}