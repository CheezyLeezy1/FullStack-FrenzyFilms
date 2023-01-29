package dev.groovymoovy.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

/*
This is a Java class representing a movie document in a MongoDB collection.
The class is annotated with Spring Data's @Document annotation, indicating that it should be mapped to a MongoDB collection named "movies".
The class uses Lombok @Data, @AllArgsConstructor, and @NoArgsConstructor annotations to generate various constructors and getters/setters.
It has several fields including imdbId, title, releaseDate, trailerLink, poster, genres, backDrops and reviewIds.
The reviewIds field is a list of Review objects and represents a one-to-many relationship between a movie and its reviews.The field is annotated with Spring Data's @DocumentReference annotation, indicating that it references other documents in the MongoDB collection.
*/

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    private ObjectId id;

    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;

    private List<String> genres;
    private List <String> backdrops;

    @DocumentReference
    private List <Review> reviewIds; //1 to many relationship - embedded relationships
}
