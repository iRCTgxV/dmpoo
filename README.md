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