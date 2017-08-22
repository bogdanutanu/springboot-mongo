### Spring Boot Example

Example project using SpringBoot and MongoDB to store info about Tunes.

## MongoDB SetUp

Spring Boot will use the *test* database by default, and it'll try to connect to the local machine on the default port:

`use test`

Create a collection for Tunes by inserting one element:

`db.tune.insertOne({title: "Highway to Hell", length: 208, genre: "Hard Rock"})`