
public class HomeTheaterFacade{
    public HomeTheater cdPlayer;
    public HomeTheater dvdPlayer;
    public HomeTheater popcornPopper;
    public HomeTheater projector;
    public HomeTheater screen;
    public HomeTheater amplifier;

    public HomeTheaterFacade(){
        cdPlayer = new CDPlayer();
        dvdPlayer = new DVDPlayer();
        popcornPopper = new PopcornPopper();
        projector = new Projector();
        screen = new Projector();
        amplifier = new Amplifier();
    }
}
