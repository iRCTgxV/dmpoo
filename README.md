## Etape 5

### Spring Web

Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

### JPA

Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

### Hibernate

JSR-303 validation with Hibernate validator.

### H2

Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.

### DevTools

Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

### ThymeLeaf

A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.


## Etape 13

L'URL d'appel "/greeting" a été spécifié avec l'annotation ```@GetMapping("/greeting")```.

Nous avons choisi le fichier HTML à afficher dans le HelloWorldController à l'aide du paramètre model que l'on précise dans le dossier template.

Le nom est envoyer comme paramètre GET aus serveur web. On voit son nom ```@RequestParam(name="nameGET" ``` dans le HelloWorldController. On passe ensuite ce paramètre à ThymeLeaf, on met sa valeur dans le 'nomTemplate' qu'on accède ensuite dans le HTML ``` ${nomTemplate}```.

## Etape 17

Une table  avec les colonnes ID, CONTENT, CREATION a automatiquement été créée.

## Etape 18

Lors de l'initialisation de l'application, une base de donnée à été créer avec Hibernate avec une table annotée par @Entity, de plus on remarque dans les classes les annotations @Id et @GeneratedValue qui nous indique que Id est une clef primaire et que sa valeur peut être générée automatiquement.

## Etape 20

On tape la requête suivante : ```SELECT * FROM ADDRESS``` toute la table apparait bien

## Etape 23

Marks a constructor, field, setter method, or config method as to be autowired by Spring's dependency injection facilities. (vu dans la doc officielle spring [!doc](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/annotation/Autowired.html))

## Etape 30

Pour utiliser Bootstrap on inclus simplement dans chaque fichier html les lignes suivantes
```<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>  ```
```<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>```




## Using the meteo api

# Call


```curl "https://api-adresse.data.gouv.fr/search/?q=8+bd+du+port&limit=15"``` 

# Response

``` Les attributs retournés sont :

    id : identifiant de l’adresse (clef d’interopérabilité)
    type : type de résultat trouvé
        housenumber : numéro « à la plaque »
        street : position « à la voie », placé approximativement au centre de celle-ci
        locality : lieu-dit
        municipality : numéro « à la commune »
    score : valeur de 0 à 1 indiquant la pertinence du résultat
    housenumber : numéro avec indice de répétition éventuel (bis, ter, A, B)
    name : numéro éventuel et nom de voie ou lieu dit
    postcode : code postal
    citycode : code INSEE de la commune
    city : nom de la commune
    district : nom de l’arrondissement (Paris/Lyon/Marseille)
    oldcitycode : code INSEE de la commune ancienne (le cas échéant)
    oldcity : nom de la commune ancienne (le cas échéant)
    context : n° de département, nom de département et de région
    label : libellé complet de l’adresse
    x : coordonnées géographique en projection légale
    y : coordonnées géographique en projection légale
    importance : indicateur d’importance (champ technique)

```

## Part 2

Il faut une clef d'API afin de l'utiliser
L'url a appeler es la suivante :  [http://api.openweathermap.org/data/2.5/weather]
Elle fonctionne en GET, ses paramètres sont a passer dans l'url ( url + ? param1=val&param2..)
La temperature es dans meteo.temp (on peut avoir aussi une indication avec Meteo.feels_like)
Les previsions se trouve dans Meteo.description