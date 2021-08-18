Attempted QA1-4 & QD.

For the project framework, SpringBoot is used.
Test Units are found in AnimalMappingApplicationTests.

For the design of objects, 
There are 4 interfaces: CanFly, CanWalk, CanSwim, CanSing.

All objects (Fish, Birds) are subclass of Animal.

Since not all birds can fly, Birds object does not implements CanFly.
I created 2 subclass of Bird: Flyable & Non Flyable Birds.
Duck, Parrots are subclass of FLyable Birds and Chicken is subclass of Non Flyable Birds.

Rooster is a type of Chicken.
In my design, I did not specify another object for Rooster.
But rather, created an instance variable to differentiate between male and female chickens.

Similarly for Parrots, 
I did not create another object for the different type of parrots living with different entities.
But rather, created an instance variable to differentiate the different entities the parrot is living with.
There is a map storing the entity and the corresponding sound.
For scalability, when there are additional entities added, we just have to update the map.


For counting of number of animals that can fly, walk, sing, swim, 
I checked if the animal object is an instance of the interface and added it to a count.