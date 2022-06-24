# Movie-Ranking-System
System for ranking adding movies/stars and analysis of this system



GUI of the system:


<img width="513" alt="correctLogin" src="https://user-images.githubusercontent.com/79667938/175536725-5bb9a2fd-9de6-4f20-8eb5-5438ab177cc2.png">
<img width="484" alt="incorrectLogin" src="https://user-images.githubusercontent.com/79667938/175536754-03e1d54f-cf1d-49d6-b34e-2dd17571561b.png">
<img width="512" alt="functions" src="https://user-images.githubusercontent.com/79667938/175536791-de3135bb-d05e-4b95-a9ca-6d57e1885e10.png">
<img width="476" alt="addmovie" src="https://user-images.githubusercontent.com/79667938/175536809-a2d10b74-f12f-4c76-baea-520f2af1e896.png">
<img width="443" alt="movie added" src="https://user-images.githubusercontent.com/79667938/175536819-8f083114-2954-4625-b95d-de38243e117c.png">
<img width="404" alt="add star" src="https://user-images.githubusercontent.com/79667938/175536839-f3c0e3a2-df8a-4422-8079-70c47564cd70.png">
<img width="398" alt="not in movies" src="https://user-images.githubusercontent.com/79667938/175536891-0e7ee746-8c18-4dd4-beeb-8b63f14706f0.png">
<img width="398" alt="addr rating" src="https://user-images.githubusercontent.com/79667938/175536897-a07566f6-d39e-490c-b788-f6b6fb0e399a.png">
<img width="400" alt="showMovie" src="https://user-images.githubusercontent.com/79667938/175536911-5c6f1691-39d4-4678-807e-b9111cc9eaf3.png">
<img width="400" alt="noOfWatch" src="https://user-images.githubusercontent.com/79667938/175536917-96447341-5f96-495e-9202-3cde3e8c21f9.png">
<img width="666" alt="image2" src="https://user-images.githubusercontent.com/79667938/175536962-d79d3b7a-29e2-448e-90ae-678c82dc8b3a.png">
<img width="534" alt="genre" src="https://user-images.githubusercontent.com/79667938/175536972-070d91d8-c55b-457e-9e3e-e26fc3e2ad85.png">
<img width="416" alt="showMovieofstar" src="https://user-images.githubusercontent.com/79667938/175536987-c761b896-7f7e-4ed1-8ba1-3acf7a8a2bd0.png">


System Requirements:

Functional:
-The system should keep user information.
-The system should give information to the user if username is invalid. -The system should keep movie information in text file.
-The system should keep star information in text file.
-The system should keep rating information in text file.
-The system should check related files before adding new data to avoid duplicates. -The system should give information when a new data added/failed to add to 





Nonfunctional:
-Every page of the system should be visible within a 1 seconds. -The system should be accessible to web users.
-The system should give warnings to the users within a 1 seconds. -The system must handle 40 transactions per second.
-User information will be secured.


Use Case Analysis of the system:

