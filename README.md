# Facade Design Pattern
> The facade takes a complex subsystem and makes it easier to use by implementing a reasonable interface.

```java
public class Facade {
    
    Element1 e1;
    Element2 e2;
    Element3 e3;

    public Facade(Element1 e1,
                    Element2 e2,
                    Element3 e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    public void behavior1() {

    }

    public void behavior2() {
        
    }

}

```

## Code Up Close

- The facade holds variables for the classes in the subsystem.
- It implements methods to provide users access to complicated behaviors from the subsystem in a simple manner.


## TODO:
Implement the following classes with their respective methods:

- HomeTheaterFacade
    - PlayMovie: Sets up and plays the movie, takes the movie title as a parameter.
    - EndMovie: Stops the movie and shuts off all electronics.
- Amplifier
    - On: Turns on the amplifier.
    - Off: Turns on the amplifier.
    - SetSource: Sets the source of the amplifier to the DVD or CD.
    - SetVolume: Sets the volume of the amplifier to a value.
- DVDPlayer
    - On: Turns the DVDPlayer on.
    - Off: Turns the DVDPlayer off.
    - Stop: Stops the DVDPlayer.
    - Eject: Ejects the DVD.
- CDPlayer
    - On: Turns the CDPlayer on.
    - Off: Turns the CDPlayer off.
    - Stop: Stops the CDPlayer.
    - Eject: Ejects the CD.
- Projector
    - On: Turns the projector on.
    - Off: Turns the prpjector off.
- Screen
    - Down: Rolls the screen down to start a projection.
    - Up: Rolls the screen up.
- TheaterLights
    - On: Turns the lights.
    - Dim: Dims the lights to a percentage.
- PopcornPopper
    - On: Turns the popper on.
    - Off: Turns the popper off.
    - Pop: Makes popcorn, requires popper to be on.

## Tests:
- HomeTheaterTest: Create a class to test both methods from the HomeTheaterFacade class.
  