public class Server {

    public boolean canServeGuest(Guest guest) {


        if (guest.getAge() < 18) {
            return false;
        }

        if (guest.getBanned() == "Yes") {
            return false;
        }

        if (guest.getMoney() < 5) {
            return false;

        }
        if (guest.getSoberScale() < 50) {
            return false;

        }
        if (guest.getCurrency() != '£') {
            return false;
        }




        return true;
    }



}