3.1. Actors
User: The person using the system and choosing functions to perform.
System: Favorite Movies system that show notifications to the user, prints informations and writes, reads, updates data file.
3.2. Scenarios
Scenario 1:
Scenario name: Show movie
Actors: Ahmet :User,System
Flow of events:
1- Ahmet, activates the “Show movie” function by clicking on it on his laptop.
2- Ahmet entered the movie id that he wants to get to JTextField.After he entered id he click to the “Show” JButton.
3- System search submitted movie id in the Movies file and prints information about the movie. Scenario 2:
Scenario Name: Login to the system
Actors: Ahmet:User, System
Flow of events:
1- Ahmet opens the system and login page gets visible on his desktop.
2- Ahmet enter his username wrongly to the JTextField and click the login JButton. 3- System prints the fail message and new Login page gets visible on his desktop.
3.3. Use Cases
Complete Use Case Forms:
1)
Use case Name: Add Movie
Actor: User,System
Description: This use case describes how user add movie to the Movies File.
Preconditions:
-Movies datastore is available and online
-User is authenticated.
Normal Course:
1- User enters the movie informations(Movie id, title, length, genre, studio name, producer name, short description) to the JTextFields on Add Movie page.
2- After entering all informations user clicks “Submit” JButton.
3- If at least one JTextField is invalid system gives error message and use case ends.Other wise it
continues with step 4.
4- System checks the Movies file and search entered movie id to avoid any duplicates.If the movie already exists it gives error message and use case ends.Other wise it continues with step 5.
5- System writes entered movie information to the file and use case ends. Postconditions:
1- Movie is stored.
2- Notification sent to the user.
42- Ahmet entered the movie id that he wants to get to JTextField.After he entered id he click to the “Show” JButton.
3- System search submitted movie id in the Movies file and prints information about the movie. Scenario 2:
Scenario Name: Login to the system
Actors: Ahmet:User, System
Flow of events:
1- Ahmet opens the system and login page gets visible on his desktop.
2- Ahmet enter his username wrongly to the JTextField and click the login JButton. 3- System prints the fail message and new Login page gets visible on his desktop.
3.3. Use Cases
Complete Use Case Forms:
1)
Use case Name: Add Movie
Actor: User,System
Description: This use case describes how user add movie to the Movies File.
Preconditions:
-Movies datastore is available and online
-User is authenticated.
Normal Course:
1- User enters the movie informations(Movie id, title, length, genre, studio name, producer name, short description) to the JTextFields on Add Movie page.
2- After entering all informations user clicks “Submit” JButton.
3- If at least one JTextField is invalid system gives error message and use case ends.Other wise it
continues with step 4.
4- System checks the Movies file and search entered movie id to avoid any duplicates.If the movie already exists it gives error message and use case ends.Other wise it continues with step 5.
5- System writes entered movie information to the file and use case ends. Postconditions:
1- Movie is stored.
2- Notification sent to the user.
2)
Use case Name: Add Star
Actor: User,System
Description: This use case describes how user add star to the Stars File.
Preconditions:
-Stars datastore is available and online
-User is authenticated.
Normal Course:
1- User enters the star informations(movie id, movie title, movie year, name surname) to the JTextFields on Add Star page.
2- After entering all informations user clicks “Submit” JButton.
3- If at least one JTextField is invalid system gives error message and use case ends.Other wise it
continues with step 4.
4- System checks the Stars file and search entered movie id .If the movie exists it writes Star information to the file.Other wise system gives error message and use case ends.
Postconditions:
1- Movie is stored.
2- Notification sent to the user.
3)
Use case Name: Show movies of star
Actor: User,System
Description: This use case describes how system shows movies of star. Preconditions:
-Stars datastore is available and online
-Movies datastore is available and online
-User is authenticated.
Normal Course:
1- User enters the star name to the JTextField and clicks the submit JButton.
2- If star name is invalid new show movies of star page is gets visible and use case returns step 1.Otherwise continues with step 3.
3-System search the entered star name in stars file.If star is not in the file it gives error message end use case ends.Otherwise continues with step 4.
4- System gets stars movie id and search in the movies file, and prints the movie information to the JTextArea.
Postconditions:
1-Notification sent to the user.
Basic Use Case Forms:
4)
Use case Name: Add person/rating
Actor: User,System
Description:This use case describes how user adds person/rating to the file.
Preconditions:
-User is authenticated.
-Person/Ratings datastore is available and online.
5)
Use case Name: Show movie
Actor: User,System
Description:This use case describes how system shows movie to user.
Preconditions:
-User is authenticated.
-Movies datastore is available and online.
6)
Use case Name: Increase the number of times watched
Actor: User,System
Description:This use case describes how system updates the number of times watched for movie. Preconditions:
-User is authenticated.
-Movies datastore is available and online.
7)
Use case Name: Show image
Actor: User
Description:This use case describes how user start shows movie poster as image to the user. Preconditions:
-User is authenticated.
-Posters datastore is available and online.
8)
Use case Name: Show title of highest rated movie for genre
Actor: User
Description:This use case describes how user
Preconditions:
-User is authenticated.
-Movies datastore is available and online.
9)
Use case Name: Enter the username
Actor: User
Description:This use case describes how user enters username
Preconditions:
-User has open the system
10)
Use case Name: Check username
Actor: System
Description:This use case describes how system checks username
Preconditions:
-User entered the username.
-User datastore is available and online.
11)
Use case Name: Write to the movies file
Actor: System
Description:This use case describes how system writes to movie information to the movies file
Preconditions:
-User is authenticated.
-Movies datastore is available and online.
12)
Use case Name: Write to the stars file
Actor: System
Description:This use case describes how system writes to star information to the stars file
Preconditions:
-User is authenticated.
-Stars datastore is available and online.
13)
Use case Name: Write to the person/rating file
Actor: System
Description:This use case describes how system writes to person/rating information to the person/rating file
Preconditions:
-User is authenticated.
-Person/rating datastore is available and online.
14)
Use case Name: Print movie info
Actor: System
Description:This use case describes how system prints movie information. Preconditions:
-User is authenticated.
-Movies datastore is available and online.
15)
Use case Name: Update movie file
Actor: System
Description:This use case describes how system updates movie file
Preconditions:
-User is authenticated.
-Movies datastore is available and online.
16)
Use case Name: Print movie image.
Actor: System
Description:This use case describes how system prints image of poster movie Preconditions:
-User is authenticated.
-Movies datastore is available and online.
17)
Use case Name: Print genre
Actor: System
Description:This use case describes how system prints highest rated movie of specific genre. Preconditions:
-User is authenticated.
-Movies datastore is available and online.

