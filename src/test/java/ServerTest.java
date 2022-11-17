import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ServerTest {

    Server server;

    @BeforeEach
    public void setUp(){
        server = new Server();
    }

    // TODO: test that guest can only get served if over 18
    @Test
    public void over18CanGetServed() {
        Guest guest = new Guest("Zsolt", 23, 400, "No", 75, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isTrue();
    }

    @Test
    public void over18CannotGetServed() {
        Guest guest = new Guest("Richard", 17, 150, "Yes", 55, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();
    }


    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void moneyOver5Pounds () {
        Guest guest = new Guest("Rebecca", 22, 15, "No", 70, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isTrue();
    }
    @Test
    public void moneyUnder5Pounds () {
        Guest guest = new Guest("Caitlin", 23, 2.50, "No", 85, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();
    }

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void notSoberToEnter() {
        Guest guest = new Guest("Harry", 22, 35, "Yes", 25, '$');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();
    }
    @Test
    public void soberToEnter() {
        Guest guest = new Guest("William", 22, 15000, "No", 95, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isTrue();
    }


    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void bannedFromPub () {
        Guest guest = new Guest("Ilya", 21, 1000,"Yes", 2, '$');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();
    }
    @Test
    public void notBannedFromPub () {
        Guest guest = new Guest("Radhika", 23, 250,"No", 82, '£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isTrue();
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void correctCurrency () {
        Guest guest = new Guest("Katie", 90, 75,"No", 82,'£');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isTrue();
    }

    @Test
    public void incorrectCurrency () {
        Guest guest = new Guest("Paula", 45, 120,"No", 65,'$');
        Boolean result = server.canServeGuest(guest);
        assertThat(result).isFalse();
    }


    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink



    //  (give server a list of drinks (strings) it can make)

}
