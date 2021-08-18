Attempted QA to D

For the project framework, SpringBoot is used.
Test Units are found in AnimalMappingApplicationTests.

For the design of objects, 
There are 4 interfaces: CanFly, CanWalk, CanSwim, CanSing.

All objects (Fish, Birds) are subclass of Animal.

#A1-2
Since not all birds can fly, Birds object does not implements CanFly.
I created 2 subclass of Bird: Flyable & Non Flyable Birds.
Duck, Parrots are subclass of FLyable Birds and Chicken is subclass of Non Flyable Birds.

#A3
Rooster is a type of Chicken.
In my design, I did not specify another object for Rooster.
But rather, created an instance variable to differentiate between male and female chickens.

#A4
Similarly for Parrots, 
I did not create another object for the different type of parrots living with different entities.
But rather, created an instance variable to differentiate the different entities the parrot is living with.
There is a map storing the entity and the corresponding sound.
For scalability, when there are additional entities added, we just have to update the map.

#B1
Created a fish object that extends Animals and implements CanSwim

#B2 
Since fishes have size and color, these 2 attributes are added to Fish Object.
Shark and Clownfish both then extends Fish Object and inherits these 2 variables.
The variables are initialized in the constructor.
Since making jokes and eating fishes are only unique to the individual object, it is declared as a method in the individual object.

#B3
Created a Dolphin class that implements CanSwim.
Since CanSwim is a independant interface, we can reuse it for Fishes and Dolphins and Ducks without duplicating the codes.

#C1-2
Butterfly implements CanFly.
Caterpillar implements CanWalk.
Butterfly & Caterpillar has a 1 to 1 relationship.

#D
For counting of number of animals that can fly, walk, sing, swim, 
I checked if the animal object is an instance of the interface and added it to a count.