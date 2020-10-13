public class HomeTheaterFacade {
    Amplifier amplifier;
    DVDPlayer dvdPlayer;
    CDPlayer cdPlayer;
    Projector projector;
    Screen screen;
    TheaterLights theaterLights;
    PopCornPopper popCornPopper;

    public HomeTheaterFacade () {}

    public void PlayMovie () {
        Amplifier.On ();
    }

    public void EndMovie () {

    }
}
