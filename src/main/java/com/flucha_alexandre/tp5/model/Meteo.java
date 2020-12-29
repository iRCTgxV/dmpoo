package com.flucha_alexandre.tp5.controller;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
//sae as Adress2 we copy all the field from the JSON (see doc)
public class Meteo {
	public double lat;
	public double lon;
    public double temp;
	public double feels_like;
	public int pressure;
	public int humidity;
	public int temp_min;
	public int temp_max;
	public int sea_level;
	public int grnd_level;
    public int type;
	public int id;
	public double message;
	public String country;
	public int sunrise;
	public int sunset;
    public int id;
	public String main;
	public String description;
	public String icon;
    public Coordinates coord;
	public Weather[] weather;
	public String base;
	public Main main;
	public int visibility;
	public Wind wind;
	public HashMap<String, Double> rain;
	public HashMap<String, Double> snow;
	public HashMap<String, Integer> clouds;
	public int dt;
	public Sys sys;
	public int timezone;
	public int id;
	public String name;
	public int cod;
    public double speed;
	public int deg;
	public double gust;
}