3.4. Relationships among Actors and Use Cases
User actor associated with login, choose function, add movie, add star, add person/rating, show movie increase number of times watched, show image, show title of highest rated movie for genre, show movies of star use cases.
System actor associated with write to the file, print movie info, update movie file, print movie image, print genre, print stars of movie, check username use cases.




Sequence Diagram Analysis:

(Login) User enters username, if username is valid system sends notification send to the user and user enters system.
(Add movie) User enters required information about movie to add, if system writes to file without fail sends notification to the user.
(Add star) User enters required information about star to add, if system writes to file without fail sends notification to the user.
(Add person and rating) User enters required information about person and rating to add, if system writes to file without fail sends notification to the user.
(Show movie) User enters movie id and system reads movies file if the id is in the file, it shows that movie information.
(Times watched) User enters new times watched number and system writes and updates the file. (Show poster) User enters movie id and system read movies file if the id is int the file, it shows that movie poster as image.
(Movies of star) User enter star name and system read stars file if the title is in the file, it shows movies that star play.



Class Diagram Analysis:

Person class holds name attribute and addPerson operation.
User Class is also a Person, and it holds username attribute and loginButtonActionPerformed operation. User class associated with Movie, Star, PersonAndRating classes.
Movie class holds movieId, title, length, genre, studioName, producerName, shortDescription, avgRating and numwatched as attribute. And it has operation addMovie, showMovie, showMoviePoster, showTitleofGenre.
Star class holds movieId, movieTitle, movieYear, nameSurname as attribute and addStar, showMoviesOfStar as operation.
PersonAndRating class holds attributes movieId, nameSurname, relation and rating and addRating operation.


8. Conclusion and Future Work
In this project ı tried to develop a movie program which allows user to perform operations about movies, stars, movie ratings.And in the report part ı make use case analysis and UML diagrams of system.
As future work FavoriteMovies system can be develop for mobile program too.Improvements in the design part can be done.(Backgrounds, page designs).And for the data files for Movie,Star,Rating can be transform to the SQL database.






