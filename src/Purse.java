import java.util.HashMap;
import java.util.Map;

public class Purse {
    public HashMap<Denomination, Integer> cash = new HashMap<>();

    public void add(Denomination type, int num)
        {
            int money = 0;

            if(!cash.containsKey(type)){               ///Checks to see if the value is there
                cash.put(type, num);                   ///if not, it just puts it on the map
                money += num;
            }
            else {                                     /* If so, then whatever the number originally stored
                                                          in the value for its respective key gets added to the
                                                          new amount specified. Said new amount then gets pushed
                                                          alongside the type of bill/coin*/
                int amount = 0;
                int originalVal = cash.get(type);

                amount += originalVal;
                cash.put(type, amount);
            }
        }

        public double remove(Denomination type, int num)
        {
            double leftover = 0.0;

            if(!cash.containsKey(type)){                //inverse of add, but this time returns whatever the
                                                        //leftover is
                leftover = 0.0;
                return leftover;
            }
            else{
                int originalVal = cash.get(type);

                leftover -= originalVal;
                cash.put(type, (int)leftover);

            }

            return leftover;
        }

        public double getValue(){
            double contents = 0.0;

            if(cash.containsKey(Denomination.quarter)) {
                contents += (Denomination.quarter.amt() * cash.get(Denomination.quarter));
            }
            if(cash.containsKey(Denomination.dime)) {
                contents+=(Denomination.dime.amt() * cash.get(Denomination.dime));
                }
            if(cash.containsKey(Denomination.penny)) {                       /*a series of if statements figuring out if
                                                                  each type of denomination exists within the
                                                                  hashmap. If so, it adds its value (penny=.01)
                                                                  to contents*/
                contents+=(Denomination.penny.amt() * cash.get(Denomination.penny));
            }
            if(cash.containsKey(Denomination.nickel)) {
                contents+=(Denomination.nickel.amt() * cash.get(Denomination.nickel));
            }
            if(cash.containsKey(Denomination.ones)) {
                contents+=Denomination.ones.amt() * cash.get(Denomination.ones);
            }
            if(cash.containsKey(Denomination.fives)) {
                contents+=Denomination.fives.amt() * cash.get(Denomination.fives);
            }
            if(cash.containsKey(Denomination.tens)) {
                contents+=Denomination.tens.amt() * cash.get(Denomination.tens);
            }
            if(cash.containsKey(Denomination.twenties)) {
                contents+=Denomination.twenties.amt() * cash.get(Denomination.twenties);
            }
            if(cash.containsKey(Denomination.fifties)){
                contents+=Denomination.fifties.amt() * cash.get(Denomination.fifties);
            }
            if(cash.containsKey(Denomination.hundreds)) {
                contents+=Denomination.hundreds.amt() * cash.get(Denomination.hundreds);
            }


            return contents;
        }

        public String toString() {
            String statement = "A purse containing " + getValue() + " has:\n";
            for (Map.Entry<Denomination, Integer> den : cash.entrySet()){
                statement += den.getValue() + " " + den.getKey().name()+"\n";
            }
            return statement;
        }

}