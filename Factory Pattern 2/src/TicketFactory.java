public class TicketFactory {
    public  Airlines bookTicket(String route)
    {
        if(route==null)
            return null;

        else if(route.equalsIgnoreCase("Bangladesh-Palestine"))
        {
            return new CrescentAir();
        }

        else if(route.equalsIgnoreCase("Palestine-Russia"))
        {
            return new MoonAir();
        }

        else if(route.equalsIgnoreCase("Bangladesh-Russia"))
        {
            return new SunAir();
        }

        else return null;
    }
}
